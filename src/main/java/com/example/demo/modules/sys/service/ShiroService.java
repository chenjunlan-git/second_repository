package com.example.demo.modules.sys.service;

import com.example.demo.modules.sys.entity.SysUserEntity;
import com.example.demo.modules.sys.entity.SysUserTokenEntity;

import java.util.Set;

/**
 * @author heyongjie
 * @description shiro相关接口
 * @date 2018/5/2
 * @updater
 */
public interface ShiroService {
    /**
     * 获取用户权限列表
     * @param userId 用户ID
     */
    Set<String> getUserPermissions(long userId);

    SysUserTokenEntity queryByToken(String token);

    /**
     * 根据用户ID，查询用户
     * @param userId
     */
    SysUserEntity queryUser(Long userId);
}
