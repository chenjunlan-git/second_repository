package com.example.demo.modules.bu.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.demo.common.utils.PageUtils;
import com.example.demo.modules.bu.entity.BuUserAgencyEntity;
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
public interface BuUserAgencyService extends IService<BuUserAgencyEntity> {

    PageUtils queryPage(Map<String, Object> params);

    //根据用户查询负责的机构
    List<Map> queryAgencyByUserId( @Param("user_id") Long user_id );
}

