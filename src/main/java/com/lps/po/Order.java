package com.lps.po;

import java.util.Date;

public class Order {
    private Integer orderId;

    private String orderNum;

    private Integer custId;

    private Integer adminId;

    private Integer orderState;

    private Date orderCreate;

    private Date orderPay;

    private Date orderReceive;

    private String orderDeliinfo;

    private String orderRemark;

    private Double orderMoney;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum == null ? null : orderNum.trim();
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getOrderState() {
        return orderState;
    }

    public void setOrderState(Integer orderState) {
        this.orderState = orderState;
    }

    public Date getOrderCreate() {
        return orderCreate;
    }

    public void setOrderCreate(Date orderCreate) {
        this.orderCreate = orderCreate;
    }

    public Date getOrderPay() {
        return orderPay;
    }

    public void setOrderPay(Date orderPay) {
        this.orderPay = orderPay;
    }

    public Date getOrderReceive() {
        return orderReceive;
    }

    public void setOrderReceive(Date orderReceive) {
        this.orderReceive = orderReceive;
    }

    public String getOrderDeliinfo() {
        return orderDeliinfo;
    }

    public void setOrderDeliinfo(String orderDeliinfo) {
        this.orderDeliinfo = orderDeliinfo == null ? null : orderDeliinfo.trim();
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark == null ? null : orderRemark.trim();
    }

    public Double getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(Double orderMoney) {
        this.orderMoney = orderMoney;
    }
}