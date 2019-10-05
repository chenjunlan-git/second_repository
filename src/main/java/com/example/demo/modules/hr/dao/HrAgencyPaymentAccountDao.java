package com.example.demo.modules.hr.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.modules.hr.entity.HrAgencyPaymentAccountEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 机构付款账户表
机构的付款账户信息
 * 
 * @author liuming
 * @email ming.liu@xfktech.com
 * @date 2018-06-11 11:39:54
 */
@Mapper
public interface HrAgencyPaymentAccountDao extends BaseMapper<HrAgencyPaymentAccountEntity> {


    /**
     *按机构ID修改是不是最新新状态
     * @param newest
     * @param bank_account_code
     * @return
     */
    Integer updateNewestByAgencyId(@Param("newest") Integer newest, @Param("agency_id") Integer agency_id);
	
}
