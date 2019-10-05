package com.example.demo.modules.sys.service.Impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.common.utils.R;
import com.example.demo.modules.sys.dao.SysUserTokenDao;
import com.example.demo.modules.sys.entity.SysUserTokenEntity;
import com.example.demo.modules.sys.oauth2.TokenGenerator;
import com.example.demo.modules.sys.service.SysUserTokenService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("sysUserTokenService")
public class SysUserTokenServiceImpl extends ServiceImpl<SysUserTokenDao, SysUserTokenEntity> implements SysUserTokenService {
    //12小时后过期
    private static final int EXPIRE = 3600 * 12;

    @Override
    public R createToken(Long userId) {
        //生成token
        String token = TokenGenerator.generateValue();

        //当前时间
        Date now = new Date();

        //过期时间
        Date expireTime = new Date(now.getTime() + EXPIRE * 1000);

        //判断是否生成token
        SysUserTokenEntity tokenEntity = this.selectById(userId);
        if (tokenEntity == null){
            tokenEntity.setUpdateTime(now);
            tokenEntity.setExpireTime(expireTime);
            tokenEntity.setToken(token);
            tokenEntity.setUserId(userId);

            //保存token
            this.insert(tokenEntity);
        }else {
            tokenEntity.setToken(token);
            tokenEntity.setUpdateTime(now);
            tokenEntity.setExpireTime(expireTime);

            //更新token
            this.updateById(tokenEntity);
        }

        R r = R.ok().put("token",token).put("expire",expireTime);

        return r;
    }
}
