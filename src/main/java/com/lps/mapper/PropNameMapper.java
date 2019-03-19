package com.lps.mapper;

import com.lps.po.PropName;
import com.lps.po.PropNameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PropNameMapper {
    int countByExample(PropNameExample example);

    int deleteByExample(PropNameExample example);

    int deleteByPrimaryKey(Integer pnId);

    int insert(PropName record);

    int insertSelective(PropName record);

    List<PropName> selectByExample(PropNameExample example);

    PropName selectByPrimaryKey(Integer pnId);

    int updateByExampleSelective(@Param("record") PropName record, @Param("example") PropNameExample example);

    int updateByExample(@Param("record") PropName record, @Param("example") PropNameExample example);

    int updateByPrimaryKeySelective(PropName record);

    int updateByPrimaryKey(PropName record);
}