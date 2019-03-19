package com.lps.service;

import com.lps.po.Evaluate;
import com.lps.vo.EvaluateShowModel;

import java.util.List;

public interface IEvaluateService {
//    添加评价信息
    public void insertEvaluate(Evaluate evaluate);
//    根据主键删除评价信息
    public void deleteById(int evaId);
//    根据商品Id查询评价信息
    public List<EvaluateShowModel> findByGoodId(int goodId);
//    根据顾客Id查询评价信息
    public List<EvaluateShowModel> findByCustId(int custId);
//    顾客修改评价信息
    public void updateEvaluateSelective(Evaluate evaluate);
}
