package com.lps.service;

import com.lps.po.DeliveryInfo;

import java.util.List;

public interface IDeliveryInfoService {
//    添加用户快递信息
    public void insertDeliveryInfo(DeliveryInfo deliveryInfo);
//    根据快递信息Id删除快递信息
    public void deleteById(int deliId);
//    根据用户Id删除快递信息
    public void deleteByCustId(int custId);
//    查询用户快递信息
    public List<DeliveryInfo> fingByCustId(int custId);
//    修改用户快递信息
    public void updateInfoSelective(DeliveryInfo deliveryInfo);
}
