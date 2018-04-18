package com.example.yrdemo.api;

import com.example.yrdemo.api.call.YRAPISearchResponse;
import com.example.yrdemo.api.data.SearchResultData;
import org.apache.http.client.utils.URIBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class SearchService extends APIService {
    public SearchResultData searchByCategoryCode(SearchQuery query) {
        URIBuilder builder = new URIBuilder();
        builder.setPath("/YR-FR/categories/" + query.getCategoryCode() + "/");
        if (!StringUtils.isEmpty(query.getQuery())) {
            builder.addParameter("q", query.getQuery());
        }
        if (query.getPage() != null) {
            builder.addParameter("currentPage", query.getPage().toString());
        }
        if (!StringUtils.isEmpty(query.getSort())) {
            builder.addParameter("sort", query.getSort());
        }
        String url = getAPIURL(builder.toString()).replaceAll("%3A", ":");
        ResponseEntity<YRAPISearchResponse> response = callRest(url, YRAPISearchResponse.class);
        return response.getBody().getData();
    }

    public SearchResultData textSearch(String text) {
        String url = getAPIURL("/YR-FR/products/?query=" + text);
        ResponseEntity<YRAPISearchResponse> response = callRest(url, YRAPISearchResponse.class);
        return response.getBody().getData();
    }
}
