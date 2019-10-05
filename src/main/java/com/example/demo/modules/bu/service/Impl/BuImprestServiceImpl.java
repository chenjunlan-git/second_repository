package com.example.demo.modules.bu.service.Impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.modules.bu.dao.BuImprestDao;
import com.example.demo.modules.bu.entity.BuImprestEntity;
import com.example.demo.modules.bu.service.BuImprestService;
import org.springframework.stereotype.Service;

@Service("buImprestService")
public class BuImprestServiceImpl extends ServiceImpl<BuImprestDao,BuImprestEntity> implements BuImprestService{
}
