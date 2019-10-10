package com.example.demo.modules.mmall.service.Impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.example.demo.modules.mmall.common.ResponseCode;
import com.example.demo.modules.mmall.common.ServerResponse;
import com.example.demo.modules.mmall.dao.UserMapper;
import com.example.demo.modules.mmall.entiry.UserEntity;
import com.example.demo.modules.mmall.service.IUserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("iUserService")
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements IUserService {

    @Transactional
    public ServerResponse<String> login(String username,String password){
        if(StringUtils.isBlank(username) || StringUtils.isBlank(password)){
            return ServerResponse.createByErrorCodeMessage(ResponseCode.ILLEGAL_ARGUMENT.getCode(),ResponseCode.ILLEGAL_ARGUMENT.getDesc());
        }
        int rowCount = baseMapper.selectCount(new EntityWrapper<UserEntity>().eq("username",username));
        if (rowCount ==0){
            return ServerResponse.createByErrorMessage("用户名不存在");
        }
        return null;
    }
}
