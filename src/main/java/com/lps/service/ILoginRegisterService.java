package com.lps.service;

import com.lps.exception.CustomException;

public interface ILoginRegisterService {
    //    根据顾客用户名查询
    public void findCustomerByUserName(String userName) throws CustomException;

    //    根据顾客手机号码查询
    public void findCustomerByPhone(String phone) throws CustomException;
}
