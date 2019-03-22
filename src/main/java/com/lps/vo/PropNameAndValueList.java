package com.lps.vo;

import com.lps.po.PropName;
import com.lps.po.PropValue;

import java.util.List;

/**
 * @ClassName: PropNameAndValueList
 * @Description: 属性及其所有值信息
 * @Author: 梁培珊
 * @Date: 10:42 2019/3/22
 **/
public class PropNameAndValueList extends PropName {

    private List<PropValue> propValues;

    @Override
    public String toString() {
        return "PropNameAndValueList{" +
                "propValues=" + propValues +
                '}';
    }

    public List<PropValue> getPropValues() {
        return propValues;
    }

    public void setPropValues(List<PropValue> propValues) {
        this.propValues = propValues;
    }
}
