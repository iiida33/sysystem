package com.lps.controller;

import com.lps.po.DeliveryInfo;
import com.lps.service.IDeliveryInfoService;
import com.lps.service.IOrderService;
import com.lps.service.IShoppingCartService;
import com.lps.vo.ShoppingCartGoodSku;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: OrderController
 * @Description:
 * @Author: 梁培珊
 * @Date: 8:29 2019/3/17
 **/
@Controller
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private IOrderService orderService;
    @Autowired
    private IDeliveryInfoService deliveryInfoService;
    @Autowired
    private IShoppingCartService shoppingCartService;

    @RequestMapping("/toCheckOutPage.do")
    public String toCheckOutPage(String cartIds, HttpServletRequest request, HttpSession session) {
        int custId= (int) session.getAttribute("custId");
        String[] cartId=cartIds.split(",");
        double tatalmoney=0.0;
        List<DeliveryInfo> deliveryInfos = deliveryInfoService.fingByCustId(custId);
        List<ShoppingCartGoodSku> shoppingCartGoodSkus = shoppingCartService.findMasForCheckOutPage(cartId);
        for(ShoppingCartGoodSku shoppingCartGoodSkus1:shoppingCartGoodSkus)
        {
            tatalmoney+=shoppingCartGoodSkus1.getMoney();
        }
        int deliverMsgLen = deliveryInfos.size();
        int shopCartLen = shoppingCartGoodSkus.size();
        request.setAttribute("deliveryInfos",deliveryInfos);
        request.setAttribute("tatalmoney",tatalmoney);
        request.setAttribute("shoppingCartGoodSkus",shoppingCartGoodSkus);
        request.setAttribute("deliverMsgLen",deliverMsgLen);
        request.setAttribute("shopCartLen",shopCartLen);
        return "/customer/checkout-page.jsp";
    }

}
