package com.lps.po;

import java.util.Date;

public class Evaluate {
    private Integer evaluateId;

    private Integer orderdtlId;

    private Integer goodId;

    private Integer custId;

    private String evaluateText;

    private Date evaluateDate;

    private Boolean evaluateState;

    public Integer getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(Integer evaluateId) {
        this.evaluateId = evaluateId;
    }

    public Integer getOrderdtlId() {
        return orderdtlId;
    }

    public void setOrderdtlId(Integer orderdtlId) {
        this.orderdtlId = orderdtlId;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getEvaluateText() {
        return evaluateText;
    }

    public void setEvaluateText(String evaluateText) {
        this.evaluateText = evaluateText == null ? null : evaluateText.trim();
    }

    public Date getEvaluateDate() {
        return evaluateDate;
    }

    public void setEvaluateDate(Date evaluateDate) {
        this.evaluateDate = evaluateDate;
    }

    public Boolean getEvaluateState() {
        return evaluateState;
    }

    public void setEvaluateState(Boolean evaluateState) {
        this.evaluateState = evaluateState;
    }
}