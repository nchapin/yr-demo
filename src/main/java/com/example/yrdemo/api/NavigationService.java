package com.example.yrdemo.api;

import com.example.yrdemo.api.call.YRAPICatalogViewResponse;
import com.example.yrdemo.api.data.CatalogViewData;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class NavigationService extends APIService {
    public CatalogViewData getCatalogView() {
        String url = getAPIURL("/YR-FR/app/APP1/views/APP1CatalogView");
        ResponseEntity<YRAPICatalogViewResponse> response = callRest(url, YRAPICatalogViewResponse.class);
        return response.getBody().getData();
    }
}
