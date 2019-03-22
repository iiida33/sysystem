package com.lps.mapper;

import com.lps.po.PropName;
import com.lps.po.PropNameExample;
import java.util.List;

import com.lps.vo.PropNameAndValueList;
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

//  --------- 自定义部分----------------------------------------------
//    根据CatId查询所有属性及对应属性值
    List<PropNameAndValueList> selectAllNameAndValueByCatId(Integer catId);
//    根据PnId查询属性及对应的属性值
    PropNameAndValueList selectNameAndAllValueByPnId(Integer pnId);
}