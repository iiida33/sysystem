package com.lps.vo;

/**
 * @ClassName: GoodSimpleShow
 * @Description:
 * @Author: 梁培珊
 * @Date: 15:09 2019/3/18
 **/
public class GoodSimpleShow {

    private Integer goodId;

    private String goodBrand;

    private String goodName;

    private String goodImage;

    private Double skuPrice;

    @Override
    public String toString() {
        return "GoodSimpleShow{" +
                "goodId=" + goodId +
                ", goodBrand='" + goodBrand + '\'' +
                ", goodName='" + goodName + '\'' +
                ", goodImage='" + goodImage + '\'' +
                ", skuPrice=" + skuPrice +
                '}';
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public String getGoodBrand() {
        return goodBrand;
    }

    public void setGoodBrand(String goodBrand) {
        this.goodBrand = goodBrand;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodImage() {
        return goodImage;
    }

    public void setGoodImage(String goodImage) {
        this.goodImage = goodImage;
    }

    public Double getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(Double skuPrice) {
        this.skuPrice = skuPrice;
    }
}
