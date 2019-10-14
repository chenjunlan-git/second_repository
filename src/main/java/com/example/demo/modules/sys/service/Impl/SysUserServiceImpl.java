package com.example.demo.modules.sys.service.Impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.modules.sys.dao.SysUserDao;
import com.example.demo.modules.sys.entity.SysUserEntity;
import com.example.demo.modules.sys.service.SysUserService;
import org.springframework.stereotype.Service;

@Service("sysUserService")
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUserEntity> implements SysUserService {

    @Override
    public SysUserEntity queryByUsername(String username) {
        SysUserEntity userEntity = baseMapper.queryByUserName(username);
        return userEntity;
    }

    @Override
    public int queryOrgRoleByUserName(String username) {
        return 0;
    }
}
