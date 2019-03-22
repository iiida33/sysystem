package com.lps.service;

import com.lps.po.Out;

import java.util.List;

public interface IOutService {
//    添加出仓表信息
    public void insertOut(Out out);
//    删除出仓表
    public void deleteOut(int outId);
//    查询出仓表信息
    public List<Out> selectAll();
//    修改出仓表信息
    public void updateOut(Out out);
}
