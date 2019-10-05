package com.example.demo.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.demo.modules.sys.entity.SysUserEntity;

public interface SysUserService extends IService<SysUserEntity> {

    SysUserEntity queryByUsername(String username);

    int queryOrgRoleByUserName(String username);
}
