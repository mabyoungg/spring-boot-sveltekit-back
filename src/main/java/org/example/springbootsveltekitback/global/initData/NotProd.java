package org.example.springbootsveltekitback.global.initData;

import lombok.RequiredArgsConstructor;
import org.example.springbootsveltekitback.domain.member.member.service.MemberService;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class NotProd {
    private final MemberService memberService;

    @Bean
    ApplicationRunner initNotProd() {
        return args -> {
            memberService.join("admin", "1234");
            memberService.join("user1", "1234");
            memberService.join("user2", "1234");
        };
    }
}
