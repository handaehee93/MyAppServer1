package com.myApp.MyAppServer.member;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {
    private final MemberRepository memberRepository;

    @PostMapping("/signup")
    public ResponseEntity<?> signUp(@Valid @RequestBody Member member, BindingResult result) {
        if (result.hasErrors()) {
            // 유효성 검사 실패 시 처리
            return ResponseEntity.badRequest().body(result.getFieldError().getDefaultMessage());
        }
        // 유효성 검사 통과 후 처리
        memberRepository.save(member);
        return ResponseEntity.ok(true);  // JSON 형태로 true 반환
    }

}

