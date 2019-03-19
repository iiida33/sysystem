package com.lps.po;

import java.util.Date;

public class Customer {
    private Integer custId;

    private String custName;

    private String custUsername;

    private String custPassword;

    private String custPhone;

    private String custEmail;

    private String custSex;

    private Date custBirth;

    private String custAddress;

    private String custPic;

    private Date custCreate;

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName == null ? null : custName.trim();
    }

    public String getCustUsername() {
        return custUsername;
    }

    public void setCustUsername(String custUsername) {
        this.custUsername = custUsername == null ? null : custUsername.trim();
    }

    public String getCustPassword() {
        return custPassword;
    }

    public void setCustPassword(String custPassword) {
        this.custPassword = custPassword == null ? null : custPassword.trim();
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone == null ? null : custPhone.trim();
    }

    public String getCustEmail() {
        return custEmail;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail == null ? null : custEmail.trim();
    }

    public String getCustSex() {
        return custSex;
    }

    public void setCustSex(String custSex) {
        this.custSex = custSex == null ? null : custSex.trim();
    }

    public Date getCustBirth() {
        return custBirth;
    }

    public void setCustBirth(Date custBirth) {
        this.custBirth = custBirth;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress == null ? null : custAddress.trim();
    }

    public String getCustPic() {
        return custPic;
    }

    public void setCustPic(String custPic) {
        this.custPic = custPic == null ? null : custPic.trim();
    }

    public Date getCustCreate() {
        return custCreate;
    }

    public void setCustCreate(Date custCreate) {
        this.custCreate = custCreate;
    }
}