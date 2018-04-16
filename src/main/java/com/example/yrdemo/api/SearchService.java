package com.example.yrdemo.api;

import com.example.yrdemo.api.call.YRAPISearchResponse;
import com.example.yrdemo.api.data.SearchResultData;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class SearchService extends APIService {
    public SearchResultData searchByCategoryCode(String categoryCode) {
        String url = getAPIURL("/YR-FR/categories/" + categoryCode + "/");
        ResponseEntity<YRAPISearchResponse> response = callRest(url, YRAPISearchResponse.class);
        return response.getBody().getData();
    }
}
