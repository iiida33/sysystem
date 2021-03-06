package com.lps.mapper;

import com.lps.po.DeliveryInfo;
import com.lps.po.DeliveryInfoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface DeliveryInfoMapper {
    int countByExample(DeliveryInfoExample example);

    int deleteByExample(DeliveryInfoExample example);

    int deleteByPrimaryKey(Integer delId);

    int insert(DeliveryInfo record);

    int insertSelective(DeliveryInfo record);

    List<DeliveryInfo> selectByExample(DeliveryInfoExample example);

    DeliveryInfo selectByPrimaryKey(Integer delId);

    int updateByExampleSelective(@Param("record") DeliveryInfo record, @Param("example") DeliveryInfoExample example);

    int updateByExample(@Param("record") DeliveryInfo record, @Param("example") DeliveryInfoExample example);

    int updateByPrimaryKeySelective(DeliveryInfo record);

    int updateByPrimaryKey(DeliveryInfo record);

    //    -----------自定义部分-------------------------------------------------------
    //    查询用户地址信息中是否存在默认地址
    int selectIsDefault(Integer custId);

    //    根据用户ID查询快递地址信息
    List<DeliveryInfo> selectByCustId(Integer custId);
}