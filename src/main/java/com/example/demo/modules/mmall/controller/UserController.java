package com.example.demo.modules.mmall.controller;

import com.example.demo.modules.mmall.common.ServerResponse;
import com.example.demo.modules.mmall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService iUserService;

    @PostMapping("/login")
    public ServerResponse<String> login(HttpSession session,String username,String password){
        return iUserService.login(username,password);
    }
}
