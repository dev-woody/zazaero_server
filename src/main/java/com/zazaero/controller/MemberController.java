package com.zazaero.controller;

import com.zazaero.domain.Member;
import com.zazaero.dto.MemberDTO;
import com.zazaero.dto.SignInDto;
import com.zazaero.repository.MemberRepository;
import com.zazaero.service.MemberService;
import com.zazaero.util.AESUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@Controller
@RequiredArgsConstructor
public class MemberController {
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

    @Autowired
    private AESUtil aesUtil;
    @RequestMapping("/testSignIn")
    public String signIn(@RequestBody SignInDto signIn) throws Exception {
        Member member = memberRepository.findById(signIn.getMem_id()).orElseThrow(() -> new UsernameNotFoundException("해당 사용자를 찾을 수 없습니다.:"));
        String password = signIn.getPassword();

        String encrypt = aesUtil.encryptText(password, "DB");
//        String decrypt_new = aesUtil.decrypt(password, "DB");

        if (Objects.equals(member.getENC_mem_pw(), encrypt)) {
            return member + "의 비밀번호는 = " + password + " : " + encrypt;
        } else {
            return "비밀번호가 틀렸습니다." + encrypt + " 비밀번호는 : " + member.getENC_mem_pw();
        }

    }
}
