package com.example.demo.modules.bu.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.modules.bu.entity.BuPayoffOneEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 单项结算主表
 *
 * @author liuming
 * @email ming.liu@xfktech.com
 * @date 2018-11-05 16:37:33
 */
@Mapper
public interface BuPayoffOneDao extends BaseMapper<BuPayoffOneEntity> {
    //根据ID修改结算单状态
    void updatePayoffStatusById(@Param("id") Integer id, @Param("payoffStatus") Integer payoffStatus);


    String findInvoiceByPayoffOneId(@Param("buPayoffOneId") Integer buPayoffOneId);


    //添加对内结算表时，查询未关联过的对外单项结算表
    List<Map> queryPayoffOneListByYMAgencyId(Map<String, Object> params);
    //制作对内结算表时，查询未关联过的或关联过的对外单项结算表
    List<Map> queryPayoffOneAllListByYMAgencyId(Map<String, Object> params);

}
