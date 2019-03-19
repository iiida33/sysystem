package com.lps.mapper;

import com.lps.po.Import;
import com.lps.po.ImportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImportMapper {
    int countByExample(ImportExample example);

    int deleteByExample(ImportExample example);

    int deleteByPrimaryKey(Integer importId);

    int insert(Import record);

    int insertSelective(Import record);

    List<Import> selectByExample(ImportExample example);

    Import selectByPrimaryKey(Integer importId);

    int updateByExampleSelective(@Param("record") Import record, @Param("example") ImportExample example);

    int updateByExample(@Param("record") Import record, @Param("example") ImportExample example);

    int updateByPrimaryKeySelective(Import record);

    int updateByPrimaryKey(Import record);
}