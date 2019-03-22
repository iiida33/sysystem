package com.lps.mapper;

import com.lps.po.Out;
import com.lps.po.OutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OutMapper {
    int countByExample(OutExample example);

    int deleteByExample(OutExample example);

    int deleteByPrimaryKey(Integer outId);

    int insert(Out record);

    int insertSelective(Out record);

    List<Out> selectByExample(OutExample example);

    Out selectByPrimaryKey(Integer outId);

    int updateByExampleSelective(@Param("record") Out record, @Param("example") OutExample example);

    int updateByExample(@Param("record") Out record, @Param("example") OutExample example);

    int updateByPrimaryKeySelective(Out record);

    int updateByPrimaryKey(Out record);

//    -------自定义部分--------------------------------------------------------------
    List<Out> selectAll();
}