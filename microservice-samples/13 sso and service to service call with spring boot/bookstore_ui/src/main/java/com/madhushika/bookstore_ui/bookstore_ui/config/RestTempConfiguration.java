package com.madhushika.bookstore_ui.bookstore_ui.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTempConfiguration {

    @Bean
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
