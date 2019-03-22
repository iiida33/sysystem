package com.lps.service.impl;

import com.lps.mapper.OutMapper;
import com.lps.po.Out;
import com.lps.service.IOutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: OutServiceImpl
 * @Description:
 * @Author: 梁培珊
 * @Date: 8:24 2019/3/17
 **/
@Service
public class OutServiceImpl implements IOutService {

    @Autowired
    private OutMapper outMapper;

    @Override
    public void insertOut(Out out) {
        outMapper.insertSelective(out);
    }

    @Override
    public void deleteOut(int outId) {
        outMapper.deleteByPrimaryKey(outId);
    }

    @Override
    public List<Out> selectAll() {
        return outMapper.selectAll();
    }

    @Override
    public void updateOut(Out out) {

    }
}
