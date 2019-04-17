package com.lps.mapper;

import com.lps.po.Good;
import com.lps.po.GoodExample;

import java.util.List;

import com.lps.vo.GoodCatSku;
import com.lps.vo.GoodSimpleShow;
import org.apache.ibatis.annotations.Param;

public interface GoodMapper {
    int countByExample(GoodExample example);

    int deleteByExample(GoodExample example);

    int deleteByPrimaryKey(Integer goodId);

    int insert(Good record);

    int insertSelective(Good record);

    List<Good> selectByExample(GoodExample example);

    Good selectByPrimaryKey(Integer goodId);

    int updateByExampleSelective(@Param("record") Good record, @Param("example") GoodExample example);

    int updateByExample(@Param("record") Good record, @Param("example") GoodExample example);

    int updateByPrimaryKeySelective(Good record);

    int updateByPrimaryKey(Good record);

//    ----------自定义部分---------------------------------------
    //    根据条件查询所有商品信息
    public List<GoodCatSku> selectGoodListSelective(Good good);
//    添加商品返回主键
    public Integer insertGoodReturnId(Good good);
//    根据分类查询向顾客展示的商品列表
    public List<GoodSimpleShow> selectByCatIdAndStateToCus(Integer catId);
}