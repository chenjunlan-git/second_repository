package com.example.demo.modules.sys.service.Impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.common.XfktechException;
import com.example.demo.modules.sys.dao.SysCaptchaDao;
import com.example.demo.modules.sys.entity.SysCaptchaEntity;
import com.example.demo.modules.sys.service.SysCaptchaService;
import com.example.demo.modules.sys.util.DateUtils;
import com.google.code.kaptcha.Producer;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.image.BufferedImage;
import java.util.Date;

@Service("SysCaptchaService")
public class SysCaptchaServiceImpl extends ServiceImpl<SysCaptchaDao,SysCaptchaEntity> implements SysCaptchaService {
    @Autowired
    private Producer producer;

    @Override
    public BufferedImage getCaptcha(String uuid) {
        if (StringUtils.isBlank(uuid)){
            throw new XfktechException("uuid不能为空");
        }

        //生成文字验证码
        String code = producer.createText();

        //插入数据库记录
        SysCaptchaEntity sysCaptchaEntity = new SysCaptchaEntity();
        sysCaptchaEntity.setCode(code);
        sysCaptchaEntity.setUuid(uuid);
        //5分钟后过期
        sysCaptchaEntity.setExpireTime(DateUtils.addDateMinutes(new Date(),5));
        this.insert(sysCaptchaEntity);

        return producer.createImage(code);
    }

    @Override
    public Boolean validate(String code, String uuid) {
        SysCaptchaEntity sysCaptchaEntity = this.selectOne(new EntityWrapper<SysCaptchaEntity>().eq("uuid",uuid));
        if (sysCaptchaEntity == null){
            return false;
        }

        //删除验证码
        this.deleteById(uuid);

        if (sysCaptchaEntity.getCode().equalsIgnoreCase(code) && sysCaptchaEntity.getExpireTime().getTime() >= System.currentTimeMillis()){
            return true;
        }

        return false;
    }
}
