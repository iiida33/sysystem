package com.lps.po;

import java.util.Date;

public class Out {
    private Integer outId;

    private Integer skuId;

    private Integer outCount;

    private String outDetail;

    private Integer adminId;

    private Date outDate;

    public Integer getOutId() {
        return outId;
    }

    public void setOutId(Integer outId) {
        this.outId = outId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getOutCount() {
        return outCount;
    }

    public void setOutCount(Integer outCount) {
        this.outCount = outCount;
    }

    public String getOutDetail() {
        return outDetail;
    }

    public void setOutDetail(String outDetail) {
        this.outDetail = outDetail == null ? null : outDetail.trim();
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }
}