package com.lps.service.impl;

import com.lps.exception.CustomException;
import com.lps.mapper.CategoryMapper;
import com.lps.po.Category;
import com.lps.po.CategoryExample;
import com.lps.service.ICategoryService;
import com.lps.vo.CategoryShow;
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
    public void insertCategory(Category category) throws CustomException {
        CategoryExample categoryExample = new CategoryExample();
        CategoryExample.Criteria criteria = categoryExample.createCriteria();
        if (category.getIsParent()) {
            criteria.andIsParentEqualTo(true);
            if (categoryMapper.countByExample(categoryExample) > 9)
                throw new CustomException("一级类别数量不能超过9个！");
        } else {
            criteria.andIsParentEqualTo(false);
            if (categoryMapper.countByExample(categoryExample) > 12)
                throw new CustomException("二级类别数量不能超过12个！");
        }
//         前台要控制除主键外的数据不为空,名称不能重复
        categoryMapper.insertSelective(category);
    }

    @Override
    public void deleteById(int cateId) {
        categoryMapper.deleteByPrimaryKey(cateId);
    }

    @Override
    public void deleteByIdBatch(int[] cateIds) {
        for(int id:cateIds)
            categoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Category> findByClass(boolean isParent) {
        CategoryExample categoryExample = new CategoryExample();
        CategoryExample.Criteria criteria = categoryExample.createCriteria();
        criteria.andIsParentEqualTo(isParent);
        return categoryMapper.selectByExample(categoryExample);
    }

    @Override
    public Category findById(int cateId) {
        return categoryMapper.selectByPrimaryKey(cateId);
    }

    @Override
    public List<Category> findByPreId(int preId) {
        CategoryExample categoryExample = new CategoryExample();
        CategoryExample.Criteria criteria = categoryExample.createCriteria();
        criteria.andPrecatIdEqualTo(preId);
        return categoryMapper.selectByExample(categoryExample);
    }

    @Override
    public void updateCategorySelective(Category category) {
        categoryMapper.selectByPrimaryKey(category.getCatId());
    }

    @Override
    public List<CategoryShow> findAllToNav() {
        return categoryMapper.selectAllToNav();
    }
}
