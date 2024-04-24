package com.zazaero.service;

import com.zazaero.domain.Member;
import com.zazaero.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@RequiredArgsConstructor
@Service
public class MemberDetailService implements UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public Member loadUserByUsername(String id) {
        Member member = memberRepository.findById(id).orElseThrow(() -> new UsernameNotFoundException("해당 사용자를 찾을 수 없습니다.:" + id));

        member.setAuthorities(Collections.singleton(new SimpleGrantedAuthority(member.getMem_type())));

        return member;
    }
}