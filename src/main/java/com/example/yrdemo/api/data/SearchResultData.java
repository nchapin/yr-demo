package com.example.yrdemo.api.data;

import java.util.List;

public class SearchResultData {
    List<ProductData> products;

    CategoryData category;

    List<FacetData> facets;

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
