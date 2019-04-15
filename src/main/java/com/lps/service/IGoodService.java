package com.lps.service;

import com.lps.exception.CustomException;
import com.lps.po.Good;
import com.lps.vo.GoodAndPic;
import com.lps.vo.GoodCatSku;
import com.lps.vo.GoodShowPage;
import com.lps.vo.GoodSimpleShow;

import java.util.List;

public interface IGoodService {
//    添加商品信息
    public void insertGood(GoodAndPic goodAndPic);
//    删除下架商品信息
    public void deleteGood(int goodId);
//    按类别查询商品信息展示列表
    public List<GoodSimpleShow> findByCateId(int cateId);
//    根据商品ID查询商品详细信息
    public GoodShowPage findById(int goodId);
//    管理员查询所有商品信息
    public List<Good> fineAll();
//    查询上架或下架商品信息列表
    public List<Good> findByState(Boolean goodState);
//    根据名称模糊查询商品信息列表
    public List<GoodSimpleShow> findByNamr(String name);
//    修改商品信息
    public void updateByGoodIdSelective(int goodId);
//    修改商品在售状态
    public int updateStateById(int goodId, Boolean goodState) throws CustomException;
//    查询商品列表
    public List<GoodCatSku> findAllSelective(Good good);
}
