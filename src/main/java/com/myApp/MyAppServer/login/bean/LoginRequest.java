package com.myApp.MyAppServer.login.bean;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginRequest {
    private String email;
    private String password;

    // 기본 생성자
    public LoginRequest() {}


}
