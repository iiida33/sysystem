package com.lps.mapper;

import com.lps.po.Evaluate;
import com.lps.po.EvaluateExample;

import java.util.List;

import com.lps.vo.EvaluateShowModel;
import org.apache.ibatis.annotations.Param;

public interface EvaluateMapper {
    int countByExample(EvaluateExample example);

    int deleteByExample(EvaluateExample example);

    int deleteByPrimaryKey(Integer evaluateId);

    int insert(Evaluate record);

    int insertSelective(Evaluate record);

    List<Evaluate> selectByExample(EvaluateExample example);

    Evaluate selectByPrimaryKey(Integer evaluateId);

    int updateByExampleSelective(@Param("record") Evaluate record, @Param("example") EvaluateExample example);

    int updateByExample(@Param("record") Evaluate record, @Param("example") EvaluateExample example);

    int updateByPrimaryKeySelective(Evaluate record);

    int updateByPrimaryKey(Evaluate record);

    //    ----------------------自定义部分-----------------------------------
    //    根据商品Id查询评价信息
    List<EvaluateShowModel> selectByGoodId(Integer goodId);

    //    根据顾客Id查询评价信息
    List<EvaluateShowModel> selectByCustId(Integer custId);
}