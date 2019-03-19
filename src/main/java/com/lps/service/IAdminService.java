package com.lps.service;

import com.lps.exception.CustomException;
import com.lps.po.Admin;
import com.lps.vo.AdminShowModel;

import java.util.List;

public interface IAdminService {
//    根据主键ID删除管理员信息
    public void deleteById(int adminId);
//    批量删除管理员信息
    public void deleteByIdBatch(int[] adminIds);
//    添加管理员信息
    public void insertAdmin(Admin admin);
//    修改管理员信息
    public void updateAdminSelective(Admin admin);
//    根据主键ID查询管理员信息
    public Admin findById(int adminId);
//    查询管理员信息列表
    public List<AdminShowModel> findAll();
//    根据工号和密码查询管理员，用于登录
    public Admin findByNumAndPassword(int num,String password) throws CustomException;
////    根据其他条件查询管理员信息
    List<Admin> findByOther(Admin admin);
}
