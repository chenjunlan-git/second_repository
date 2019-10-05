package com.example.demo.modules.bu.service.Impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.common.utils.PageUtils;
import com.example.demo.common.utils.Query;
import com.example.demo.modules.bu.dao.BuUserAgencyDao;
import com.example.demo.modules.bu.entity.BuUserAgencyEntity;
import com.example.demo.modules.bu.service.BuUserAgencyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("buUserAgencyService")
public class BuUserAgencyServiceImpl extends ServiceImpl<BuUserAgencyDao, BuUserAgencyEntity> implements BuUserAgencyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BuUserAgencyEntity> page = this.selectPage(
                new Query<BuUserAgencyEntity>(params).getPage(),
                new EntityWrapper<BuUserAgencyEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<Map> queryAgencyByUserId(Long user_id) {
        return baseMapper.queryAgencyByUserId(user_id);
    }

}
