package com.sideproject.chatfit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration// 스프링의 환경 설정 파일 명시
@EnableWebSecurity // 모든 요청 URL이 스프링 시큐리티의 제어 받음
public class SecurityConfig {

    @Bean
    // SecurityFilterChain : 모든 요청 URL에 이 클래스가 필터로 적용됨
    SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http // 인증되지 않은 모든 페이지의 요청을 허락
            .authorizeHttpRequests((authorizeHttpRequests) -> authorizeHttpRequests
            .requestMatchers(new AntPathRequestMatcher("/**")).permitAll())
        ;
        return http.build();
    }
}
