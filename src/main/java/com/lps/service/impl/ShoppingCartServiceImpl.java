package com.lps.service.impl;

import com.lps.po.ShoppingCart;
import com.lps.service.IShoppingCartService;
import com.lps.vo.ShoppingCartGoodSku;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: ShoppingCartServiceImpl
 * @Description:
 * @Author: 梁培珊
 * @Date: 8:25 2019/3/17
 **/
@Service
public class ShoppingCartServiceImpl implements IShoppingCartService {

    @Autowired
    private ShoppingCartMapper shoppingCartMapper;

    @Override
    public void insertCart(ShoppingCart shoppingCart) {
        shoppingCartMapper.insertSelective(shoppingCart);
    }

    @Override
    public void deleteByCartId(int cartId) {
        shoppingCartMapper.deleteByPrimaryKey(cartId);
    }

    @Override
    public void deleteByCustId(int custId) {
        shoppingCartMapper.deleteByCustId(custId);
    }

    @Override
    public List<ShoppingCartGoodSku> findByCustId(int custId) {
        return shoppingCartMapper.selectShopCartAndSku(custId);
    }

    @Override
    public void updateCart(ShoppingCart shoppingCart) {
        shoppingCartMapper.updateByPrimaryKeySelective(shoppingCart);
    }
}
