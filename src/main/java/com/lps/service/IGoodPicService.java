package com.lps.service;

import com.lps.po.GoodPic;

import java.util.List;

public interface IGoodPicService {
//    增加商品照片
    public void insertGoodPic(GoodPic goodPic);
//    根据主键ID删除商品照片
    public void deleteByPicId(int picId);
//    根据商品ID删除照片
    public void deleteByGoodId(int goodId);
//    根据商品ID查询所有照片信息
    public List<GoodPic> selectAllByGoodId(int goodId);
//    修改图片信息
    public void updateSelective(GoodPic goodPic);
}
