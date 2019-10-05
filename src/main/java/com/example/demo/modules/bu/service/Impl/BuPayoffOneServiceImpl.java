package com.example.demo.modules.bu.service.Impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.modules.bu.dao.BuPayoffOneDao;
import com.example.demo.modules.bu.entity.BuPayoffOneEntity;
import com.example.demo.modules.bu.service.BuPayoffOneService;
import org.springframework.stereotype.Service;

@Service("buPayoffOneService")
public class BuPayoffOneServiceImpl extends ServiceImpl<BuPayoffOneDao, BuPayoffOneEntity> implements BuPayoffOneService {
}
