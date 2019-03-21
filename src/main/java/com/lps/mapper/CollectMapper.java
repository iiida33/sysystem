package com.lps.mapper;

import com.lps.po.Collect;
import com.lps.po.CollectExample;
import java.util.List;

import com.lps.vo.CollectShowModel;
import org.apache.ibatis.annotations.Param;

public interface CollectMapper {
    int countByExample(CollectExample example);

    int deleteByExample(CollectExample example);

    int deleteByPrimaryKey(Integer collectId);

    int insert(Collect record);

    int insertSelective(Collect record);

    List<Collect> selectByExample(CollectExample example);

    Collect selectByPrimaryKey(Integer collectId);

    int updateByExampleSelective(@Param("record") Collect record, @Param("example") CollectExample example);

    int updateByExample(@Param("record") Collect record, @Param("example") CollectExample example);

    int updateByPrimaryKeySelective(Collect record);

    int updateByPrimaryKey(Collect record);

//---------------------------------自定义---------------------------------------------------------------------
//    根据用户ID查询收藏夹展示信息列表
    List<CollectShowModel> selectByCustIdShow(Integer custId);
//    根据用户ID删除收藏夹信息
    void deleteByCustId(Integer custId);
}