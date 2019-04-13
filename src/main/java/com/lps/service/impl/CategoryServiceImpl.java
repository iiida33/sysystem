package com.lps.service.impl;

import com.lps.exception.CustomException;
import com.lps.mapper.CategoryMapper;
import com.lps.mapper.GoodMapper;
import com.lps.po.Category;
import com.lps.po.CategoryExample;
import com.lps.po.GoodExample;
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
    @Autowired
    private GoodMapper goodMapper;

    @Override
    public void insertCategory(Category category) throws CustomException {
        int num;
        num = categoryMapper.countByClass(category);
        if (category.getIsParent() && num >= 9) {
            throw new CustomException("一级类别数量不能超过9个！");
        } else if (num >= 12) {
            throw new CustomException("二级类别数量不能超过12个！");
        }
        List<Category> categories = categoryMapper.selectByCatName(category);
        int count = categories.size();
        if (count>0)
            throw new CustomException("类别名已存在！");
        categoryMapper.insertSelective(category);
    }

    @Override
    public void deleteCategory(Category category) throws CustomException{
        boolean isParent = category.getIsParent();
        int catId = category.getCatId();
        int count=0;
        if (isParent){
            CategoryExample categoryExample = new CategoryExample();
            CategoryExample.Criteria criteria = categoryExample.createCriteria();
            criteria.andPrecatIdEqualTo(catId);
            count = categoryMapper.countByExample(categoryExample);
            if(count>0)
                throw new CustomException("该一级类别下仍有二级类别，不能删除！");
        }
        else{
            GoodExample goodExample = new GoodExample();
            GoodExample.Criteria criteria = goodExample.createCriteria();
            criteria.andCatIdEqualTo(catId);
            count = goodMapper.countByExample(goodExample);
            if (count>0)
                throw new CustomException("该二级类别下仍有商品，不能删除！");
        }
        categoryMapper.deleteByPrimaryKey(catId);
    }

    @Override
    public void deleteByIdBatch(int[] cateIds) {
        for (int id : cateIds)
            categoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public List<Category> findPreCate() {
        return categoryMapper.selectPreCate();
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
    public void updateCategorySelective(Category category) throws CustomException{
        List<Category> categories = categoryMapper.selectByCatName(category);
        int count = categories.size();
        int catId = category.getCatId();
        int id = categories.get(0).getCatId();
        if (count>0 && catId!=id)
            throw new CustomException("类别名已存在！");
        categoryMapper.updateByPrimaryKeySelective(category);
    }

    @Override
    public List<CategoryShow> findAllToNav() {
        return categoryMapper.selectAllToNav();
    }

    @Override
    public List<Category> findAll() {
        return categoryMapper.selectAll();
    }

    @Override
    public int countCategory() {
        CategoryExample categoryExample = new CategoryExample();
        int count = categoryMapper.countByExample(categoryExample);
        return count;
    }
}
