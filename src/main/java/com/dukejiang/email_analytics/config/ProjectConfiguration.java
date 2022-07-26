package com.dukejiang.email_analytics.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class ProjectConfiguration {
    @Value("${SPARKPOST_API_KEY}")
    private String SPARKPOST_API_KEY;

    @Value("${SP_BASE_URI}")
    private String SP_BASE_URI;

    @Bean
    public WebClient webClient(){
        return WebClient.builder()
                .baseUrl(SP_BASE_URI)
                .defaultHeader("Authorization", SPARKPOST_API_KEY)
                .build();
    }
}
