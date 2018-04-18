package com.example.yrdemo.api.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FacetBreadcrumbData {
    String facetValueName;
    String facetName;
    String facetValueCode;
    String facetCode;
    SearchStateData removeQuery;

    public String getFacetValueName() {
        return facetValueName;
    }

    public void setFacetValueName(String facetValueName) {
        this.facetValueName = facetValueName;
    }

    public String getFacetName() {
        return facetName;
    }

    public void setFacetName(String facetName) {
        this.facetName = facetName;
    }

    public String getFacetValueCode() {
        return facetValueCode;
    }

    public void setFacetValueCode(String facetValueCode) {
        this.facetValueCode = facetValueCode;
    }

    public String getFacetCode() {
        return facetCode;
    }

    public void setFacetCode(String facetCode) {
        this.facetCode = facetCode;
    }

    public SearchStateData getRemoveQuery() {
        return removeQuery;
    }

    public void setRemoveQuery(SearchStateData removeQuery) {
        this.removeQuery = removeQuery;
    }
}
