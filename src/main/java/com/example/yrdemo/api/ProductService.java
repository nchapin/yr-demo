package com.example.yrdemo.api;

import com.example.yrdemo.api.call.YRAPIProductResponse;
import com.example.yrdemo.api.data.ProductData;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProductService extends APIService {
    public ProductData getProductByCode(String code) {
        String url = getAPIURL("/YR-FR/products/" + code + "/?options=BASIC,ASSET,ASSET_IMAGES,CATEGORIES,CLASSIFICATION,COLOR_CART_IMAGES,DESCRIPTION,GALLERY,INCI_PRODUCT_LIST,PRICE,PROMOTIONS,REFERENCES,REVIEW,STICKER_ENGAGED_PRODUCT,STOCK,SUMMARY,VARIANT_FULL");
        ResponseEntity<YRAPIProductResponse> response = callRest(url, YRAPIProductResponse.class);
        return response.getBody().getData();
    }
}
