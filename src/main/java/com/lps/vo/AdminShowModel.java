package com.lps.vo;

import java.util.Date;

/**
 * @ClassName: AdminShowModel
 * @Description: 管理员信息列表项
 * @Author: 梁培珊
 * @Date: 17:29 2019/3/17
 **/
public class AdminShowModel {
    private Integer adminId;

    private Integer adminNum;

    private String adminName;

    private String adminSex;

    private Date adminEntry;

    private Integer adminAuthority;

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

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminSex() {
        return adminSex;
    }

    public void setAdminSex(String adminSex) {
        this.adminSex = adminSex;
    }

    public Date getAdminEntry() {
        return adminEntry;
    }

    public void setAdminEntry(Date adminEntry) {
        this.adminEntry = adminEntry;
    }

    public Integer getAdminAuthority() {
        return adminAuthority;
    }

    public void setAdminAuthority(Integer adminAuthority) {
        this.adminAuthority = adminAuthority;
    }

    public Boolean getResign() {
        return isResign;
    }

    public void setResign(Boolean resign) {
        isResign = resign;
    }

    public Date getAdminLeave() {
        return adminLeave;
    }

    public void setAdminLeave(Date adminLeave) {
        this.adminLeave = adminLeave;
    }

    @Override
    public String toString() {
        return "AdminShowModel{" +
                "adminId=" + adminId +
                ", adminNum=" + adminNum +
                ", adminName='" + adminName + '\'' +
                ", adminSex='" + adminSex + '\'' +
                ", adminEntry=" + adminEntry +
                ", adminAuthority=" + adminAuthority +
                ", isResign=" + isResign +
                ", adminLeave=" + adminLeave +
                '}';
    }
}
