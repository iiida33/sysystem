package com.lps.po;

public class GoodPic {
    private Integer picId;

    private String picName;

    private Integer goodId;

    private Boolean isTurn;

    private Boolean isDetail;

    private Integer picOrder;

    public Integer getPicId() {
        return picId;
    }

    public void setPicId(Integer picId) {
        this.picId = picId;
    }

    public String getPicName() {
        return picName;
    }

    public void setPicName(String picName) {
        this.picName = picName == null ? null : picName.trim();
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public Boolean getIsTurn() {
        return isTurn;
    }

    public void setIsTurn(Boolean isTurn) {
        this.isTurn = isTurn;
    }

    public Boolean getIsDetail() {
        return isDetail;
    }

    public void setIsDetail(Boolean isDetail) {
        this.isDetail = isDetail;
    }

    public Integer getPicOrder() {
        return picOrder;
    }

    public void setPicOrder(Integer picOrder) {
        this.picOrder = picOrder;
    }
}