package com.lps.service.impl;

import com.lps.po.GoodSku;
import com.lps.service.IGoodSkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: GoodSkuServiceImpl
 * @Description:
 * @Author: 梁培珊
 * @Date: 16:54 2019/3/22
 **/
@Service
public class GoodSkuServiceImpl implements IGoodSkuService {

    @Autowired
    private GoodSkuMapper goodSkuMapper;

    @Override
    public void insertGoodSku(GoodSku goodSku) {
        goodSkuMapper.insertSelective(goodSku);
    }

    @Override
    public void deleteBySkuId(int skuId) {
        goodSkuMapper.deleteByPrimaryKey(skuId);
    }

    @Override
    public GoodSku selectBySkuProps(String skuProps) {
        return goodSkuMapper.selectBySkuProps(skuProps);
    }

    @Override
    public List<GoodSku> selectByGoodId(int goodId) {
        return goodSkuMapper.selectByGoodId(goodId);
    }

    @Override
    public void updateGoodSku(GoodSku goodSku) {
        goodSkuMapper.updateByPrimaryKeySelective(goodSku);
    }
}
