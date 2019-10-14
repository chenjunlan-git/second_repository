package com.example.demo.modules.mmall.common;

public class Const {
    public static final String CURRENT_USER = "current_user";
    public static final String EMAIL = "email";
    public static final String USERNAME = "username";
    public static final String TOKEN = "token";
   public interface Role{
       int ROLE_ADMIN = 1; //管理员
       int ROLE_CUSTOMER = 0;//普通用户
    }

    public interface CategoryStatus{
       int ON_SALE = 1;//在售状态
    }
}
