package com.lps.controller;

import com.lps.exception.CustomException;
import com.lps.po.Admin;
import com.lps.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    //    管理员登录验证
    @RequestMapping("/adminLogin.do")
    @ResponseBody
    public Map<String, String> adminLogin(Model model, HttpSession httpSession, Integer adminNum,
                                          String adminPassword) {

        HashMap<String, String> map = new HashMap<String, String>();

        Admin admin = null;
        try {
            admin = adminService.findByNumAndPassword(adminNum, adminPassword);
        } catch (CustomException e) {
            model.addAttribute("msg",e.getMessage());
            map.put("msg", e.getMessage());
            map.put("status", "500");
            return map;
        }
        // 保存到session
        httpSession.setAttribute("admin", admin);
        map.put("url", "toPage.do?url=admin/index.html");
        map.put("msg", "成功");
        map.put("status", "200");
        return map;
    }



}
