package com.lps.service.impl;

import com.lps.exception.CustomException;
import com.lps.mapper.CategoryMapper;
import com.lps.mapper.GoodMapper;
import com.lps.mapper.GoodPicMapper;
import com.lps.mapper.GoodSkuMapper;
import com.lps.po.*;
import com.lps.service.IGoodService;
import com.lps.vo.GoodAndPic;
import com.lps.vo.GoodCatSku;
import com.lps.vo.GoodShowPage;
import com.lps.vo.GoodSimpleShow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    @Autowired
    private GoodSkuMapper goodSkuMapper;
    @Autowired
    private GoodPicMapper goodPicMapper;
    @Autowired
    private CategoryMapper categoryMapper;

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
        goodSkuMapper.deleteByGoodId(goodId);
        goodPicMapper.deletePicByGoodId(goodId);
        goodMapper.deleteByPrimaryKey(goodId);
    }

    @Override
    public List<GoodSimpleShow> findByCateId(int cateId) {
        Category category = categoryMapper.selectByPrimaryKey(cateId);
        List<GoodSimpleShow> goodSimpleShows = new ArrayList<>();
        if (category.getIsParent()) {
            CategoryExample categoryExample = new CategoryExample();
            CategoryExample.Criteria criteria = categoryExample.createCriteria();
            criteria.andPrecatIdEqualTo(cateId);
            List<Category> categories = categoryMapper.selectByExample(categoryExample);
            for (Category category1:categories){
                int cid=category1.getCatId();
                List<GoodSimpleShow> goodSimpleShows1 = goodMapper.selectByCatIdAndStateToCus(cid);
                goodSimpleShows.addAll(goodSimpleShows1);
            }
        } else {
            goodSimpleShows.addAll(goodMapper.selectByCatIdAndStateToCus(cateId));
        }
        return goodSimpleShows;
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
    public int updateStateById(int goodId, Boolean goodState) throws CustomException {
        Good good = new Good();
        good.setGoodId(goodId);
        good.setGoodState(goodState);
        if (!goodState) {
            List<GoodSku> goodSkus = goodSkuMapper.selectByGoodId(goodId);
            for (GoodSku goodSku : goodSkus) {
                if (goodSku.getSkuState()) {
                    throw new CustomException("该商品仍有未下架的SKU，不能下架！");
                }
            }
            goodMapper.updateByPrimaryKeySelective(good);
            return 0;
        }
        goodMapper.updateByPrimaryKeySelective(good);
        return 1;
    }

    @Override
    public List<GoodCatSku> findAllSelective(Good good) {
        List<GoodCatSku> goodCatSkus = goodMapper.selectGoodListSelective(good);
        return goodCatSkus;
    }

    @Override
    public int insertGoodReturnId(Good good) {
        goodMapper.insertGoodReturnId(good);
        int goodId = good.getGoodId();
        return goodId;
    }
}
