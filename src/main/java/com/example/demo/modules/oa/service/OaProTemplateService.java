package com.example.demo.modules.oa.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.demo.common.utils.R;
import com.example.demo.modules.oa.entity.OaProTemplateEntity;

public interface OaProTemplateService extends IService<OaProTemplateEntity> {
    /**
     * 获取列表
     * @return
     */
    R list();
}
