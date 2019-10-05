package com.example.demo.modules.oa.service.Impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.common.utils.R;
import com.example.demo.modules.oa.dao.OaProTemplateDao;
import com.example.demo.modules.oa.entity.OaProTemplateEntity;
import com.example.demo.modules.oa.service.OaProTemplateService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("oaProTemplateService")
public class OaProTemplateServiceImpl extends ServiceImpl<OaProTemplateDao, OaProTemplateEntity> implements OaProTemplateService {
    @Override
    public R list() {
        List<OaProTemplateEntity> list = this.selectList(new EntityWrapper<>());
        return R.ok().put("list",list);
    }
}
