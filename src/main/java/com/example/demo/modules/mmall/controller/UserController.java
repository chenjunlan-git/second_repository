package com.example.demo.modules.mmall.controller;

import com.example.demo.modules.mmall.common.Const;
import com.example.demo.modules.mmall.common.ServerResponse;
import com.example.demo.modules.mmall.entiry.UserEntity;
import com.example.demo.modules.mmall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.handler.UserRoleAuthorizationInterceptor;

import javax.servlet.http.HttpSession;

/**
 * 登录相关
 */

@RestController
public class UserController {
    @Autowired
    private IUserService iUserService;

    /**
     * 用户登录
     *
     * @param session
     * @param username 用户名
     * @param password 密码
     * @return
     */
    @PostMapping("mmall/login")
    public ServerResponse login(HttpSession session, String username, String password) {
        ServerResponse response = iUserService.login(username, password);
        if (response.isSuccess()) {
            session.setAttribute(Const.CURRENT_USER, response.getData());
        }
        return iUserService.login(username, password);
    }

    /**
     * 用户注册
     *
     * @param userEntity
     * @return
     */
    @PostMapping("mmall/register")
    public ServerResponse<String> register(UserEntity userEntity) {
        return iUserService.register(userEntity);
    }

    /**
     * 登出
     *
     * @param session
     * @return
     */
    @PostMapping("mmall/logout")
    public ServerResponse logout(HttpSession session) {
        session.removeAttribute(Const.CURRENT_USER);
        return ServerResponse.createBySuccess();
    }

    /**
     * 检验功能
     *
     * @param type username or email
     * @param str
     * @return
     */
    @PostMapping("mmall/check")
    public ServerResponse checkValid(String type, String str) {
        return iUserService.checkValid(type, str);
    }

    /**
     * 获取用户信息
     *
     * @param session
     * @param userId  用户Id
     * @return
     */
    @PostMapping("/mmall/info")
    public ServerResponse getUserInfo(HttpSession session, Integer userId) {
        UserEntity currentUser = (UserEntity) session.getAttribute(Const.CURRENT_USER);
        if (currentUser == null) {
            return ServerResponse.createByErrorMessage("用户未登录，请登录");
        }
        return iUserService.getUserInfo(userId);
    }

    /**
     * 查询提示问题
     *
     * @param username
     * @return
     */
    @PostMapping("/mmall/getQuestion")
    public ServerResponse forgetPassword(String username) {
        return iUserService.forgetPassword(username);
    }


    /**
     * 检验问题的答案并返回token
     *
     * @param username
     * @param question
     * @param answer
     * @return
     */
    @PostMapping("/mmall/checkAnswer")
    public ServerResponse checkAnswer(String username, String question, String answer) {
        return iUserService.checkAnswer(username, question, answer);
    }

    /**
     * 忘记密码
     * 根据token重置密码
     * @param username
     * @param passwordNew
     * @param forToken
     * @return
     */
    @PostMapping("mmall/forget")
    public ServerResponse forgetPassword(String username, String passwordNew, String forToken) {
        return iUserService.forget(username, passwordNew, forToken);
    }

    /**
     * 登录状态的修改密码
     * @param session
     * @param passwordOld
     * @param passwordNew
     * @return
     */
    @PostMapping("mmall/update_password")
    public ServerResponse updatePassword(HttpSession session, String passwordOld, String passwordNew) {
        UserEntity currentUser = (UserEntity) session.getAttribute(Const.CURRENT_USER);
        if (currentUser == null){
            return ServerResponse.createByErrorMessage("用户未登录，请登录");
        }
        return iUserService.updatePassword(currentUser,passwordOld,passwordNew);
    }

    /**
     * 更新用户信息
     * @param session
     * @param userEntity
     * @return
     */
    @PostMapping("/mmall/updateInfo")
    public ServerResponse updateInfo(HttpSession session,UserEntity userEntity){
        UserEntity currentUser = (UserEntity) session.getAttribute(Const.CURRENT_USER);
        if (currentUser == null){
            return ServerResponse.createByErrorMessage("用户未登录，请登录");
        }
        userEntity.setId(currentUser.getId());
        ServerResponse response = iUserService.updateInfo(userEntity);
        if (response.isSuccess()){
            UserEntity userEntity1 = (UserEntity) response.getData();
            userEntity1.setUsername(currentUser.getUsername());
            session.setAttribute(Const.CURRENT_USER,userEntity1);
        }
        return response;
    }
}
