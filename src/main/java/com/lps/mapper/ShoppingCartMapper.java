package com.lps.mapper;

import com.lps.po.ShoppingCart;
import com.lps.po.ShoppingCartExample;

import java.util.List;

import com.lps.vo.ShoppingCartGoodSku;
import org.apache.ibatis.annotations.Param;

public interface ShoppingCartMapper {
    int countByExample(ShoppingCartExample example);

    int deleteByExample(ShoppingCartExample example);

    int deleteByPrimaryKey(Integer cartId);

    int insert(ShoppingCart record);

    int insertSelective(ShoppingCart record);

    List<ShoppingCart> selectByExample(ShoppingCartExample example);

    ShoppingCart selectByPrimaryKey(Integer cartId);

    int updateByExampleSelective(@Param("record") ShoppingCart record, @Param("example") ShoppingCartExample example);

    int updateByExample(@Param("record") ShoppingCart record, @Param("example") ShoppingCartExample example);

    int updateByPrimaryKeySelective(ShoppingCart record);

    int updateByPrimaryKey(ShoppingCart record);

    //    -------------自定义部分--------------------------------------------
    //    根据用户ID删除购物车信息
    void deleteByCustId(Integer custId);

    //    根据顾客Id查询购物车信息
    List<ShoppingCartGoodSku> selectShopCartAndSku(Integer custId);
}