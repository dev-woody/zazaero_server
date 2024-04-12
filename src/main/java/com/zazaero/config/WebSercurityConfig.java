package com.zazaero.config;

import com.zazaero.service.UserDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.boot.autoconfigure.security.servlet.PathRequest.toH2Console;

@RequiredArgsConstructor
@Configuration
class WebSecurityConfig {

    private final UserDetailService userService;

    @Bean
    public WebSecurityCustomizer configure() {
        return (web) -> web.ignoring()
                .requestMatchers(toH2Console())
                .requestMatchers("/static/**");
    }

//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        return http
//                .authorizeRequests((authz) -> authz.requestMatchers("/login", "/signup", "/user", "/hello.html").permitAll()
//                        .anyRequest().authenticated())
//                .formLogin((formLogin) -> formLogin.loginPage("/login")
//                        .defaultSuccessUrl("/articles"))
//                .logout((logout) -> logout.logoutSuccessUrl("/login")
//                        .invalidateHttpSession(true))
//                .csrf(AbstractHttpConfigurer::disable)
//                .build();
//    }
//
//    @Bean
//    public AuthenticationManager authenticationManager(HttpSecurity http, BCryptPasswordEncoder bCryptPasswordEncoder, UserDetailService userDetailService) throws Exception {
//        AuthenticationManagerBuilder authenticationManagerBuilder =
//                http.getSharedObject(AuthenticationManagerBuilder.class).userDetailsService(userService)
//                        .passwordEncoder(bCryptPasswordEncoder);
//        return authenticationManagerBuilder.build();
//    }
@Bean
public DaoAuthenticationProvider daoAuthenticationProvider() throws Exception {
    DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();

    daoAuthenticationProvider.setUserDetailsService(userService);
    daoAuthenticationProvider.setPasswordEncoder(bCryptPasswordEncoder());

    return daoAuthenticationProvider;
}

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
