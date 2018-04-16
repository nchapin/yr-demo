package com.example.yrdemo.configuration;

import org.springframework.stereotype.Service;

@Service
public class ConfigurationService {
    public String getAPIBaseURL() {
        return System.getenv("YR_DEMO_URL");
    }

    public String getAPIKey() {
        return System.getenv("YR_DEMO_API_KEY");
    }
}
