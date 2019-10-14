package com.example.demo.modules.mmall.service.Impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.modules.mmall.common.Const;
import com.example.demo.modules.mmall.common.ResponseCode;
import com.example.demo.modules.mmall.common.ServerResponse;
import com.example.demo.modules.mmall.dao.UserMapper;
import com.example.demo.modules.mmall.entiry.UserEntity;
import com.example.demo.modules.mmall.service.IUserService;
import com.example.demo.modules.mmall.util.RedisUtil;
import org.apache.catalina.User;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.rmi.ServerError;
import java.util.*;

@Service("iUserService")
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements IUserService {
    @Autowired
    private RedisUtil redisUtil;

    @Override
    @Transactional
    public ServerResponse<UserEntity> login(String username, String password) {
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            return ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(), ResponseCode.ILLEGAL_ARGUMENT.getDesc());
        }

        int rowCount = baseMapper.selectCount(new EntityWrapper<UserEntity>().eq("username", username));
        if (rowCount == 0) {
            return ServerResponse.createByErrorMessage("用户不存在");
        }

        UserEntity userEntity = baseMapper.queryLogin(username);
        if (!userEntity.getPassword().equals(new Sha256Hash(password, userEntity.getSalt()).toString())) {
            return ServerResponse.createByErrorMessage("密码错误");
        }
        userEntity.setPassword(StringUtils.EMPTY);

        return ServerResponse.createBySuccess("登录成功", userEntity);
    }

    @Override
    @Transactional
    public ServerResponse<String> register(UserEntity userEntity) {
        int count = baseMapper.checkUsername(userEntity.getUsername());
        if (count > 0) {
            return ServerResponse.createByErrorMessage("用户名已存在");
        }

        count = baseMapper.checkEmail(userEntity.getEmail());
        if (count > 0) {
            return ServerResponse.createByErrorMessage("email已存在");
        }

        //用户密码加salt
        String salt = UUID.randomUUID().toString();
        userEntity.setSalt(salt);
        String password = new Sha256Hash(userEntity.getPassword(), salt).toString();
        userEntity.setPassword(password);
        userEntity.setRole(Const.Role.ROLE_CUSTOMER);
        userEntity.setCreateTime(new Date());
        userEntity.setUpdateTime(new Date());
        count = baseMapper.insert(userEntity);

        if (count > 0) {
            return ServerResponse.createBySuccessMessage("注册成功");
        }

        return ServerResponse.createByErrorMessage("注册失败");
    }

    @Override
    @Transactional
    public ServerResponse checkValid(String type, String str) {
        if (StringUtils.isNotBlank(type)) {
            if (StringUtils.equals(Const.USERNAME, type)) {
                int countResult = baseMapper.checkUsername(str);
                if (countResult > 0) {
                    return ServerResponse.createByErrorMessage("用户已存在");
                }
            }
            if (StringUtils.equals(Const.EMAIL, type)) {
                int rowResult = baseMapper.checkEmail(str);
                if (rowResult > 0) {
                    return ServerResponse.createByErrorMessage("email已存在");
                }
            }
        } else {
            return ServerResponse.createByErrorMessage("参数错误");
        }
        return ServerResponse.createBySuccessMessage("检验成功");
    }

    @Override
    public ServerResponse getUserInfo(Integer userId) {
        UserEntity userEntity = baseMapper.selectById(userId);
        if (userEntity == null) {
            return ServerResponse.createByErrorMessage("获取用户信息失败");
        }

        userEntity.setPassword(StringUtils.EMPTY);
        return ServerResponse.createBySuccess(userEntity);
    }

    @Override
    public ServerResponse forgetPassword(String username) {
        int resultCount = baseMapper.checkUsername(username);
        if (resultCount == 0) {
            return ServerResponse.createByErrorMessage("用户不存在");
        }

        String question = baseMapper.queryAnsterByusername(username);
        if (StringUtils.isBlank(question)) {
            return ServerResponse.createByErrorMessage("无法查询到提示问题");
        }
        return ServerResponse.createBySuccess(question);
    }

    @Override
    @Transactional
    public ServerResponse checkAnswer(String username, String question, String answer) {
        int count = baseMapper.checkAnswer(username, question, answer);
        if (count > 0) {
            String forToken = UUID.randomUUID().toString();
            redisUtil.set(Const.TOKEN + username, forToken, 43200);
            return ServerResponse.createBySuccess(forToken);
        }
        return ServerResponse.createByErrorMessage("回答问题的答案错误");
    }

    @Override
    @Transactional
    public ServerResponse forget(String username, String passwordNew, String forToken) {
        if (StringUtils.isBlank(forToken)) {
            return ServerResponse.createByErrorMessage("token过期或无效，请重新传递token");
        }

        String token = String.valueOf(redisUtil.get(Const.TOKEN + username));
        if (StringUtils.isBlank(token)) {
            return ServerResponse.createByErrorMessage("session中token过期或者无效");
        }

        if (org.apache.commons.lang3.StringUtils.equals(token, forToken)) {
            UserEntity userEntity = baseMapper.queryUserEntityByUsername(username);
            String salt = userEntity.getSalt();
            String passwordSalt = new Sha256Hash(passwordNew, salt).toString();
            baseMapper.updatePasswordByUsername(username, passwordSalt);
            return ServerResponse.createBySuccess("修改密码成功");
        }

        return ServerResponse.createByErrorMessage("修改密码失败");
    }

    @Override
    @Transactional
    public ServerResponse updatePassword(UserEntity currentUser, String passwordOld, String passwordNew) {
        if (StringUtils.isBlank(passwordOld)) {
            return ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(), ResponseCode.ILLEGAL_ARGUMENT.getDesc());
        }

        //密码加salt
        String passwordOldSalt = new Sha256Hash(passwordOld, currentUser.getSalt()).toString();

        int count = baseMapper.checkPassword(currentUser.getUsername(), passwordOldSalt);
        if (count == 0) {
            return ServerResponse.createByErrorMessage("旧密码错误");
        }
        UserEntity userEntity = baseMapper.queryUserEntityByUsername(currentUser.getUsername());
        String salt = userEntity.getSalt();
        String passwordNewSalt = new Sha256Hash(passwordNew, salt).toString();
        userEntity.setId(currentUser.getId());
        userEntity.setPassword(passwordNewSalt);
        userEntity.setUpdateTime(new Date());
        int resultCount = baseMapper.updateById(userEntity);
        if (resultCount >0){
            return ServerResponse.createByErrorMessage("修改密码成功");
        }

        return ServerResponse.createByErrorMessage("修改密码失败");
    }

    @Override
    @Transactional
    public ServerResponse updateInfo(UserEntity userEntity) {
        //校验新email数据库是否已存在
        int count = baseMapper.selectEmail(userEntity.getId(),userEntity.getEmail());
        if (count >0){
            return ServerResponse.createByErrorMessage("email已存在");
        }

        UserEntity userUpdate = new UserEntity();
        userUpdate.setId(userEntity.getId());
        userUpdate.setRole(userEntity.getRole());
        userUpdate.setSalt(userEntity.getSalt());
        userUpdate.setAnswer(userEntity.getAnswer());
        userUpdate.setQuestion(userEntity.getQuestion());
        userUpdate.setEmail(userEntity.getEmail());
        userUpdate.setPhone(userEntity.getPhone());
        count = baseMapper.updateById(userUpdate);
        if (count >0){
            return ServerResponse.createBySuccess("更新用户信息成功");
        }
        return ServerResponse.createByErrorMessage("更新用户信息失败");
    }


    /**
     * 检验管理员
     * @param userEntity
     * @return
     */
     public ServerResponse<Object> checkAdmin(UserEntity userEntity){
        if (userEntity.getRole().equals(Const.Role.ROLE_ADMIN)){
            return ServerResponse.createBySuccess();
        }else {
            return ServerResponse.createByError();
        }
     }
}
