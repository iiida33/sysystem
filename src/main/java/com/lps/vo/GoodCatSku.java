package com.lps.vo;

import com.lps.po.Category;
import com.lps.po.Good;

/**
 * @ClassName: GoodCatSku
 * @Description:
 * @Author: 梁培珊
 * @Date:
 **/
public class GoodCatSku {
    private Integer goodId;

    private String goodName;

    private String goodBrand;

    private Boolean goodState;

    private String catName;

    private Integer goodStock;

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
        this.goodName = goodName;
    }

    public String getGoodBrand() {
        return goodBrand;
    }

    public void setGoodBrand(String goodBrand) {
        this.goodBrand = goodBrand;
    }

    public Boolean getGoodState() {
        return goodState;
    }

    public void setGoodState(Boolean goodState) {
        this.goodState = goodState;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Integer getGoodStock() {
        return goodStock;
    }

    public void setGoodStock(Integer goodStock) {
        this.goodStock = goodStock;
    }

    @Override
    public String toString() {
        return "GoodCatSku{" +
                "goodId=" + goodId +
                ", goodName='" + goodName + '\'' +
                ", goodBrand='" + goodBrand + '\'' +
                ", goodState=" + goodState +
                ", catName='" + catName + '\'' +
                ", goodStock=" + goodStock +
                '}';
    }
}
