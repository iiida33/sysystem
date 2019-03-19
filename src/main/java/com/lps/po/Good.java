package com.lps.po;

public class Good {
    private Integer goodId;

    private String goodName;

    private Integer catId;

    private String goodBrand;

    private String goodDescribe;

    private String goodProps;

    private Boolean goodState;

    private String goodImage;

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName == null ? null : goodName.trim();
    }

    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    public String getGoodBrand() {
        return goodBrand;
    }

    public void setGoodBrand(String goodBrand) {
        this.goodBrand = goodBrand == null ? null : goodBrand.trim();
    }

    public String getGoodDescribe() {
        return goodDescribe;
    }

    public void setGoodDescribe(String goodDescribe) {
        this.goodDescribe = goodDescribe == null ? null : goodDescribe.trim();
    }

    public String getGoodProps() {
        return goodProps;
    }

    public void setGoodProps(String goodProps) {
        this.goodProps = goodProps == null ? null : goodProps.trim();
    }

    public Boolean getGoodState() {
        return goodState;
    }

    public void setGoodState(Boolean goodState) {
        this.goodState = goodState;
    }

    public String getGoodImage() {
        return goodImage;
    }

    public void setGoodImage(String goodImage) {
        this.goodImage = goodImage == null ? null : goodImage.trim();
    }
}