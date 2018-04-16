package com.example.yrdemo.api.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CatalogViewData {
    List<NavigationNodeData> navigation;

    public List<NavigationNodeData> getNavigation() {
        return navigation;
    }

    public void setNavigation(List<NavigationNodeData> navigation) {
        this.navigation = navigation;
    }
}
