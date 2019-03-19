package com.lps.vo;

/**
 * @ClassName: CollectShowModel
 * @Description: 收藏夹信息展示模型
 * @Author: 梁培珊
 * @Date: 22:48 2019/3/17
 **/
public class CollectShowModel {
    private Integer collectId;

    private Integer goodId;

    private String goodName;

    private Boolean goodState;

    private String goodImage;

    private Double Price;

    @Override
    public String toString() {
        return "CollectShowModel{" +
                "collectId=" + collectId +
                ", goodId=" + goodId +
                ", goodName='" + goodName + '\'' +
                ", goodState=" + goodState +
                ", goodImage='" + goodImage + '\'' +
                ", Price=" + Price +
                '}';
    }

    public Integer getCollectId() {
        return collectId;
    }

    public void setCollectId(Integer collectId) {
        this.collectId = collectId;
    }

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
        this.goodImage = goodImage;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }
}
