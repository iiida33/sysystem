package com.lps.service.impl;

import com.lps.po.GoodPic;
import com.lps.po.GoodPicExample;
import com.lps.service.IGoodPicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: GoodPicServiceImpl
 * @Description:
 * @Author: 梁培珊
 * @Date: 18:52 2019/3/21
 **/
@Service
public class GoodPicServiceImpl implements IGoodPicService {

    @Autowired
    private GoodPicMapper goodPicMapper;

    @Override
    public void insertGoodPic(GoodPic goodPic) {
        goodPicMapper.insertSelective(goodPic);
    }

    @Override
    public void deleteByPicId(int picId) {
        goodPicMapper.deleteByPrimaryKey(picId);
    }

    @Override
    public void deleteByGoodId(int goodId) {
        GoodPicExample goodPicExample = new GoodPicExample();
        GoodPicExample.Criteria criteria = goodPicExample.createCriteria();
        criteria.andGoodIdEqualTo(goodId);
        goodPicMapper.deleteByExample(goodPicExample);
    }

    @Override
    public List<GoodPic> selectAllByGoodId(int goodId) {
        GoodPicExample goodPicExample = new GoodPicExample();
        GoodPicExample.Criteria criteria = goodPicExample.createCriteria();
        criteria.andGoodIdEqualTo(goodId);
        return goodPicMapper.selectByExample(goodPicExample);
    }

    @Override
    public void updateSelective(GoodPic goodPic) {
        goodPicMapper.updateByPrimaryKeySelective(goodPic);
    }
}
