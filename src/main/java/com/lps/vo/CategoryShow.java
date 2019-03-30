package com.lps.vo;

import com.lps.po.Category;

import java.util.List;

/**
 * @ClassName: CategoryShow
 * @Description: 商品类别导航展示
 * @Author: 梁培珊
 * @Date: 8:01 2019/3/28
 **/
public class CategoryShow extends Category {
    private List<Category> categoryChild;

    @Override
    public String toString() {
        return "CategoryShow{" +
                "categoryChild=" + categoryChild +
                '}';
    }

    public List<Category> getCategoryChild() {
        return categoryChild;
    }

    public void setCategoryChild(List<Category> categoryChild) {
        this.categoryChild = categoryChild;
    }
}
