package com.lps.service;

import com.lps.po.Import;

import java.util.List;

public interface IImportService {
//    添加进货表信息
    public void insertIm(Import imForm);
//    删除进货表信息
    public void deleteIm(int importId);
//    查询进货表信息
    public List<Import> selectAll();
//    修改进货表信息
    public void updateIm(Import imForm);
}
