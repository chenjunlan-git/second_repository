package com.example.demo.modules.mmall.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.demo.modules.mmall.common.ServerResponse;
import com.example.demo.modules.mmall.entiry.CategoryEntity;

public interface ICategoryService extends IService<CategoryEntity> {
    /**
     * 添加商品分类
     * @param parentId 父分类id
     * @param categoryName 分类名称
     * @return
     */
    ServerResponse add(Integer parentId, String categoryName);
}
