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
        Customer customer1=customerMapper.selectByPrimaryKey(customer.getCustId());
        if (customer1.getCustUsername() == customer.getCustUsername())
            throw new CustomException("会员名已存在");
        if (customer1.getCustPhone() == customer.getCustPhone())
            throw new CustomException("手机号码已注册");
        customerMapper.updateByPrimaryKeySelective(customer);
    }

    @Override
    public void insertCustomer(Customer customer) throws CustomException {
        int count1=0,count2=0;
        CustomerExample customerExample = new CustomerExample();
        CustomerExample.Criteria criteria = customerExample.createCriteria();
        criteria.andCustPhoneEqualTo(customer.getCustPhone());
        count1 = customerMapper.countByExample(customerExample);
        customerExample.clear();
        criteria.andCustUsernameEqualTo(customer.getCustUsername());
        count2 = customerMapper.countByExample(customerExample);
        if (count1>0) throw new CustomException("该号码已被注册！");
        if(count2>0) throw new CustomException("该会员名已存在！");
        customerMapper.insertSelective(customer);
    }

    @Override
    public void deleteById(int id) {
        collectMapper.deleteByCustId(id);
        customerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void deleteByIdBatch(int[] ids) {
        for (int id : ids)
        {
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
    public Customer findLoginMsg(String string, String password)throws CustomException {
        Customer customer;
        CustomerExample customerExample = new CustomerExample();
        CustomerExample.Criteria criteria = customerExample.createCriteria();
        Pattern p1 = Pattern.compile("^([A-Za-z0-9_\\-\\.])+\\@([A-Za-z0-9_\\-\\.])+\\.([A-Za-z]{2,4})$");
        Matcher m1 = p1.matcher(string);
        Pattern p2 = Pattern.compile("^[1][3,4,5,7,8][0-9]{9}$");
        Matcher m2 = p2.matcher(string);
        if(m1.matches()||m2.matches()){
            if(m1.matches()){
                criteria.andCustEmailEqualTo(string);
            }
            if (m2.matches()){
                criteria.andCustPhoneEqualTo(string);
            }
            criteria.andCustPasswordEqualTo(password);
            customer=customerMapper.selectByExample(customerExample).get(0);
            if (customer!=null) return customer;
            else customerExample.clear();
        }
        criteria.andCustUsernameEqualTo(string);
        criteria.andCustPasswordEqualTo(password);
        customer=customerMapper.selectByExample(customerExample).get(0);
        if (customer!=null) return customer;
        else throw new CustomException("您输入的密码和账户名不匹配，请检查密码或账户名！");
    }
}
