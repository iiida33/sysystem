package com.lps.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lps.po.ShoppingCart;
import com.lps.po.ShoppingCartExample;
import com.lps.service.IPropsService;
import com.lps.service.IShoppingCartService;
import com.lps.vo.PropNameAndValue;
import com.lps.vo.ShoppingCartGoodSku;
import com.sun.deploy.panel.ITreeNode;
import com.sun.webkit.ContextMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: ShoppingCartController
 * @Description:
 * @Author: 梁培珊
 * @Date: 8:29 2019/3/17
 **/
@Controller
@RequestMapping("/shoppingCart")
public class ShoppingCartController {

    @Autowired
    private IShoppingCartService shoppingCartService;

    //展示购物车商品信息
    @RequestMapping("/shoppingCartList.do")
    @ResponseBody
    public String shoppingCartList(int custId) {
        List<ShoppingCartGoodSku> shoppingCartGoodSkus = shoppingCartService.findByCustId(custId);
        int len = shoppingCartGoodSkus.size();
        double totalMoney = 0;
        for (ShoppingCartGoodSku shoppingCartGoodSku : shoppingCartGoodSkus) {
            totalMoney += shoppingCartGoodSku.getMoney();
        }
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("shoppingCartGoodSkus", shoppingCartGoodSkus);
        jsonObject.put("totallMoney", totalMoney);
        jsonObject.put("count", len);
        String shoppingCartJsonStr = JSON.toJSONString(jsonObject);
        return shoppingCartJsonStr;
    }

    //    购物车页面跳转
    @RequestMapping("/shopCartPage.do")
    public String shopCartPage(Integer custId, HttpServletRequest request) {
        List<ShoppingCartGoodSku> shoppingCartGoodSkus = shoppingCartService.findByCustId(custId);
        int len = shoppingCartGoodSkus.size();
        if (len > 0) {
            request.setAttribute("state", true);
        } else {
            request.setAttribute("state", false);
        }
        request.setAttribute("shoppingCartGoodSkus", shoppingCartGoodSkus);
        return "customer/shoppingCart.jsp";
    }

    //删除某顾客的购物车信息
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
    //    修改购物车信息
    @RequestMapping("/changeShopCart.do")
    @ResponseBody
    public void changeShopCart(ShoppingCart shoppingCart){
        shoppingCartService.updateCart(shoppingCart);
    }
//    删除某条购物车信息
    @RequestMapping("/deleteOneCartRecord.do")
    public String deleteOneByCartId(int cartId, HttpSession session,HttpServletRequest request){
        int custId= (int) session.getAttribute("custId");
        shoppingCartService.deleteByCartId(cartId);
        return "redirect:/shoppingCart/shopCartPage.do?custId="+custId;
    }
//    @RequestMapping("/toCheckOutPage.do")
//    public String toCheckOutPage(String cartIds){
//        return "redirect:/customer/checkout-page.jsp";
//    }
}
