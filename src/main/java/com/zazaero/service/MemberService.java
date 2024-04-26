package com.zazaero.service;

import com.zazaero.domain.Member;
import com.zazaero.dto.MemberDTO;
import com.zazaero.entity.MemberEntity;
import com.zazaero.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository; // 먼저 jpa, mysql dependency 추가
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    public void save(MemberDTO memberDTO) {
//        // repsitory의 save 메서드 호출
//        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
////        memberRepository.save(memberEntity);
//        //Repository의 save메서드 호출 (조건. entity객체를 넘겨줘야 함)
//
//    }
    @Transactional
    public void changePW() {
        List<Member> memberInfos = memberRepository.findAll();
        for (Member memberInfo : memberInfos) {
            String currentPassword = memberInfo.getENC_mem_pw();
            String encryptedPassword = bCryptPasswordEncoder.encode(currentPassword);
            memberInfo.setENC_mem_pw(encryptedPassword);
            memberInfo.setFind_certi_dt(memberInfo.getFind_certi_dt());
        }
        memberRepository.saveAll(memberInfos);
    }

}
