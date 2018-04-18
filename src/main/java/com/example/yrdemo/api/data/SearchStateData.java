package com.example.yrdemo.api.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchStateData {
    String url;
    SearchQueryData query;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public SearchQueryData getQuery() {
        return query;
    }

    public void setQuery(SearchQueryData query) {
        this.query = query;
    }
}
