package com.lps.mapper;

import com.lps.po.GoodPic;
import com.lps.po.GoodPicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodPicMapper {
    int countByExample(GoodPicExample example);

    int deleteByExample(GoodPicExample example);

    int deleteByPrimaryKey(Integer picId);

    int insert(GoodPic record);

    int insertSelective(GoodPic record);

    List<GoodPic> selectByExample(GoodPicExample example);

    GoodPic selectByPrimaryKey(Integer picId);

    int updateByExampleSelective(@Param("record") GoodPic record, @Param("example") GoodPicExample example);

    int updateByExample(@Param("record") GoodPic record, @Param("example") GoodPicExample example);

    int updateByPrimaryKeySelective(GoodPic record);

    int updateByPrimaryKey(GoodPic record);

//    自定义部分
//    根据商品ID（goodId）删除图片
    void deletePicByGoodId(Integer goodId);
}