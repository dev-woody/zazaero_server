package com.zazaero.config;

import com.zazaero.config.customSecurity.CustomAuthenticationFilter;
import com.zazaero.config.customSecurity.CustomAuthenticationProvider;
import com.zazaero.service.MemberDetailService;
import com.zazaero.util.AESUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.boot.autoconfigure.security.servlet.PathRequest.toH2Console;

@RequiredArgsConstructor
@Configuration
public class WebSecurityConfig {

    @Autowired
    public AESUtil aesUtil;

    @Autowired
    private final MemberDetailService userService;

    @Bean
    public WebSecurityCustomizer configure() {
        return (web) -> web.ignoring()
                .requestMatchers(toH2Console())
                .requestMatchers("/**");
    }

//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//                .authorizeHttpRequests((requests) -> requests
//                        .requestMatchers("/hello.html").permitAll()
//                        .anyRequest().authenticated()
//                )
//                .formLogin((form) -> form
//                        .loginPage("/login.html")
//                        .loginProcessingUrl("/login")
//                        .defaultSuccessUrl("/hello.html")
//                        .permitAll()
//                )
//                .logout((logout) -> logout.permitAll());
//
//        return http.build();
//    }

//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        return http
//                .authorizeRequests((authz) -> authz.requestMatchers("/login", "/signup", "/user").permitAll()
//                        .anyRequest().authenticated())
//                .formLogin((formLogin) -> formLogin.loginPage("/login")
////                        .defaultSuccessUrl("/articles"))
//                        .permitAll())
//                .logout((logout) -> logout.logoutSuccessUrl("/login")
////                        .invalidateHttpSession(true))
//                )
//                .csrf(AbstractHttpConfigurer::disable)
//                .build();
//    }

//    @Bean
//    public AuthenticationManager authenticationManager(HttpSecurity http, BCryptPasswordEncoder bCryptPasswordEncoder, MemberDetailService userDetailService) throws Exception {
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

    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider());
    }


    @Bean
    public AuthenticationProvider authenticationProvider() {
        return new CustomAuthenticationProvider(userService, aesUtil);
    }
}
