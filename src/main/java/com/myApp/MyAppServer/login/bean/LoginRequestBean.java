package com.myApp.MyAppServer.login.bean;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequestBean {
    private String email;
    private String password;

    // 기본 생성자
    public LoginRequestBean() {}


}
