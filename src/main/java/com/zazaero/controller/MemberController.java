package com.zazaero.controller;

import com.zazaero.domain.Member;
import com.zazaero.dto.MemberDTO;
import com.zazaero.dto.SignInDto;
import com.zazaero.repository.MemberRepository;
import com.zazaero.service.MemberService;
import com.zazaero.util.AESUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller
@RequiredArgsConstructor
public class MemberController {

    @Autowired
    private final MemberService memberService;

    private final MemberRepository memberRepository;

    @GetMapping("/member/save")
    public String saveForm() {
        return "save";
    }
    @PostMapping("/member/save")
    public String save(@ModelAttribute MemberDTO memberDTO) {
        System.out.println("MemberController.save");
        System.out.println("memberDTO = " + memberDTO);
//        memberService.save(memberDTO);

        return "index";
    }


    @GetMapping("/changePW")
    public ResponseEntity<String> changePW() throws Exception {
        memberService.changePW();
        return ResponseEntity.status(HttpStatus.OK).body("비밀번호 변경에 성공했습니다.");
    }
}
