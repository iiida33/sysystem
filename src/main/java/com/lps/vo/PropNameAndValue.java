package com.lps.vo;

import com.lps.po.PropName;
import com.lps.po.PropValue;

/**
 * @ClassName: PropNameAndValue
 * @Description: 属性及其某个值信息
 * @Author: 梁培珊
 * @Date: 10:38 2019/3/22
 **/
public class PropNameAndValue {

    private Integer pnId;

    private String pnName;

    private String pvId;

    private String pvName;

    @Override
    public String toString() {
        return "PropNameAndValue{" +
                "pnId=" + pnId +
                ", pnName='" + pnName + '\'' +
                ", pvId='" + pvId + '\'' +
                ", pvName='" + pvName + '\'' +
                '}';
    }

    public Integer getPnId() {
        return pnId;
    }

    public void setPnId(Integer pnId) {
        this.pnId = pnId;
    }

    public String getPnName() {
        return pnName;
    }

    public void setPnName(String pnName) {
        this.pnName = pnName;
    }

    public String getPvId() {
        return pvId;
    }

    public void setPvId(String pvId) {
        this.pvId = pvId;
    }

    public String getPvName() {
        return pvName;
    }

    public void setPvName(String pvName) {
        this.pvName = pvName;
    }
}
