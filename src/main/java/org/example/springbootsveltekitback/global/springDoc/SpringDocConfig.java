package org.example.springbootsveltekitback.global.springDoc;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "TEST 20240501 API", version = "v1"))
public class SpringDocConfig {
    @Bean
    public GroupedOpenApi apiGroupV1() {
        return GroupedOpenApi.builder()
                .group("API V1")
                .pathsToMatch("/api/v1/**")
                .build();
    }

    @Bean
    public GroupedOpenApi apiGroupV2() {
        return GroupedOpenApi.builder()
                .group("API V2")
                .pathsToMatch("/api/v2/**")
                .build();
    }

    @Bean
    public GroupedOpenApi apiGroupOthers() {
        return GroupedOpenApi.builder()
                .group("Controller")
                .pathsToExclude("/api/**")
                .build();
    }
}
