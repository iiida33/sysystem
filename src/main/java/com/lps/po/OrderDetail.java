package com.lps.po;

public class OrderDetail {
    private Integer orderdtlId;

    private Integer orderId;

    private Integer skuId;

    private String orderdtlName;

    private String orderdtlProps;

    private Integer orderdtlCount;

    private Double orderdtlPrice;

    private Double orderdtlMoney;

    public Integer getOrderdtlId() {
        return orderdtlId;
    }

    public void setOrderdtlId(Integer orderdtlId) {
        this.orderdtlId = orderdtlId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public String getOrderdtlName() {
        return orderdtlName;
    }

    public void setOrderdtlName(String orderdtlName) {
        this.orderdtlName = orderdtlName == null ? null : orderdtlName.trim();
    }

    public String getOrderdtlProps() {
        return orderdtlProps;
    }

    public void setOrderdtlProps(String orderdtlProps) {
        this.orderdtlProps = orderdtlProps == null ? null : orderdtlProps.trim();
    }

    public Integer getOrderdtlCount() {
        return orderdtlCount;
    }

    public void setOrderdtlCount(Integer orderdtlCount) {
        this.orderdtlCount = orderdtlCount;
    }

    public Double getOrderdtlPrice() {
        return orderdtlPrice;
    }

    public void setOrderdtlPrice(Double orderdtlPrice) {
        this.orderdtlPrice = orderdtlPrice;
    }

    public Double getOrderdtlMoney() {
        return orderdtlMoney;
    }

    public void setOrderdtlMoney(Double orderdtlMoney) {
        this.orderdtlMoney = orderdtlMoney;
    }
}