package com.lps.po;

import java.util.Date;

public class Admin {
    private Integer adminId;

    private Integer adminNum;

    private String adminPassword;

    private String adminName;

    private String adminSex;

    private Date adminBirth;

    private String adminEmail;

    private String adminPhone;

    private String adminAddress;

    private String adminIdnum;

    private String adminPic;

    private Integer adminAuthority;

    private Date adminEntry;

    private Boolean isResign;

    private Date adminLeave;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getAdminNum() {
        return adminNum;
    }

    public void setAdminNum(Integer adminNum) {
        this.adminNum = adminNum;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public String getAdminSex() {
        return adminSex;
    }

    public void setAdminSex(String adminSex) {
        this.adminSex = adminSex == null ? null : adminSex.trim();
    }

    public Date getAdminBirth() {
        return adminBirth;
    }

    public void setAdminBirth(Date adminBirth) {
        this.adminBirth = adminBirth;
    }

    public String getAdminEmail() {
        return adminEmail;
    }

    public void setAdminEmail(String adminEmail) {
        this.adminEmail = adminEmail == null ? null : adminEmail.trim();
    }

    public String getAdminPhone() {
        return adminPhone;
    }

    public void setAdminPhone(String adminPhone) {
        this.adminPhone = adminPhone == null ? null : adminPhone.trim();
    }

    public String getAdminAddress() {
        return adminAddress;
    }

    public void setAdminAddress(String adminAddress) {
        this.adminAddress = adminAddress == null ? null : adminAddress.trim();
    }

    public String getAdminIdnum() {
        return adminIdnum;
    }

    public void setAdminIdnum(String adminIdnum) {
        this.adminIdnum = adminIdnum == null ? null : adminIdnum.trim();
    }

    public String getAdminPic() {
        return adminPic;
    }

    public void setAdminPic(String adminPic) {
        this.adminPic = adminPic == null ? null : adminPic.trim();
    }

    public Integer getAdminAuthority() {
        return adminAuthority;
    }

    public void setAdminAuthority(Integer adminAuthority) {
        this.adminAuthority = adminAuthority;
    }

    public Date getAdminEntry() {
        return adminEntry;
    }

    public void setAdminEntry(Date adminEntry) {
        this.adminEntry = adminEntry;
    }

    public Boolean getIsResign() {
        return isResign;
    }

    public void setIsResign(Boolean isResign) {
        this.isResign = isResign;
    }

    public Date getAdminLeave() {
        return adminLeave;
    }

    public void setAdminLeave(Date adminLeave) {
        this.adminLeave = adminLeave;
    }
}