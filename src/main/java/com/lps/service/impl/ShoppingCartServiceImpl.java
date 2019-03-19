package com.lps.service.impl;

import com.lps.po.ShoppingCart;
import com.lps.service.IShoppingCartService;
import com.lps.vo.ShoppingCartGoodSku;
import org.springframework.stereotype.Service;

/**
 * @ClassName: ShoppingCartServiceImpl
 * @Description:
 * @Author: 梁培珊
 * @Date: 8:25 2019/3/17
 **/
@Service
public class ShoppingCartServiceImpl implements IShoppingCartService {
    @Override
    public void insertCart(ShoppingCart shoppingCart) {

    }

    @Override
    public void deleteByCartId(int cartId) {

    }

    @Override
    public void deleteByCustId(int custId) {

    }

    @Override
    public ShoppingCartGoodSku findByCustId(int custId) {
        return null;
    }

    @Override
    public void updateCart(ShoppingCart shoppingCart) {

    }
}
