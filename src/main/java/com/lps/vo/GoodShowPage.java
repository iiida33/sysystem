package com.lps.vo;

import com.lps.po.GoodSku;

import java.util.List;

/**
 * @ClassName: GoodShowPage
 * @Description:
 * @Author: 梁培珊
 * @Date: 15:04 2019/3/18
 **/
public class GoodShowPage extends GoodAndPic {
    private List<GoodSku> goodSkus;

    @Override
    public List<GoodSku> getGoodSkus() {
        return goodSkus;
    }

    @Override
    public void setGoodSkus(List<GoodSku> goodSkus) {
        this.goodSkus = goodSkus;
    }

    @Override
    public String toString() {
        return "GoodShowPage{" +
                "goodSkus=" + goodSkus +
                '}';
    }
}
