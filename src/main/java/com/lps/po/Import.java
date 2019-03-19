package com.lps.po;

import java.util.Date;

public class Import {
    private Integer importId;

    private Integer skuId;

    private Double importCost;

    private Integer importCount;

    private String importBus;

    private Integer adminId;

    private Date importDate;

    public Integer getImportId() {
        return importId;
    }

    public void setImportId(Integer importId) {
        this.importId = importId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Double getImportCost() {
        return importCost;
    }

    public void setImportCost(Double importCost) {
        this.importCost = importCost;
    }

    public Integer getImportCount() {
        return importCount;
    }

    public void setImportCount(Integer importCount) {
        this.importCount = importCount;
    }

    public String getImportBus() {
        return importBus;
    }

    public void setImportBus(String importBus) {
        this.importBus = importBus == null ? null : importBus.trim();
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(Date importDate) {
        this.importDate = importDate;
    }
}