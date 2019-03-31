package com.lps.po;

public class PropValue {
    private String pvId;

    private String pvName;

    private Integer pnId;

    public String getPvId() {
        return pvId;
    }

    public void setPvId(String pvId) {
        this.pvId = pvId == null ? null : pvId.trim();
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