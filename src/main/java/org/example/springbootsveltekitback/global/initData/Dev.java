package org.example.springbootsveltekitback.global.initData;

import lombok.RequiredArgsConstructor;
import org.example.springbootsveltekitback.standard.util.Ut;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class Dev {
    @Bean
    ApplicationRunner initDev() {
        return args -> {
            String cmd = "cd ../spring-boot-sveltekit-front && npx openapi-typescript http://localhost:8090/v3/api-docs/API%20V1 -o ./src/lib/types/api/v1/schema.d.ts";
            Ut.cmd.runAsync(cmd);
        };
    }
}
