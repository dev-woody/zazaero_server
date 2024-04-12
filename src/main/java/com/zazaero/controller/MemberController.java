package com.zazaero.controller;

import com.zazaero.dto.MemberDTO;
import com.zazaero.service.MemberService;
import com.zazaero.util.AES128Util;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/member/save")
    public String saveForm() {
        return "save";
    }
    @PostMapping("/member/save")
    public String save(@ModelAttribute MemberDTO memberDTO) {
        System.out.println("MemberController.save");
        System.out.println("memberDTO = " + memberDTO);
        memberService.save(memberDTO);

        return "index";
    }

    @Autowired
    private AES128Util aesUtil;
    @RequestMapping("/testSignIn")
    public String signIn() {
        String pass = "password";

        String encrypt = aesUtil.encrypt_new(pass, "DB");
        String decrypt = aesUtil.decrypt(pass, "DB");

        return pass + " : " + encrypt + " : " + decrypt;
    }
}
