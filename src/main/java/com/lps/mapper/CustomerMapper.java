package com.lps.mapper;

import com.lps.po.Customer;
import com.lps.po.CustomerExample;

import java.util.List;

import com.lps.vo.CustomerShowModel;
import org.apache.ibatis.annotations.Param;

public interface CustomerMapper {
    //统计顾客数量
    int countByExample(CustomerExample example);

    //根据条件删除顾客
    int deleteByExample(CustomerExample example);

    //根据主键删除
    int deleteByPrimaryKey(Integer custId);

    //添加顾客信息
    int insert(Customer record);

    //选择性添加顾客信息
    int insertSelective(Customer record);

    //根据条件查询顾客信息
    List<Customer> selectByExample(CustomerExample example);

    //根据主键查询顾客信息
    Customer selectByPrimaryKey(Integer custId);

    //选择性地更新顾客信息
    int updateByExampleSelective(@Param("record") Customer record, @Param("example") CustomerExample example);

    //更新顾客所有信息
    int updateByExample(@Param("record") Customer record, @Param("example") CustomerExample example);

    //选择性地更新顾客信息
    int updateByPrimaryKeySelective(Customer record);

    //更新顾客所有信息
    int updateByPrimaryKey(Customer record);

    // -------------自定义部分-------------------------------------------------------------------
    //    添加用户
    int insertCustomer(Customer customer);

    //    查询所有用户展示信息
    List<CustomerShowModel> findAllToShow();

    //    根据用户名查询用户
    Customer selectByUserName(String custUsername);

    //    根据手机号查询用户
    Customer selectByPhone(String custPhone);

    //    根据电子邮箱查询用户
    Customer selectByEmail(String custEmail);

//    修改密码
    void updatePassword(Customer customer);
}