package com.lps.vo;

import com.lps.po.Good;
import com.lps.po.GoodPic;
import com.lps.po.GoodSku;

import java.util.List;

/**
 * @ClassName: GoodAndPic
 * @Description:
 * @Author: 梁培珊
 * @Date: 14:55 2019/3/18
 **/
public class GoodAndPic extends Good {
    public List<GoodPic> getGoodPics() {
        return goodPics;
    }

    public void setGoodPics(List<GoodPic> goodPics) {
        this.goodPics = goodPics;
    }

    public List<GoodSku> getGoodSkus() {
        return goodSkus;
    }

    public void setGoodSkus(List<GoodSku> goodSkus) {
        this.goodSkus = goodSkus;
    }

    private List<GoodPic> goodPics;

    private List<GoodSku> goodSkus;

    @Override
    public String toString() {
        return "GoodAndPic{" +
                "goodPics=" + goodPics +
                ", goodSkus=" + goodSkus +
                '}';
    }
}
