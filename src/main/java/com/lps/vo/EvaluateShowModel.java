package com.lps.vo;

import java.util.Date;

/**
 * @ClassName: EvaluateShowModel
 * @Description: 评价信息展示属性模型
 * @Author: 梁培珊
 * @Date: 11:04 2019/3/18
 **/
public class EvaluateShowModel {

    private Integer evaluateId;

    private String custUsername;

    private String evaluateText;

    private Date evaluateDate;

    private Boolean evaluateState;

    private String skuProps;

    private String goodName;

    private String orderNum;

    @Override
    public String toString() {
        return "EvaluateShowModel{" +
                "evaluateId=" + evaluateId +
                ", custUsername='" + custUsername + '\'' +
                ", evaluateText='" + evaluateText + '\'' +
                ", evaluateDate=" + evaluateDate +
                ", evaluateState=" + evaluateState +
                ", skuProps='" + skuProps + '\'' +
                ", goodName='" + goodName + '\'' +
                ", orderNum='" + orderNum + '\'' +
                '}';
    }

    public Integer getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(Integer evaluateId) {
        this.evaluateId = evaluateId;
    }

    public String getCustUsername() {
        return custUsername;
    }

    public void setCustUsername(String custUsername) {
        this.custUsername = custUsername;
    }

    public String getEvaluateText() {
        return evaluateText;
    }

    public void setEvaluateText(String evaluateText) {
        this.evaluateText = evaluateText;
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

    public String getSkuProps() {
        return skuProps;
    }

    public void setSkuProps(String skuProps) {
        this.skuProps = skuProps;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }
}