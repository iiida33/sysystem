package com.lps.service;

import com.lps.po.GoodSku;

import java.util.List;

public interface IGoodSkuService {
//    增加商品Sku
    public void insertGoodSku(GoodSku goodSku);
//    根据主键ID删除商品SKU
    public void deleteBySkuId(int skuId);
//    根据属性值ID串查找商品sku信息
    public GoodSku selectBySkuProps(String skuProps);
//    根据商品ID查询对应sku信息
    public List<GoodSku> selectByGoodId(int goodId);
//    修改商品sku信息
    public void updateGoodSku(GoodSku goodSku);
}
