package com.lps.service;

import com.lps.po.ShoppingCart;
import com.lps.vo.ShoppingCartGoodSku;

import java.util.List;

public interface IShoppingCartService {
    //    添加商品进购物车
    public void insertCart(ShoppingCart shoppingCart);

    //    根据主键删除购物车信息
    public void deleteByCartId(int cartId);

    //    根据顾客Id删除购物信息
    public void deleteByCustId(int custId);

    //    顾客查看购物车信息
    public List<ShoppingCartGoodSku> findByCustId(int custId);

    //    根据主键修改购物车信息
    public void updateCart(ShoppingCart shoppingCart);

    //    根据主键组查询购物车信息供结算页面使用
    public List<ShoppingCartGoodSku> findMasForCheckOutPage(String[] cartIds);
}
