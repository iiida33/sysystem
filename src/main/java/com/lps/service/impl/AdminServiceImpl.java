package com.lps.service.impl;

import com.lps.exception.CustomException;
import com.lps.mapper.AdminMapper;
import com.lps.po.Admin;
import com.lps.po.AdminExample;
import com.lps.service.IAdminService;
import com.lps.utils.MD5Utils;
import com.lps.vo.AdminShowModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: AdminServiceImpl
 * @Description: IAdminService接口实现类，对管理员信息的增删查改
 * @Author: 梁培珊
 * @Date: 7:47 2019/3/17
 **/
@Service
public class AdminServiceImpl implements IAdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public void deleteById(int adminId) {
        adminMapper.deleteByPrimaryKey(adminId);
    }

    @Override
    public void deleteByIdBatch(int[] adminIds) {
        for (int id : adminIds) {
            adminMapper.deleteByPrimaryKey(id);
        }
    }

    @Override
    public void insertAdmin(Admin admin) {
        adminMapper.insert(admin);
    }

    @Override
    public void updateAdminSelective(Admin admin) {
        adminMapper.updateByPrimaryKeySelective(admin);
    }

    @Override
    public Admin findById(int adminId) {
        Admin admin = adminMapper.selectByPrimaryKey(adminId);
        return admin;
    }

    @Override
    public List<AdminShowModel> findAll() {
        return null;
    }

    @Override
    public Admin findByNumAndPassword(int num, String password) throws CustomException {
        String encode = MD5Utils.encodeByMD5(password);
        System.out.println(encode);
        AdminExample adminExample = new AdminExample();
        AdminExample.Criteria criteria = adminExample.createCriteria();
        criteria.andAdminNumEqualTo(num);
        criteria.andAdminPasswordEqualTo(password);
        List<Admin> list = adminMapper.selectByExample(adminExample);
        if (list.get(0)==null){
            throw new CustomException("工号或密码错误","500");
        }
        return list.get(0);
    }

        @Override
        public List<Admin> findByOther(Admin admin) {
            AdminExample adminExample = new AdminExample();
            AdminExample.Criteria criteria = adminExample.createCriteria();
            if (admin.getIsResign() != null)
                criteria.andIsResignEqualTo(admin.getIsResign());
            if (admin.getAdminSex() != null)
                criteria.andAdminSexEqualTo(admin.getAdminSex());
            if (admin.getAdminAuthority() != null)
                criteria.andAdminAuthorityEqualTo(admin.getAdminAuthority());
            if (admin.getAdminName() != null)
                criteria.andAdminNameLike(admin.getAdminName());
            List<Admin> admins = adminMapper.selectByExample(adminExample);
            return admins;
        }
}

