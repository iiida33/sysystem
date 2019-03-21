package com.lps.service;

import com.lps.exception.CustomException;
import com.lps.po.Customer;
import com.lps.vo.CustomerShowModel;

import java.util.List;

public interface ICustomerService {
//    更改用户除以外的信息
    public void updateCustomerSelective(Customer customer)throws CustomException;
//    新增用户
    public void insertCustomer(Customer customer)throws CustomException;
//    删除用户
    public void deleteById(int custId);
//    批量删除用户
    public void deleteByIdBatch(int[] custIds);
//    根据ID查询单个用户信息
    public Customer findById(int custId);
//    查询用户列表
    public List<CustomerShowModel> findAll();
//    查询用户登录信息（用户名、手机号、邮箱、密码）
    public Customer findLoginMsg(String string,String password)throws CustomException ;
}
