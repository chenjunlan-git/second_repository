package com.example.demo.modules.bu.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.modules.bu.entity.BuUserAgencyEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 部门人员分工表
 * 
 * @author liuming
 * @email ming.liu@xfktech.com
 * @date 2018-07-25 18:35:26
 */
@Mapper
public interface BuUserAgencyDao extends BaseMapper<BuUserAgencyEntity> {
    //根据用户查询负责的机构
    List<Map> queryAgencyByUserId(@Param("user_id") Long user_id);
}
