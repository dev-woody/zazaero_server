package com.zazaero.config.customSecurity;

import com.zazaero.domain.Member;
import com.zazaero.service.MemberDetailService;
import com.zazaero.util.AESUtil;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.Objects;

public class CustomAuthenticationProvider implements AuthenticationProvider {
    private MemberDetailService userDetailService;
    private AESUtil aesUtil;

    public CustomAuthenticationProvider(MemberDetailService userDetailService, AESUtil aes128Util) {
        this.userDetailService = userDetailService;
        this.aesUtil = aesUtil;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = (String) authentication.getCredentials();

        Member member = userDetailService.loadUserByUsername(username);
        if (member == null) {
            throw new BadCredentialsException("userId is not found. userId =" + username);
        }

        try {
            if (!Objects.equals(this.aesUtil.encryptText(password, "DB"), member.getENC_mem_pw())) {
                throw new BadCredentialsException("password is not matched");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Collection<? extends GrantedAuthority> authorities = member.getAuthorities();

        return UsernamePasswordAuthenticationToken.authenticated(username, password, authorities);
//        return new CustomAuthenticationToken(username, password, member.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return UsernamePasswordAuthenticationToken.class.equals(authentication);
    }
}