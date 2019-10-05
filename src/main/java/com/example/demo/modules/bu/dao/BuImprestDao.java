package com.example.demo.modules.bu.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.modules.bu.entity.BuImprestEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 预付款结算表
 * 
 * @author liuming
 * @email ming.liu@xfktech.com
 * @date 2018-11-05 16:37:33
 */
@Mapper
public interface BuImprestDao extends BaseMapper<BuImprestEntity> {
    //根据ID修改结算单状态
    void updatePayoffStatusById(@Param("id") Integer id, @Param("payoffStatus") Integer payoffStatus);

}
