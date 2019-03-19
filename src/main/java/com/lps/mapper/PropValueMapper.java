package com.lps.mapper;

import com.lps.po.PropValue;
import com.lps.po.PropValueExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PropValueMapper {
    int countByExample(PropValueExample example);

    int deleteByExample(PropValueExample example);

    int deleteByPrimaryKey(Integer pvId);

    int insert(PropValue record);

    int insertSelective(PropValue record);

    List<PropValue> selectByExample(PropValueExample example);

    PropValue selectByPrimaryKey(Integer pvId);

    int updateByExampleSelective(@Param("record") PropValue record, @Param("example") PropValueExample example);

    int updateByExample(@Param("record") PropValue record, @Param("example") PropValueExample example);

    int updateByPrimaryKeySelective(PropValue record);

    int updateByPrimaryKey(PropValue record);
}