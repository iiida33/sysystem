package com.lps.vo;

import java.util.Date;

/**
 * @ClassName: CustomerShowModel
 * @Description: 客户信息展示列表项
 * @Author: 梁培珊
 * @Date: 16:04 2019/3/17
 **/
public class CustomerShowModel {
    private Integer custId;

    private String custUsername;

    private Date custCreat;

    private Date orderCreate;

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCustUsername() {
        return custUsername;
    }

    public void setCustUsername(String custUsername) {
        this.custUsername = custUsername;
    }

    public Date getCustCreat() {
        return custCreat;
    }

    public void setCustCreat(Date custCreat) {
        this.custCreat = custCreat;
    }

    public Date getOrderCreate() {
        return orderCreate;
    }

    public void setOrderCreate(Date orderCreate) {
        this.orderCreate = orderCreate;
    }

    @Override
    public String toString() {
        return "CustomerShowModel{" +
                "custId=" + custId +
                ", custUsername='" + custUsername + '\'' +
                ", custCreat=" + custCreat +
                ", orderCreate=" + orderCreate +
                '}';
    }
}
