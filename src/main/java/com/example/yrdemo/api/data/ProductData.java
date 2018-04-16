package com.example.yrdemo.api.data;

public class ProductData {
    String name;
    PriceData price;
    String code;
    String summary;
    String easyImgYRx260;
    PriceData discountedPrice;
    String nameProductGamme;
    String codeProductGamme;
    String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PriceData getPrice() {
        return price;
    }

    public void setPrice(PriceData price) {
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getEasyImgYRx260() {
        return easyImgYRx260;
    }

    public void setEasyImgYRx260(String easyImgYRx260) {
        this.easyImgYRx260 = easyImgYRx260;
    }

    public PriceData getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(PriceData discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public String getNameProductGamme() {
        return nameProductGamme;
    }

    public void setNameProductGamme(String nameProductGamme) {
        this.nameProductGamme = nameProductGamme;
    }

    public String getCodeProductGamme() {
        return codeProductGamme;
    }

    public void setCodeProductGamme(String codeProductGamme) {
        this.codeProductGamme = codeProductGamme;
    }
}
