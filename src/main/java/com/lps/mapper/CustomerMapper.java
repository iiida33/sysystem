package com.lps.mapper;

import com.lps.po.Customer;
import com.lps.po.CustomerExample;
import java.util.List;

import com.lps.vo.CustomerShowModel;
import org.apache.ibatis.annotations.Param;

public interface CustomerMapper {
    int countByExample(CustomerExample example);

    int deleteByExample(CustomerExample example);

    int deleteByPrimaryKey(Integer custId);

    int insert(Customer record);

    int insertSelective(Customer record);

    List<Customer> selectByExample(CustomerExample example);

    Customer selectByPrimaryKey(Integer custId);

    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);

// -------------自定义部分-------------------------------------------------------------------
//    添加用户
    int insertCustomer(Customer customer);
//    查询所有用户展示信息
    List<CustomerShowModel> findAllToShow();
//    根据用户名查询用户-
    Customer selectByUserName(String custUsername);
//    根据手机号查询用户
    Customer selectByPhone(String custPhone);
}