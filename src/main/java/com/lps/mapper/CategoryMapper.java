package com.lps.mapper;

import com.lps.po.Category;
import com.lps.po.CategoryExample;
import java.util.List;

import com.lps.vo.CategoryShow;
import org.apache.ibatis.annotations.Param;

public interface CategoryMapper {
    int countByExample(CategoryExample example);

    int deleteByExample(CategoryExample example);

    int deleteByPrimaryKey(Integer catId);

    int insert(Category record);

    int insertSelective(Category record);

    List<Category> selectByExample(CategoryExample example);

    Category selectByPrimaryKey(Integer catId);

    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryExample example);

    int updateByExample(@Param("record") Category record, @Param("example") CategoryExample example);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);

    //    -------------自定义部分------------------------------------------------------
//    查询所有父类别及其子类别
    List<CategoryShow> selectAllToNav();
//    查询所有父类
    List<Category> selectPreCate();
//查询父类别或某父类下的子类数量
    Integer countByClass(Category category);
////    根据类别名查找类别
    List<Category> selectByCatName(Category category);
//    查询所有类别信息
    List<Category> selectAll();
}