package com.lps.service.impl;

import com.lps.po.DeliveryInfo;
import com.lps.service.IDeliveryInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: DeliveryInfoServiceImpl
 * @Description:
 * @Author: 梁培珊
 * @Date: 8:22 2019/3/17
 **/
@Service
public class DeliveryInfoServiceImpl implements IDeliveryInfoService {
    @Override
    public void insertDeliveryInfo(DeliveryInfo deliveryInfo) {

    }

    @Override
    public void deleteById(int deliId) {

    }

    @Override
    public void deleteByCustId(int custId) {

    }

    @Override
    public List<DeliveryInfo> fingByCustId(int custId) {
        return null;
    }

    @Override
    public void updateInfoSelective(DeliveryInfo deliveryInfo) {

    }
}
