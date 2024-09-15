package com.myApp.MyAppServer.Login.controller;


import com.myApp.MyAppServer.Login.bean.LoginRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LoginController {

    // 하드코딩된 아이디와 비밀번호
    private final String VALID_EMAIL = "test@google.com";
    private final String VALID_PASSWORD = "123";

    @PostMapping("/login")
    public boolean login(@RequestBody LoginRequest loginRequest) {
        System.out.println(loginRequest.getEmail());
        // 입력한 이메일과 비밀번호가 하드코딩된 값과 일치하면 true 반환
        if (VALID_EMAIL.equals(loginRequest.getEmail()) &&
                VALID_PASSWORD.equals(loginRequest.getPassword())) {
            return true;
        } else {
            return false;
        }
    }
}

