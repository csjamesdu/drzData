package com.mvcconsulting.datatransfer.core.services.impl;

import com.mvcconsulting.datatransfer.core.services.TemplateAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.http.client.ClientHttpRequestExecution;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.http.client.ClientHttpResponse;
import java.io.IOException;

public class AuthInterceptor implements ClientHttpRequestInterceptor {

    private final TemplateAuthService templateAuthService;

    @Autowired
    public AuthInterceptor(TemplateAuthService templateAuthService) {
        this.templateAuthService = templateAuthService;
    }

    @Override
    public ClientHttpResponse intercept(HttpRequest request, byte[] body, ClientHttpRequestExecution execution) throws IOException{

        request.getHeaders().add("Authorization", "jwt " + templateAuthService.getAuth().getToken());
        return execution.execute(request, body);
    }
}
