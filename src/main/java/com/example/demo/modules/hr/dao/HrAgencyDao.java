package com.example.demo.modules.hr.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.modules.hr.entity.HrAgencyEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface HrAgencyDao extends BaseMapper<HrAgencyEntity> {
    List<Map> queryList(Map<String,Object> map);

    int queryTotal(Map<String, Object> map);

    void updateDelFlag(@Param("ids") Integer[] ids);

    List<Map> newList(Integer userId);
}
