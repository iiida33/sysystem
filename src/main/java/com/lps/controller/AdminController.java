package com.lps.controller;

import com.lps.exception.CustomException;
import com.lps.po.Admin;
import com.lps.service.IAdminService;
import com.lps.service.MessageShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: AdminController
 * @Description:
 * @Author: 梁培珊
 * @Date: 8:26 2019/3/17
 **/
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private IAdminService adminService;
    @Autowired
    private MessageShowService showService;

    @RequestMapping("/showWelcomeMsg.do")
    @ResponseBody
    public Map<String,Integer> showWelcomeMsg(HttpServletRequest request){
        Map<String,Integer> map = new HashMap<>();
        map = showService.welcomeMsg();
        return map;
    }
}
