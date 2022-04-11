package com.mvcconsulting.datatransfer.core.config;

import com.mvcconsulting.datatransfer.core.services.TemplateAuthService;
import com.mvcconsulting.datatransfer.core.services.impl.AuthInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Configuration
public class RestTemplateConfiguration {

    @Autowired
    TemplateAuthService authService;

    @Bean
    public RestTemplate restTemplate(){
        RestTemplate template  = new RestTemplate();
        template.setInterceptors(List.of(new AuthInterceptor(authService)));
        return template;
    }
}
