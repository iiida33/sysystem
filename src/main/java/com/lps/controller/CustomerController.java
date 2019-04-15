package com.lps.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lps.exception.CustomException;
import com.lps.po.Customer;
import com.lps.service.ICustomerService;
import com.lps.vo.CustomerPages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: CustomerController
 * @Description:
 * @Author: 梁培珊
 * @Date: 8:27 2019/3/17
 **/
@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @RequestMapping("/getCustInfo.do")
    public String getCustInfo(HttpSession session, Model model) {
        int custId = (int) session.getAttribute("custId");
        Customer customer = customerService.findById(custId);
        model.addAttribute("customer", customer);
        model.addAttribute("state", 1);
        return "customer/infoManager.jsp";
    }

    @RequestMapping(value = "/editCustInfo.do", method = RequestMethod.POST)
    @ResponseBody
    public Map<String, String> editCustInfo(HttpSession session, HttpServletRequest request, Customer customer/*, MultipartFile pic*/
    ) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        customer.setCustId((Integer) session.getAttribute("custId"));
        try {
            customerService.updateCustomerSelective(customer);
        } catch (Exception e) {
            map.put("msg", e.getMessage());
            map.put("state", "500");
            return map;
        }
        session.setAttribute("customerName", customer.getCustUsername());
        map.put("msg", "修改成功！");
        map.put("state", "200");
        return map;
    }

    @RequestMapping("/changePassword.do")
    @ResponseBody
    public Map<String,String> changePassword(HttpSession session,String custPassword,String newPassword){
        HashMap<String, String> map = new HashMap<String, String>();
        int id = (int) session.getAttribute("custId");
        Customer customer = customerService.findById(id);
        if (!(customer.getCustPassword().equals(custPassword))){
            map.put("status","500");
            map.put("msg","原密码错误！");
            return map;
        }
        customerService.updatePassword(id,newPassword);
        map.put("status","200");
        map.put("msg","修改成功！");
        return map;
    }

    @RequestMapping("/changePassword1.do")
    @ResponseBody
    public void changePassword1(int custId,String custPassword){
        customerService.updatePassword(custId,custPassword);
    }

    @RequestMapping("/showAllCustomerMsg.do")
    @ResponseBody
    public CustomerPages showAllCustomerMsg(
            @RequestParam(value="page", defaultValue="1")int pageNum,
            @RequestParam(value="limit", defaultValue="5") int limit,
            @RequestParam(value="custUsername", defaultValue="") String custUsername){
        List<Customer> customers;
        Customer customer = new Customer();
        customer.setCustUsername(custUsername);
        //pageNum:起始页面  pageSize:每页的大小
        PageHelper.startPage(pageNum,limit);
        //查找条件，一定要紧跟在startPage后
        customers = customerService.findAll(customer);
        PageInfo pageResult = new PageInfo(customers);
        //设置前台需要的数据
        CustomerPages customerPages = new CustomerPages();
        customerPages.setCode(0);
        customerPages.setMsg("");
        customerPages.setCount((int)pageResult.getTotal());
        customerPages.setData(pageResult.getList());
        return customerPages;
    }

    @RequestMapping("/deleteCustomer.do")
    @ResponseBody
    public Map<String,String> deleteCustomer(int custId){
        Map<String,String> map = new HashMap<>();
        try{
            customerService.deleteById(custId);
        }
        catch (CustomException ce){
            map.put("status","500");
            map.put("msg",ce.getMessage());
            return map;
        }
        map.put("status","200");
        map.put("msg","删除用户成功！");
        return map;
    }
}
