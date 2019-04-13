package com.lps.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lps.exception.CustomException;
import com.lps.po.Category;
import com.lps.service.ICategoryService;
import com.lps.vo.CategoryShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: CategoryController
 * @Description: 类别管理
 * @Author: 梁培珊
 * @Date: 8:27 2019/3/17
 **/
@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    //显示所有分类信息
    @RequestMapping("/showCategory.do")
    @ResponseBody
    public List<CategoryShow> showCategory() {
        return categoryService.findAllToNav();
    }

    //显示父级分类想你想
    @RequestMapping("/showPareCate.do")
    @ResponseBody
    public List<Category> showPareCate() {
        return categoryService.findPreCate();
    }

    //添加分类信息
    @RequestMapping("/addCategory.do")
    @ResponseBody
    public Map<String, String> addCategory(Category category) {
        HashMap<String, String> map = new HashMap<String, String>();
        try {
            categoryService.insertCategory(category);
        } catch (CustomException ce) {
            map.put("msg", ce.getMessage());
            map.put("status", "1");
            return map;
        }
        map.put("msg", "成功");
        map.put("status", "0");
        return map;
    }

    //删除分类信息
    @RequestMapping("/deleteCategory.do")
    @ResponseBody
    public Map<String,String> deleteCategory(Category category) {
        HashMap<String, String> map = new HashMap<String, String>();
        try {
            categoryService.deleteCategory(category);
        }
        catch (CustomException ce){
            map.put("msg",ce.getMessage());
            map.put("status","500");
            return map;
        }
        map.put("msg","成功删除！");
        map.put("status","200");
        return map;
    }

    //批量删除
    @RequestMapping("/deleteCategoryBatch.do")
    public void deleteCategoryBatch(int[] cateId) {
//        for (int id : cateId) {
//            categoryService.deleteById(id);
//        }
    }

    @RequestMapping("/editCategory.do")
    @ResponseBody
    public Map<String,String> editCategory(Category category) {
        HashMap<String, String> map = new HashMap<String, String>();
        try {
            categoryService.updateCategorySelective(category);
        }
        catch (CustomException ce){
            map.put("msg",ce.getMessage());
            map.put("status","500");
            return map;
        }
        map.put("msg","修改成功！");
        map.put("status","200");
        return map;
    }

    @RequestMapping("/showCategoryAll.do")
    @ResponseBody
    public String showCategoryAll() {
        List<Category> categories = categoryService.findAll();
        int count = categoryService.countCategory();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("msg", "");
        jsonObject.put("code", 0);
        jsonObject.put("data", categories);
        jsonObject.put("count", count);
        jsonObject.put("is", true);
        jsonObject.put("tip", "操作成功！");

        String categoriesJsonStr = JSON.toJSONString(jsonObject);
        return categoriesJsonStr;
    }
}