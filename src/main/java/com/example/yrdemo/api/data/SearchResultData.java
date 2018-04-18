package com.example.yrdemo.api.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchResultData {
    List<ProductData> products;

    CategoryData category;

    List<FacetData> facets;

    SearchPaginationData pagination;

    SearchStateData currentQuery;

    String freeTextSearch;

    List<SortData> sorts;

    String categoryCode;

    String keywordRedirectUrl;

    List<FacetBreadcrumbData> breadcrumbs;

    public List<FacetBreadcrumbData> getBreadcrumbs() {
        return breadcrumbs;
    }

    public void setBreadcrumbs(List<FacetBreadcrumbData> breadcrumbs) {
        this.breadcrumbs = breadcrumbs;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getKeywordRedirectUrl() {
        return keywordRedirectUrl;
    }

    public void setKeywordRedirectUrl(String keywordRedirectUrl) {
        this.keywordRedirectUrl = keywordRedirectUrl;
    }

    public SearchPaginationData getPagination() {
        return pagination;
    }

    public void setPagination(SearchPaginationData pagination) {
        this.pagination = pagination;
    }

    public SearchStateData getCurrentQuery() {
        return currentQuery;
    }

    public void setCurrentQuery(SearchStateData currentQuery) {
        this.currentQuery = currentQuery;
    }

    public String getFreeTextSearch() {
        return freeTextSearch;
    }

    public void setFreeTextSearch(String freeTextSearch) {
        this.freeTextSearch = freeTextSearch;
    }

    public List<SortData> getSorts() {
        return sorts;
    }

    public void setSorts(List<SortData> sorts) {
        this.sorts = sorts;
    }

    public List<ProductData> getProducts() {
        return products;
    }

    public void setProducts(List<ProductData> products) {
        this.products = products;
    }

    public CategoryData getCategory() {
        return category;
    }

    public void setCategory(CategoryData category) {
        this.category = category;
    }

    public List<FacetData> getFacets() {
        return facets;
    }

    public void setFacets(List<FacetData> facets) {
        this.facets = facets;
    }
}
