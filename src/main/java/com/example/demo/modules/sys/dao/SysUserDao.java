package com.example.demo.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.modules.sys.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysUserDao extends BaseMapper<SysUserEntity> {
    /**
     * 通过用户名查询用户信息
     * @param username
     * @return
     */
    SysUserEntity queryByUsername(String username);

}
