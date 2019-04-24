package com.lps.controller;

import com.lps.exception.CustomException;
import com.lps.po.Admin;
import com.lps.po.Customer;
import com.lps.service.IAdminService;
import com.lps.service.ICustomerService;
import com.lps.utils.CaptchaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: loginRegisterController
 * @Description: 顾客登录注册/管理员登录
 * @Author: 梁培珊
 **/
@Controller
public class LoginRegisterController {

    @Autowired
    private IAdminService adminService;

    @Autowired
    private ICustomerService customerService;

    // 验证码获取
    @RequestMapping("/changeCode.do")
    @ResponseBody
    public void getValidateCode(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // 验证码存储在session的identifyingCode，属性中
        CaptchaUtil.outputCaptcha(request, response);
    }

    // 显示首页
    @RequestMapping("/")
    public String getIndex() {
        return "customer/index.jsp";
    }

//    @RequestMapping("/getIndexState.do")
//    @ResponseBody
//    public int getIndexState(HttpSession session) {
//        if (session.getAttribute("custId") != null)
//            return 1;
//        return 0;
//    }

    //实现顾客登录注册功能
    // 获取顾客登陆界面
    @RequestMapping("/login.do")
    public String getCustomerLoginPage() {
        return "customer/login.jsp";
    }

    // 顾客注册
    @RequestMapping("/customerRegister.do")
    @ResponseBody
    public Map<String, String> customerRegister(HttpSession httpSession, HttpServletRequest request) {
        String custUsername = request.getParameter("custUsername");
        String custPassword = request.getParameter("custPassword");
        String custPhone = request.getParameter("custPhone");
        String validateCode = request.getParameter("validateCode");
        String code = (String) httpSession.getAttribute("validateCode");
        Date date = new java.sql.Date(new java.util.Date().getTime());
        //        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        //        df.format(new Date());
        Customer customer = new Customer();
        customer.setCustUsername(custUsername);
        customer.setCustPhone(custPhone);
        customer.setCustPassword(custPassword);
        customer.setCustCreate(date);
        HashMap<String, String> map = new HashMap<String, String>();
        if (validateCode.equalsIgnoreCase(code)) {
            try {
                customerService.insertCustomer(customer);
            } catch (CustomException ce) {
                map.put("msg", ce.getMessage());
                map.put("status", ce.getStatus());
                return map;
            }
            // 保存到session
            httpSession.setAttribute("custId", customer.getCustId());
            httpSession.setAttribute("customerName", customer.getCustName());
            map.put("msg", "成功");
            map.put("status", "200");
            return map;
        } else {
            map.put("msg", "验证码错误");
            map.put("status", "0");
            return map;
        }
    }

    //顾客登录
    @RequestMapping("/customerLogin.do")
    @ResponseBody
    public Map<String, String> customerLogin(HttpSession httpSession, String loginName, String custPassword) {
        HashMap<String, String> map = new HashMap<String, String>();
        Customer customer = null;
        try {
            customer = customerService.findLoginMsg(loginName, custPassword);
        } catch (Exception e) {
            map.put("msg", e.getMessage());
            map.put("status", "500");
            return map;
        }
        // 保存到session
        httpSession.setAttribute("custId", customer.getCustId());
        httpSession.setAttribute("customerName", customer.getCustUsername());
        map.put("msg", "成功");
        map.put("status", "200");
        return map;
    }

    //顾客成功登录
    @RequestMapping("/customerLoginSuccess.do")
    public String customerLoginSuccess() throws Exception {
        return "customer/index.jsp";
    }

    // 顾客退出登录
    @RequestMapping(value = "/logout.do")
    public String logout(HttpSession httpSession) {
        httpSession.removeAttribute("custId");
        httpSession.removeAttribute("customerName");
        return "redirect:/";
    }

    // 获取顾客账号信息以显示
    //    @RequestMapping(value = "/getCustomerAccount.do")
    //    @ResponseBody
    //    public Map<String,String> getCustomerAccount(HttpSession httpSession){
    //        Integer id = (Integer) httpSession.getAttribute("employeeId");
    //        Employee employee = loginService.findEmployeeById(id);
    //        HashMap<String, String> map = new HashMap<String, String>();
    //        map.put("account",employee.geteAccount());
    //        map.put("name",employee.geteName());
    //        return map;
    //    }

    //实现管理员登录功能
    // 获取管理员登陆界面
    @RequestMapping("/admin.do")
    public String getAdminLoginPage() {
        return "admin/adminLogin.jsp";
    }

    //    管理员登录验证
    @RequestMapping("/adminLogin.do")
    @ResponseBody
    public Map<String, String> adminLogin(String adminNum,String adminPassword,HttpSession httpSession) {

        HashMap<String, String> map = new HashMap<String, String>();
        int adminId=Integer.parseInt(adminNum);
        Admin admin = new Admin();
        try {
            admin = adminService.findByNumAndPassword(adminId, adminPassword);
        } catch (CustomException e) {
            map.put("msg", e.getMessage());
            map.put("status", "500");
            return map;
        }
        // 保存到session
        httpSession.setAttribute("adminId", admin.getAdminNum());
        httpSession.setAttribute("adminName", admin.getAdminName());
        map.put("url", "toPage.do?url=admin/index.jsp");
        map.put("msg", "成功");
        map.put("status", "200");
        return map;
    }

    // 管理员退出登录
    @RequestMapping(value = "/logoutAdmin.do")
    public String logoutAdmin(HttpSession httpSession) {
        httpSession.removeAttribute("adminId");
        httpSession.removeAttribute("adminName");
        return "redirect:/";
    }
}
