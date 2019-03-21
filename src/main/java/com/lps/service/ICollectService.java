package com.lps.service;

import com.lps.po.Collect;
import com.lps.vo.CollectShowModel;

import java.util.List;

public interface ICollectService {
//    根据用户ID查询收藏夹信息列表
    public List<CollectShowModel> findByUserId(int custId);
//    根据主键删除收藏夹信息
    public void deleteByCollcetId(int collcetId);
//    根据用户ID删除收藏夹信息
    public void deleteByCustId(int custId);
//    添加收藏夹信息
    public void insertCollect(Collect collect);
}
