package com.lps.controller;

import com.lps.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("/toCheckOutPage.do")
        public String toCheckOutPage(String cartIds){
            return "/customer/checkout-page.jsp";
        }

}
