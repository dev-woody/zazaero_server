package com.zazaero.service;

import com.zazaero.config.jwt.TokenProvider;
import com.zazaero.data.entity.member.MemberEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.Duration;

@RequiredArgsConstructor
@Service
public class TokenService {

    private final TokenProvider tokenProvider;
    private final RefreshTokenService refreshTokenService;
    private final MemberService memberService;

    public String createNewAccessToken(String refreshToken) {
        // 토큰 유효성 검사에 실패하면 예외 발생
        if(!tokenProvider.validToken(refreshToken)) {
            throw new IllegalArgumentException("Unexpected token");
        }

        Long userId = refreshTokenService.findByRefreshToken(refreshToken).getUserId();
        System.out.println("토큰아이디는 = " + userId);
        MemberEntity member = memberService.findByMemId(userId);

        return tokenProvider.generateToken(member, Duration.ofHours(2));
    }
}