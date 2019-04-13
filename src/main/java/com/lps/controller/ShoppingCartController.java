package com.lps.controller;

import com.lps.po.ShoppingCart;
import com.lps.po.ShoppingCartExample;
import com.lps.service.IShoppingCartService;
import com.lps.vo.ShoppingCartGoodSku;
import com.sun.deploy.panel.ITreeNode;
import com.sun.webkit.ContextMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ClassName: ShoppingCartController
 * @Description:
 * @Author: 梁培珊
 * @Date: 8:29 2019/3/17
 **/
@Controller
public class ShoppingCartController {

    @Autowired
    private IShoppingCartService shoppingCartService;

    //展示购物车商品信息
    @RequestMapping("/shoppingCartList.do")
    @ResponseBody
    public List<ShoppingCartGoodSku> shoppingCartList(int custId) {
        List<ShoppingCartGoodSku> shoppingCartGoodSkus = shoppingCartService.findByCustId(custId);
        return shoppingCartGoodSkus;
    }

    //删除购物车商品信息
    @RequestMapping("/deleteShoppingCart.do")
    public void deleteShoppingCart(HttpServletRequest request) {
        Integer custId = Integer.valueOf(request.getParameter("custId"));
        List<ShoppingCartGoodSku> shoppingCartGoodSkus = shoppingCartService.findByCustId(custId);
        for (ShoppingCartGoodSku shoppingCartGoodSkus1 : shoppingCartGoodSkus) {
            shoppingCartService.deleteByCustId(shoppingCartGoodSkus1.getCustId());
        }
    }

    //添加商品到购物车
    @RequestMapping("/addShoppingCart.do")
    public void addShoppingCart(HttpServletRequest request) {
        ShoppingCart shoppingCart = null;
        int custId = Integer.parseInt(request.getParameter("custId"));
        int skuId = Integer.parseInt(request.getParameter("skuId"));
        int cartCount = Integer.parseInt(request.getParameter("cartCount"));
        shoppingCart.setCustId(custId);
        shoppingCart.setSkuId(skuId);
        shoppingCart.setCartCount(cartCount);
        shoppingCartService.insertCart(shoppingCart);
    }
}
