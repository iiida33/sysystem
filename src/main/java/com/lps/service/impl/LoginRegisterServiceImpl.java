package com.lps.service.impl;

import com.lps.controller.LoginRegisterController;
import com.lps.exception.CustomException;
import com.lps.mapper.AdminMapper;
import com.lps.mapper.CustomerMapper;
import com.lps.service.ILoginRegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: LoginRegisterServiceImpl
 * @Description: 顾客或管理员登录、注册
 * @Author: 梁培珊
 * @Date: 22:33 2019/3/24
 **/
@Service
public class LoginRegisterServiceImpl implements ILoginRegisterService {

    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public void findCustomerByUserName(String userName) throws CustomException{
        if (customerMapper.selectByUserName(userName)!=null)
            throw new CustomException("该用户名已存在");
    }

    @Override
    public void findCustomerByPhone(String phone) throws CustomException{
        if (customerMapper.selectByPhone(phone)!=null)
            throw new CustomException("该手机号已存在");
    }
}
