package com.zazaero.service;

import com.zazaero.data.entity.entity.MemberEntity;
import com.zazaero.data.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberDetailService implements UserDetailsService {

    private final MemberRepository memberRepository;

    @Override
    public MemberEntity loadUserByUsername(String id) {
        return memberRepository.findByMemId(id).orElseThrow(() -> new UsernameNotFoundException(id));
    }
}