package com.example.demo.modules.sys.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.demo.common.utils.R;
import com.example.demo.modules.sys.entity.SysUserTokenEntity;

public interface SysUserTokenService extends IService<SysUserTokenEntity> {
    /**
     * 生成token
     * @param userId
     * @return
     */
    R createToken(Long userId);
}
