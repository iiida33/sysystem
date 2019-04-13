package com.lps.service.impl;

import com.lps.mapper.ImportMapper;
import com.lps.po.Import;
import com.lps.service.IImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: ImportServiceImpl
 * @Description:
 * @Author: 梁培珊
 * @Date: 8:23 2019/3/17
 **/
@Service
public class ImportServiceImpl implements IImportService {

    @Autowired
    private ImportMapper importMapper;

    @Override
    public void insertIm(Import imForm) {
        importMapper.insertSelective(imForm);
    }

    @Override
    public void deleteIm(int importId) {
        importMapper.deleteByPrimaryKey(importId);
    }

    @Override
    public List<Import> selectAll() {
        return null;
    }

    @Override
    public void updateIm(Import imForm) {

    }
}
