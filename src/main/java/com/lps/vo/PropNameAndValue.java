package com.lps.vo;

import com.lps.po.PropName;
import com.lps.po.PropValue;

/**
 * @ClassName: PropNameAndValue
 * @Description: 属性及其某个值信息
 * @Author: 梁培珊
 * @Date: 10:38 2019/3/22
 **/
public class PropNameAndValue extends PropName {

    private PropValue propValue;

    @Override
    public String toString() {
        return "PropNameAndValue{" +
                "propValue=" + propValue +
                '}';
    }

    public PropValue getPropValue() {
        return propValue;
    }

    public void setPropValue(PropValue propValue) {
        this.propValue = propValue;
    }
}
