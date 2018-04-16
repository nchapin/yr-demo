package com.example.yrdemo.api.data;

public class FacetValueData {
    String code;
    String name;
    SearchStateData query;
    Integer count;
    Boolean selected;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SearchStateData getQuery() {
        return query;
    }

    public void setQuery(SearchStateData query) {
        this.query = query;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }
}
