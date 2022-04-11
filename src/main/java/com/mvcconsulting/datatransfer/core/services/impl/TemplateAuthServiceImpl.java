package com.mvcconsulting.datatransfer.core.services.impl;

import com.mvcconsulting.datatransfer.core.models.Token;
import com.mvcconsulting.datatransfer.core.services.TemplateAuthService;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;
import org.springframework.web.client.RestTemplate;

@Service
public class TemplateAuthServiceImpl implements TemplateAuthService {

    Logger LOGGER = LoggerFactory.getLogger(TemplateAuthServiceImpl.class);

    @Override
    public Token getAuth() {
        RestTemplate restTemplate = new RestTemplate();
        String authUrl = "https://api.dropshipzone.com.au/auth";

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        JSONObject jBody = new JSONObject();
        try {
            jBody.put("email", "csjamesdu@gmail.com");
            jBody.put("password", "he1dtwYGI_JN");
        } catch (JSONException e) {
            LOGGER.error(e.getLocalizedMessage());
        }

        HttpEntity<String> request = new HttpEntity<String>(jBody.toString(), headers);
        Token result = restTemplate.postForObject(authUrl,request, Token.class);

        LOGGER.info(result.getToken());

        return result;
    }
}
