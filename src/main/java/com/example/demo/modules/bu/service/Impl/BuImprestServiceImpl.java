package com.example.demo.modules.bu.service.Impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.common.utils.PageUtils;
import com.example.demo.common.utils.Query;
import com.example.demo.modules.bu.dao.BuImprestDao;
import com.example.demo.modules.bu.entity.BuImprestEntity;
import com.example.demo.modules.bu.service.BuImprestService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("buImprestService")
public class BuImprestServiceImpl extends ServiceImpl<BuImprestDao,BuImprestEntity> implements BuImprestService{
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BuImprestEntity> page = this.selectPage(
                new Query<BuImprestEntity>(params).getPage(),
                new EntityWrapper<BuImprestEntity>()
        );

        return new PageUtils(page);
    }

}
