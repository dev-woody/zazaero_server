package com.zazaero.service;

import com.zazaero.domain.Member;
import com.zazaero.dto.MemberDTO;
import com.zazaero.entity.MemberEntity;
import com.zazaero.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository; // 먼저 jpa, mysql dependency 추가
//
//    public void save(MemberDTO memberDTO) {
//        // repsitory의 save 메서드 호출
//        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
////        memberRepository.save(memberEntity);
//        //Repository의 save메서드 호출 (조건. entity객체를 넘겨줘야 함)
//
//    }

}
