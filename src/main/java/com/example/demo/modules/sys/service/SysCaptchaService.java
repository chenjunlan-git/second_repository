package com.example.demo.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.demo.modules.sys.entity.SysCaptchaEntity;
import com.google.code.kaptcha.impl.DefaultKaptcha;

import java.awt.image.BufferedImage;

public interface SysCaptchaService extends IService<SysCaptchaEntity> {
    /**
     * 生成验证码
     * @param uuid
     * @return
     */
    BufferedImage getCaptcha(String uuid);

    Boolean validate(String code, String uuid);
}
