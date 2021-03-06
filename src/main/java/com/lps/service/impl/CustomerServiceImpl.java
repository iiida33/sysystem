package com.lps.service.impl;

import com.lps.exception.CustomException;
import com.lps.mapper.CollectMapper;
import com.lps.mapper.CustomerMapper;
import com.lps.po.Customer;
import com.lps.po.CustomerExample;
import com.lps.service.ICustomerService;
import com.lps.vo.CustomerShowModel;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @ClassName: CustomerServiceImpl
 * @Description:
 * @Author: 梁培珊
 * @Date: 8:17 2019/3/17
 **/
@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private CollectMapper collectMapper;

    @Override
    public void updateCustomerSelective(Customer customer) throws CustomException {
        Customer customer1 = new Customer();
        customer1 = customerMapper.selectByPhone(customer.getCustPhone());
        if (customer1!=null&&customer.getCustId() !=customer1.getCustId() )
            throw new CustomException("该手机号码已被注册，请修改");
        customer1 = customerMapper.selectByUserName(customer.getCustUsername());
        if (customer1!=null&&customer.getCustId() !=customer1.getCustId() )
            throw new CustomException("该会员名已被存在，请修改");
        if (customer.getCustEmail()!="")
        {
            customer1 = customerMapper.selectByEmail(customer.getCustEmail());
            if (customer1!=null&&customer.getCustId() !=customer1.getCustId() )
                throw new CustomException("该电子邮箱已被注册，请修改");
        }
        customerMapper.updateByPrimaryKeySelective(customer);
    }

    @Override
    public void insertCustomer(Customer customer) throws CustomException {
        if (customerMapper.selectByPhone(customer.getCustPhone()) != null)
            throw new CustomException("该手机号已存在", "501");
        if (customerMapper.selectByUserName(customer.getCustUsername()) != null)
            throw new CustomException("该用户名已存在", "502");
        customerMapper.insertCustomer(customer);
    }

    @Override
    public void deleteById(int id) throws CustomException {
        Date date1 = customerMapper.selectCurrentBuyTime(id);
        if (date1==null){
            collectMapper.deleteByCustId(id);
            customerMapper.deleteByPrimaryKey(id);
            return;
        }
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        Date date2 = new Date();// new Date()为获取当前系统时间
        long from1 = date1.getTime();
        long to1 = date2.getTime();
        int days = (int) ((to1 - from1) / (1000 * 60 * 60 * 24));
        if (days<=180)
        {
            throw new CustomException("该用户近半年进行过消费，不能删除！");
        }
        collectMapper.deleteByCustId(id);
        customerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdBatch(int[] ids) {
        for (int id : ids) {
            collectMapper.deleteByCustId(id);
            customerMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public Customer findById(int id) {
        return customerMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Customer> findAll(Customer customer) {
        List<Customer> customers = customerMapper.selectCustomerSelective(customer);
        return customers;
    }

    @Override
    public Customer findLoginMsg(String string, String password) throws CustomException {
        Customer customer = null;
        if (Pattern.matches("^([A-Za-z0-9_\\-\\.])+\\@([A-Za-z0-9_\\-\\.])+\\.([A-Za-z]{2,4})$", string)) {
            customer = customerMapper.selectByEmail(string);
        }
        if (Pattern.matches("^[1][3,4,5,7,8][0-9]{9}$", string)) {
            customer = customerMapper.selectByPhone(string);
        }
        if (customer != null && customer.getCustPassword().equals(password))
            return customer;
        else
            customer=customerMapper.selectByUserName(string);
        if (customer != null && customer.getCustPassword().equals(password))
            return customer;
        else
            throw new CustomException("您输入的密码和账户名不匹配！");
    }

    @Override
    public void updatePassword(int custId, String custPassword) {
        Customer customer = new Customer();
        customer.setCustId(custId);
        customer.setCustPassword(custPassword);
        customerMapper.updatePassword(customer);
    }
}
