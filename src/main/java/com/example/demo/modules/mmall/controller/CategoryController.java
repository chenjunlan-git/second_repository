package com.example.demo.modules.mmall.controller;

import com.example.demo.modules.mmall.common.Const;
import com.example.demo.modules.mmall.common.ServerResponse;
import com.example.demo.modules.mmall.entiry.UserEntity;
import com.example.demo.modules.mmall.service.ICategoryService;
import com.example.demo.modules.mmall.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class CategoryController {
    @Autowired
    private IUserService iUserService;
    @Autowired
    private ICategoryService iCategoryService;

    public ServerResponse add(HttpSession session, @RequestParam(value = "parentId",defaultValue = "0") Integer parentId, String categoryName){
        UserEntity currentUser = (UserEntity) session.getAttribute(Const.CURRENT_USER);
        if (currentUser ==null){
            return ServerResponse.createByErrorMessage("用户未登录，请登录");
        }

        ServerResponse response = iUserService.checkAdmin(currentUser);
        if (response.isSuccess()){
            return iCategoryService.add(parentId,categoryName);
        }else {
            return ServerResponse.createByErrorMessage("不是管理员，无管理权限");
        }
    }



}
