package com.example.yrdemo.api.call;

import com.example.yrdemo.api.commons.YRAPIResponse;
import com.example.yrdemo.api.data.CatalogViewData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YRAPICatalogViewResponse extends YRAPIResponse<CatalogViewData> {
}
