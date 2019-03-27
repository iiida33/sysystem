package com.lps.service.impl;

import com.lps.exception.CustomException;
import com.lps.mapper.CollectMapper;
import com.lps.mapper.CustomerMapper;
import com.lps.po.Customer;
import com.lps.po.CustomerExample;
import com.lps.service.ICustomerService;
import com.lps.vo.CustomerShowModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Matcher;
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
        Customer customer1 = customerMapper.selectByPrimaryKey(customer.getCustId());
        if (customer1.getCustPhone() == customer.getCustPhone())
            throw new CustomException("手机号码已注册", "501");
        if (customer1.getCustUsername() == customer.getCustUsername())
            throw new CustomException("会员名已存在", "502");
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
    public void deleteById(int id) {
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
    public List<CustomerShowModel> findAll() {
        return customerMapper.findAllToShow();
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
}
