package com.example.yrdemo.api;

public class SearchQuery {
    private String categoryCode;
    private String freeText;
    private String query;
    private Integer page;
    private String sort;

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("{");
        sb.append("c:" + categoryCode);
        sb.append("-");
        sb.append("f:" + freeText);
        sb.append("-");
        sb.append("q:" + query);
        sb.append("-");
        sb.append("p:" + page);
        sb.append("-");
        sb.append("s:" + sort);
        sb.append("-");
        sb.append("}");
        return sb.toString();
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String getFreeText() {
        return freeText;
    }

    public void setFreeText(String freeText) {
        this.freeText = freeText;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
