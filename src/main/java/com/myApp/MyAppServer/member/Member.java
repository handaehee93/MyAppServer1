package com.myApp.MyAppServer.member;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class Member {
    private Long id;

    @NotEmpty
    private String loginId;

    @NotEmpty
    private String name;

    @NotEmpty
    @Size(min = 8, message = "비밀번호는 최소 8자 이상이어야 합니다.")
    private String password;
}
