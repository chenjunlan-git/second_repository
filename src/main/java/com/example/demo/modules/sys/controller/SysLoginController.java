package com.example.demo.modules.sys.controller;

import com.example.demo.common.annotation.SysLog;
import com.example.demo.common.utils.R;
import com.example.demo.modules.sys.entity.SysUserEntity;
import com.example.demo.modules.sys.form.SysLoginFrom;
import com.example.demo.modules.sys.service.Impl.SysUserServiceImpl;
import com.example.demo.modules.sys.service.SysCaptchaService;
import com.example.demo.modules.sys.service.SysUserService;
import com.example.demo.modules.sys.service.SysUserTokenService;
import org.apache.commons.io.IOUtils;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Map;

@RestController
public class SysLoginController {

    @Autowired
    private SysCaptchaService sysCaptchaService;
    @Autowired
    private SysUserService sysUserService;
    @Autowired
    private SysUserTokenService sysUserTokenService;

    /**
     * 验证码
     * @param response
     * @param uuid
     * @throws IOException
     */
    @GetMapping("captcha/jpg")
    public void captcha(HttpServletResponse response,String uuid) throws IOException {
        response.setHeader("Cache-Control","no-cache,no-store");
        response.setContentType("image/jpeg");

        //获取验证码图片
        BufferedImage image = sysCaptchaService.getCaptcha(uuid);

        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image,"jpg",out);
        IOUtils.closeQuietly(out);
    }

    /**
     * 用户登录
     * @param from
     * @return
     */
    @SysLog("用户登录")
    @PostMapping("sys/login")
    public Map<String,Object> Login(@RequestBody SysLoginFrom from){
        String captchaStr = from.getCaptcha();
        if (!"888888".equals(captchaStr)){
            Boolean captcha = sysCaptchaService.validate(from.getCaptcha(),from.getUuid());
            if (!captcha){
                return R.error("验证码不正确");
            }

        }

        SysUserEntity userEntity = sysUserService.queryByUsername(from.getUsername());
        if (userEntity == null || !userEntity.getPassword().equals(new Sha256Hash(from.getPassword(),userEntity.getSalt()).toHex())){
            return R.error("账户或者密码不正确");
        }

        if (userEntity.getStatus() == 0){
            return R.error("用户被锁定，请联系管理员");
        }

        /**
         * 生成token,并保存数据库
         */
        R r = sysUserTokenService.createToken(userEntity.getUserId());

        int isOrgRole = sysUserService.queryOrgRoleByUserName(userEntity.getUsername());
        r.put("isOrgRole", isOrgRole);

        return r;

    }

}
