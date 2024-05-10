package com.zazaero.controller;

import com.zazaero.domain.Member;
import com.zazaero.dto.MemberDTO;
import com.zazaero.repository.MemberRepository;
import com.zazaero.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

//@GetMapping("/changePass")
//    public ResponseEntity<List<Member>> changePW() throws Exception {
//    public ResponseEntity<Optional<Member>> changePW() throws Exception {

//        public List<Member> changePW() {
//            public ResponseEntity<String> changePW() throws Exception {
//        memberService.changepw();
//        return ResponseEntity.status(HttpStatus.OK).body(memberService.changepw());
//        return memberService.changepw();
//    System.out.println("조회성공");
//            return ResponseEntity.status(HttpStatus.OK).body("조회성공");
//    }
}
