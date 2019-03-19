package com.lps.service;

import com.lps.exception.CustomException;
import com.lps.po.Category;

import java.util.List;

public interface ICategoryService {
//    添加类别
    public void insertCategory(Category category)throws CustomException;
//    根据ID删除单个类别
    public void deleteById(int cateId);
//    根据Id删除多个类别
    public void deleteByIdBatch(int[] cateIds);
//    查找父或子类别
    public List<Category> findByClass(boolean isParent);
//    根据ID查找类别信息
    public Category findById(int cateId);
//    根据父类别Id查找子类别信息
    public List<Category> findByPreId(int preId);
//    修改类别信息
    public void updateCategorySelective(Category category);
}
