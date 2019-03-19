package com.lps.po;

public class PropValue {
    private Integer pvId;

    private String pvName;

    private Integer pnId;

    public Integer getPvId() {
        return pvId;
    }

    public void setPvId(Integer pvId) {
        this.pvId = pvId;
    }

    public String getPvName() {
        return pvName;
    }

    public void setPvName(String pvName) {
        this.pvName = pvName == null ? null : pvName.trim();
    }

    public Integer getPnId() {
        return pnId;
    }

    public void setPnId(Integer pnId) {
        this.pnId = pnId;
    }
}