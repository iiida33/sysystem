package com.lps.controller;

import com.lps.po.Customer;
import com.lps.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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
//        //原始名称
//        String originalFilename = pic.getOriginalFilename();
//        //上传图片
//        if (pic != null && originalFilename != null && originalFilename.length() > 0) {
//            //存储图片的物理路径
//            String pic_path = "D:\\WorkPlace\\Temp\\sypic\\custom\\";
//            //新的图片名称
//            String newFileName = UUID.randomUUID() + originalFilename.substring(originalFilename.lastIndexOf("."));
//            //新图片
//            File newFile = new File(pic_path + newFileName);
//            //将内存中的数据写入磁盘
//            pic.transferTo(newFile);
//            //将新图片名称写到itemsCustom中
//            customer.setCustPic(newFileName);
//        }
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

}
