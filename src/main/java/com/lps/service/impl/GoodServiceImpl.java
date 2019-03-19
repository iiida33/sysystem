package com.lps.service.impl;

import com.lps.po.Good;
import com.lps.service.IGoodService;
import com.lps.vo.GoodAndPic;
import com.lps.vo.GoodShowPage;
import com.lps.vo.GoodSimpleShow;
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
    @Override
    public void insertGood(GoodAndPic goodAndPic) {

    }

    @Override
    public void deleteGood(int goodId) {

    }

    @Override
    public List<GoodSimpleShow> findByCateId(int cateId) {
        return null;
    }

    @Override
    public GoodShowPage findById(int goodId) {
        return null;
    }

    @Override
    public List<Good> fineAll() {
        return null;
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
