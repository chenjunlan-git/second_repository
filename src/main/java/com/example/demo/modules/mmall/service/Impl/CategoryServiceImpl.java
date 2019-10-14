package com.example.demo.modules.mmall.service.Impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.modules.mmall.common.Const;
import com.example.demo.modules.mmall.common.ServerResponse;
import com.example.demo.modules.mmall.dao.CategoryMapper;
import com.example.demo.modules.mmall.entiry.CategoryEntity;
import com.example.demo.modules.mmall.service.ICategoryService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("iCategoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, CategoryEntity> implements ICategoryService {
    @Override
    public ServerResponse add(Integer parentId, String categoryName) {
        if (StringUtils.isBlank(categoryName)){
            return ServerResponse.createByErrorMessage("参数错误");
        }
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setParentId(parentId);
        categoryEntity.setName(categoryName);
        categoryEntity.setStatus(Const.CategoryStatus.ON_SALE);
        categoryEntity.setCreateTime(new Date());
        categoryEntity.setUpdateTime(new Date());
        int count = baseMapper.insert(categoryEntity);
        if (count >0){
            return ServerResponse.createBySuccessMessage("添加分类成功");
        }
        return ServerResponse.createByErrorMessage("添加分类失败");
    }
}
