package com.lps.po;

public class DeliveryInfo {
    private Integer delId;

    private Integer custId;

    private String delReceiver;

    private String delArea;

    private String delAddress;

    private String delPhone;

    private String delPc;

    private Boolean isDefault;

    public Integer getDelId() {
        return delId;
    }

    public void setDelId(Integer delId) {
        this.delId = delId;
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getDelReceiver() {
        return delReceiver;
    }

    public void setDelReceiver(String delReceiver) {
        this.delReceiver = delReceiver == null ? null : delReceiver.trim();
    }

    public String getDelArea() {
        return delArea;
    }

    public void setDelArea(String delArea) {
        this.delArea = delArea == null ? null : delArea.trim();
    }

    public String getDelAddress() {
        return delAddress;
    }

    public void setDelAddress(String delAddress) {
        this.delAddress = delAddress == null ? null : delAddress.trim();
    }

    public String getDelPhone() {
        return delPhone;
    }

    public void setDelPhone(String delPhone) {
        this.delPhone = delPhone == null ? null : delPhone.trim();
    }

    public String getDelPc() {
        return delPc;
    }

    public void setDelPc(String delPc) {
        this.delPc = delPc == null ? null : delPc.trim();
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }
}