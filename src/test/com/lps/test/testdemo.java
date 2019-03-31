package com.lps.test;

import com.lps.service.*;
import com.lps.vo.CategoryShow;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * @ClassName: testdemo
 * @Description:
 * @Author: 梁培珊
 * @Date: 22:49 2019/3/18
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:mybatis-config.xml", "classpath:springmvc-servlet.xml"})
public class testdemo {

    @Autowired
    ICategoryService categoryService;

    @Test
    public void test() {
        List<CategoryShow> categoryShows=categoryService.findAllToNav();
        System.out.println(categoryShows);




//        System.out.println(Pattern.matches("^([A-Za-z0-9_\\-\\.])+\\@([A-Za-z0-9_\\-\\.])+\\.([A-Za-z]{2,4})$", "2513567@qq.com"));
//        System.out.println(Pattern.matches("^[1][3,4,5,7,8][0-9]{9}$","2513567@qq.com"));
//        System.out.println(Pattern.matches("^[1][3,4,5,7,8][0-9]{9}$","17876253535"));
        //        Pattern pattern = Pattern.compile("^([A-Za-z0-9_\\-\\.])+\\@([A-Za-z0-9_\\-\\.])+\\.([A-Za-z]{2,4})$");
    }
}
