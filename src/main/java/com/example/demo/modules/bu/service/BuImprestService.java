package com.example.demo.modules.bu.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.demo.common.utils.PageUtils;
import com.example.demo.modules.bu.entity.BuImprestEntity;

import java.util.Map;

public interface BuImprestService extends IService<BuImprestEntity> {
    PageUtils queryPage(Map<String, Object> params);

}
