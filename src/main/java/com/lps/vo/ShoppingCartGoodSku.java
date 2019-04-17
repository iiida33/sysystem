package com.lps.vo;

import com.lps.po.GoodSku;
import com.lps.po.ShoppingCart;

/**
 * @ClassName: ShoppingCartGoodSku
 * @Description: 购物车关联商品sku信息
 * @Author: 梁培珊
 * @Date: 15:51 2019/3/18
 **/
public class ShoppingCartGoodSku extends ShoppingCart {
    private GoodSku goodSku;

    private double money;

    private String props;

    private String goodName;

    private String goodBrand;

    @Override
    public String toString() {
        return "ShoppingCartGoodSku{" +
                "goodSku=" + goodSku +
                ", money=" + money +
                ", props='" + props + '\'' +
                ", goodName='" + goodName + '\'' +
                ", goodBrand='" + goodBrand + '\'' +
                '}';
    }

    public GoodSku getGoodSku() {
        return goodSku;
    }

    public void setGoodSku(GoodSku goodSku) {
        this.goodSku = goodSku;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getProps() {
        return props;
    }

    public void setProps(String props) {
        this.props = props;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodBrand() {
        return goodBrand;
    }

    public void setGoodBrand(String goodBrand) {
        this.goodBrand = goodBrand;
    }
}
