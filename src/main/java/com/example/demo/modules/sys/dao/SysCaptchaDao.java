package com.example.demo.modules.sys.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.demo.modules.sys.entity.SysCaptchaEntity;
import com.example.demo.modules.sys.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysCaptchaDao extends BaseMapper<SysCaptchaEntity> {

}
