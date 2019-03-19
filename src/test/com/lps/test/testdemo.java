package com.lps.test;

import com.lps.mapper.CategoryMapper;
import com.lps.po.Category;
import com.lps.service.ICategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @ClassName: testdemo
 * @Description:
 * @Author: 梁培珊
 * @Date: 22:49 2019/3/18
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml",
        "classpath:mybatis-config.xml","classpath:springmvc-servlet.xml"})
public class testdemo {
    @Autowired
    private ICategoryService iCategoryService;
    @Autowired
    private CategoryMapper categoryMapper;
    @Test
    public void testInsertCategory() {
        System.out.println(categoryMapper.selectByPrimaryKey(3));

//        Category category = new Category();
//        category.setCatName("testname");
//        category.setIsParent(true);
//        category.setCatOrder(1);
////        System.out.println(iCategoryService);
//        //        category.setPrecatId(-1);
//        //        category.setCatId(1);
//        //        System.out.println(category);
//        iCategoryService.insertCategory(category);
    }

}
