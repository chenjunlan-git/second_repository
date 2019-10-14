package com.example.demo.modules.mmall.service;

import com.baomidou.mybatisplus.service.IService;
import com.example.demo.modules.mmall.common.ServerResponse;
import com.example.demo.modules.mmall.entiry.UserEntity;

public interface IUserService extends IService<UserEntity> {
    /**
     * 用户登录
     * @param username
     * @param password
     * @return
     */
    ServerResponse<UserEntity> login(String username, String password);

    /**
     * 用户注册
     * @param userEntity
     * @return
     */
    ServerResponse<String> register(UserEntity userEntity);

    /**
     * 检验功能
     * @param type
     * @param str
     * @return
     */
    ServerResponse checkValid(String type, String str);

    /**
     * 获取用户信息
     * @param userId
     * @return
     */
    ServerResponse getUserInfo(Integer userId);

    /**
     * 查询提示问题
     * @param username
     * @return
     */
    ServerResponse forgetPassword(String username);

    /**
     * 检验问题的答案
     * @param username
     * @param question
     * @return
     */
    ServerResponse checkAnswer(String username, String question,String answer);

    /**
     * 通过token校验，重置密码
     * @param passwordNew
     * @param forToken
     * @param username
     * @return
     */
    ServerResponse forget(String username,String passwordNew, String forToken);

    /**
     * 通过旧密码修改密码
     * @param currentUser
     * @param passwordOld
     * @param passwordNew
     * @return
     */
    ServerResponse updatePassword(UserEntity currentUser, String passwordOld, String passwordNew);

    /**
     * 更新用户信息
     * @param userEntity
     * @return
     */
    ServerResponse updateInfo(UserEntity userEntity);

    /**
     * 校验是否是管理员
     * @param userEntity
     * @return
     */
    ServerResponse checkAdmin(UserEntity userEntity);
}

