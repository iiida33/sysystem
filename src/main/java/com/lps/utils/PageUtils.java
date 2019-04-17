package com.lps.utils;

import com.lps.mapper.CategoryMapper;
import com.lps.po.Category;
import com.lps.service.ICategoryService;
import com.lps.vo.CategoryShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PageUtils {
    @Autowired
    ICategoryService categoryService;

    @RequestMapping("/toPage.do")
    public String toPage(String url) {
        return url;
    }

    @RequestMapping("/toGoodList.do")
    public ModelAndView toGoodList(String catId){
        ModelAndView modelAndView = new ModelAndView();
        int categoryId=Integer.valueOf(catId);
        Category category = categoryService.findById(categoryId);
        String catName = category.getCatName();
        int preId=0;
        CategoryShow categoryShow = categoryService.findOneFCateAndItsChild(categoryId);
        if (categoryShow.getCatId()!=categoryId){
            preId=categoryShow.getCatId();
        }
        modelAndView.addObject("preId",preId);
        modelAndView.addObject("catId",categoryId);
        modelAndView.addObject("catName",catName);
        modelAndView.addObject("category",categoryShow);
        modelAndView.setViewName("customer/shop.jsp");
        return modelAndView;
    }
}
