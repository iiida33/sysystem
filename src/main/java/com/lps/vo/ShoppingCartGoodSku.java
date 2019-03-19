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

    @Override
    public String toString() {
        return "ShoppingCartGoodSku{" +
                "goodSku=" + goodSku +
                ", money=" + money +
                '}';
    }

    public GoodSku getGoodSku() {
        return goodSku;
    }

    public void setGoodSku(GoodSku goodSku) {
        this.goodSku = goodSku;
    }

    public double getMoney() { ;
        return goodSku.getSkuPrice()*getCartCount();
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
