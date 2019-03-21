package com.lps.service.impl;

import com.lps.mapper.DeliveryInfoMapper;
import com.lps.po.DeliveryInfo;
import com.lps.po.DeliveryInfoExample;
import com.lps.service.IDeliveryInfoService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private DeliveryInfoMapper deliveryInfoMapper;

    @Override
    public void insertDeliveryInfo(DeliveryInfo deliveryInfo) {
        if(deliveryInfoMapper.selectIsDefault(deliveryInfo.getCustId())==0)
            deliveryInfo.setIsDefault(true);
        deliveryInfoMapper.insert(deliveryInfo);
    }

    @Override
    public void deleteById(int deliId) {
        DeliveryInfo deliveryInfo =deliveryInfoMapper.selectByPrimaryKey(deliId);
        if (deliveryInfo.getIsDefault()){
            deliveryInfoMapper.deleteByPrimaryKey(deliId);
            List<DeliveryInfo> list = deliveryInfoMapper.selectByCustId(deliveryInfo.getCustId());
            if (list!=null)
                list.get(0).setIsDefault(true);
        }

    }

    @Override
    public void deleteByCustId(int custId) {
        List<DeliveryInfo> deliveryInfos = deliveryInfoMapper.selectByCustId(custId);
        for (DeliveryInfo deliveryInfo:deliveryInfos)
            deliveryInfoMapper.deleteByPrimaryKey(deliveryInfo.getDelId());
    }

    @Override
    public List<DeliveryInfo> fingByCustId(int custId) {
        return deliveryInfoMapper.selectByCustId(custId);
    }

    @Override
    public void updateInfoSelective(DeliveryInfo deliveryInfo) {
        deliveryInfoMapper.updateByPrimaryKeySelective(deliveryInfo);
    }

    @Override
    public void updateDefaultDeliInfo(int deliId) {
        DeliveryInfoExample deliveryInfoExample = new DeliveryInfoExample();
        DeliveryInfoExample.Criteria criteria = deliveryInfoExample.createCriteria();
        criteria.andIsDefaultEqualTo(true);
        DeliveryInfo deliveryInfo = new DeliveryInfo();
        deliveryInfo.setIsDefault(false);
        deliveryInfoMapper.updateByExampleSelective(deliveryInfo,deliveryInfoExample);
        deliveryInfo.setDelId(deliId);
        deliveryInfo.setIsDefault(true);
        deliveryInfoMapper.updateByPrimaryKeySelective(deliveryInfo);
    }
}
