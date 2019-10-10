package com.example.demo.modules.mmall.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.demo.modules.mmall.common.ServerResponse;
import com.example.demo.modules.mmall.entiry.UserEntity;

public interface IUserService extends IService<UserEntity> {
    ServerResponse login(String username, String password);
}
