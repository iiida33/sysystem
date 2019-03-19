package com.lps.mapper;

import com.lps.po.GoodSku;
import com.lps.po.GoodSkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodSkuMapper {
    int countByExample(GoodSkuExample example);

    int deleteByExample(GoodSkuExample example);

    int deleteByPrimaryKey(Integer skuId);

    int insert(GoodSku record);

    int insertSelective(GoodSku record);

    List<GoodSku> selectByExample(GoodSkuExample example);

    GoodSku selectByPrimaryKey(Integer skuId);

    int updateByExampleSelective(@Param("record") GoodSku record, @Param("example") GoodSkuExample example);

    int updateByExample(@Param("record") GoodSku record, @Param("example") GoodSkuExample example);

    int updateByPrimaryKeySelective(GoodSku record);

    int updateByPrimaryKey(GoodSku record);
}