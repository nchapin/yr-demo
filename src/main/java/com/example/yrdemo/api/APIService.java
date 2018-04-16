package com.example.yrdemo.api;

import com.example.yrdemo.configuration.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

public class APIService {
    @Autowired
    ConfigurationService configurationService;

    protected String getAPIURL(String path) {
        return configurationService.getAPIBaseURL() + path;
    }

    protected <T> ResponseEntity<T>  callRest(String url, java.lang.Class<T> responseType) {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON_UTF8));
        headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
        headers.set("X-EASY-API","Basic " + configurationService.getAPIKey());
        HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
        ResponseEntity<T> response = restTemplate.exchange(url, HttpMethod.GET, entity, responseType);
        return response;
    }
}
