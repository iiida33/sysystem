package com.lps.controller;

import com.lps.po.Customer;
import com.lps.utils.CaptchaUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: loginRegisterController
 * @Description: 顾客登录注册/管理员登录
 * @Author: 梁培珊
 * @Date: 8:15 2019/3/16
 **/
@Controller
public class LoginRegisterController {



//实现顾客登录注册功能
    // 获取顾客登陆界面
    @RequestMapping("/")
    public String getCustomerLoginPage(){
        return "customer/login.html";
    }

    @RequestMapping(value = "/changeCode.do")
    @ResponseBody
    public void getValidateCode(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        // 验证码存储在session的identifyingCode，属性中
        CaptchaUtil.outputCaptcha(request, response);
    }

//    //顾客登录
//    @RequestMapping(value = "/customerLogin.do")
//    @ResponseBody
//    public Map<String,String> customerLogin(Model model, HttpSession httpSession,String custPhone,String custUsername,
//                                            String custPassword, String validateCode)
//    {
//        String code = (String) httpSession.getAttribute("validateCode");
//        HashMap<String, String> map = new HashMap<String, String>();
//        if(validateCode.equalsIgnoreCase(code)){
//            Customer customer = null;
//            try {
//                customer = loginService.findEmployeeByIdAndPassword(username, password);
//            } catch (Exception e) {
//                map.put("msg",e.getMessage());
//                map.put("status","500");
//                return map;
//            }
//            // 保存到session
//            httpSession.setAttribute("employeeId",customer.geteId());
//            map.put("url","/loginSuccess.do");
//            map.put("msg","成功");
//            map.put("status","200");
//            return map;
//        }else{
//            map.put("msg","验证码错误");
//            map.put("status","0");
//            return map;
//        }
//    }

    //顾客成功登录
    @RequestMapping(value = "/loginSuccess.do")
    public String loginSucceses(Model model) throws Exception
    {
        return "Customer/index.html";
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

    // 顾客退出登录
    @RequestMapping(value = "/logout.do")
    public String logout(HttpSession httpSession){
        httpSession.removeAttribute("employeeId");
        return "redirect:/";
    }

//实现管理员登录功能
    // 获取管理员登陆界面
    @RequestMapping("/admin.do")
    public String getAdminLoginPage(){
        return "admin/adminLogin.html";
    }

    // 获取管理员账号信息以显示
//    @RequestMapping(value = "/getAdminAccount.do")
//    @ResponseBody
//    public String getAdminAccount(HttpSession httpSession){
//        SystemManager systemManager = (SystemManager) httpSession.getAttribute("admin");
//        //        SystemManager manager = loginService.findSystemManagerById(id);
//        return systemManager.getSmAccount();
//    }

    // 管理员退出登录
    @RequestMapping(value = "/logoutAdmin.do")
    public String logoutAdmin(HttpSession httpSession){
        httpSession.removeAttribute("admin");
        return "redirect:/index.html";
    }
}
