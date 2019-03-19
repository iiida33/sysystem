package com.lps.service.impl;

import com.lps.exception.CustomException;
import com.lps.mapper.CategoryMapper;
import com.lps.po.Category;
import com.lps.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: CategoryServiceImpl
 * @Description:
 * @Author: 梁培珊
 * @Date: 8:16 2019/3/17
 **/
@Service("iCategoryService")
public class CategoryServiceImpl implements ICategoryService {

    @Autowired
    private CategoryMapper categoryMapper;
    @Override
    public void insertCategory(Category category) throws CustomException{
       if(category.getIsParent()&&categoryMapper.countByExample(null)>9)
           throw  new CustomException("一级类别数量不能超过9个！");
//        前台要控制除主键外的数据不为空
        categoryMapper.insertSelective(category);
    }

    @Override
    public void deleteById(int cateId) {

    }

    @Override
    public void deleteByIdBatch(int[] cateIds) {

    }

    @Override
    public List<Category> findByClass(boolean isParent) {
        return null;
    }

    @Override
    public Category findById(int cateId) {
        return null;
    }

    @Override
    public List<Category> findByPreId(int preId) {
        return null;
    }

    @Override
    public void updateCategorySelective(Category category) {

    }
}
