package com.lps.service.impl;

import com.lps.mapper.GoodMapper;
import com.lps.po.Good;
import com.lps.po.GoodExample;
import com.lps.service.IGoodService;
import com.lps.vo.GoodAndPic;
import com.lps.vo.GoodShowPage;
import com.lps.vo.GoodSimpleShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: GoodServiceImpl
 * @Description:
 * @Author: 梁培珊
 * @Date: 8:23 2019/3/17
 **/
@Service
public class GoodServiceImpl implements IGoodService {

    @Autowired
    private GoodMapper goodMapper;

    @Override
    public void insertGood(GoodAndPic goodAndPic) {
        Good good = new Good();
        good.setGoodBrand(goodAndPic.getGoodBrand());
        good.setGoodDescribe(goodAndPic.getGoodDescribe());
        good.setGoodId(goodAndPic.getGoodId());
        good.setGoodImage(goodAndPic.getGoodImage());
        good.setGoodName(goodAndPic.getGoodName());
    }

    @Override
    public void deleteGood(int goodId) {
        goodMapper.deleteByPrimaryKey(goodId);
    }

    @Override
    public List<GoodSimpleShow> findByCateId(int cateId) {
        GoodExample goodExample = new GoodExample();
        GoodExample.Criteria criteria = goodExample.createCriteria();
        criteria.andCatIdEqualTo(cateId);
        goodMapper.selectByExample(goodExample);
        return null;
    }

    @Override
    public GoodShowPage findById(int goodId) {
        return null;
    }

    @Override
    public List<Good> fineAll() {

        GoodExample goodExample = new GoodExample();
        GoodExample.Criteria criteria = goodExample.createCriteria();
        criteria.andGoodIdEqualTo(null);
        return goodMapper.selectByExample(goodExample);
    }

    @Override
    public List<Good> findByState(Boolean goodState) {
        return null;
    }

    @Override
    public List<GoodSimpleShow> findByNamr(String name) {
        return null;
    }

    @Override
    public void updateByGoodIdSelective(int goodId) {

    }

    @Override
    public void updateStateById(int goodId, Boolean goodState) {

    }
}
