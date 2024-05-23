package com.zazaero.controller;

import com.zazaero.data.dto.PostMemberDTO;
import com.zazaero.data.entity.entity.MemberEntity;
import com.zazaero.service.MemberService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @PostMapping("/reg")
    public MemberEntity save(@RequestBody PostMemberDTO dto) {
        return memberService.save(dto);
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response) {
        new SecurityContextLogoutHandler().logout(request, response, SecurityContextHolder.getContext().getAuthentication());
        return "redirect:/login.html";
    }

    @GetMapping("/member-type")
    public List<MemberEntity> memType(
            @RequestParam("mem-type") String memType
    ) {
        return memberService.findMemverType(memType);
    }

    @GetMapping("")
    public MemberEntity findMember(
            @RequestParam("mem-uid") Long memUid
    ) {
        return memberService.findById(memUid);
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
