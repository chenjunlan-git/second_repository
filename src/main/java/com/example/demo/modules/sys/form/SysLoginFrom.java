package com.example.demo.modules.sys.form;

import lombok.Data;

@Data
public class SysLoginFrom {
    private String username;
    private String password;
    private String captcha;
    private String uuid;
}
