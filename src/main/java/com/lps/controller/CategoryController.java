package com.lps.controller;

import com.lps.service.ICategoryService;
import com.lps.vo.CategoryShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ClassName: CategoryController
 * @Description: 类别管理
 * @Author: 梁培珊
 * @Date: 8:27 2019/3/17
 **/
@Controller
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @RequestMapping("/showCategory.do")
    @ResponseBody
    public List<CategoryShow> showCategory(HttpServletRequest request){
        return categoryService.findAllToNav();
    }
}