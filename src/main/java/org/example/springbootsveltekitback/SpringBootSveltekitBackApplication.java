package org.example.springbootsveltekitback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootSveltekitBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSveltekitBackApplication.class, args);
    }

}
