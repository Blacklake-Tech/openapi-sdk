package tech.blacklake.dev.openapi.sdk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tech.blacklake.dev.openapi.sdk.event.ServletAdapter;

@Configuration
public class OpenapiEventAutoConfig {
    @Bean
    public ServletAdapter servletAdapter() {
        return new ServletAdapter();
    }
}
