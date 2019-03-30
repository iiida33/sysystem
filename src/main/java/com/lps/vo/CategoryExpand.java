package com.lps.vo;

import com.lps.po.Category;

/**
 * @ClassName: CategoryExpand
 * @Description:
 * @Author: 梁培珊
 * @Date: 8:06 2019/3/28
 **/
public class CategoryExpand extends Category {
    private String url;

    @Override
    public String toString() {
        return "CategoryExpand{" +
                "url='" + url + '\'' +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
