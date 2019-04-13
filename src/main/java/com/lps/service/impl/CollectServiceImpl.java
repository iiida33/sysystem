package com.lps.service.impl;

import com.lps.mapper.CollectMapper;
import com.lps.po.Collect;
import com.lps.service.ICollectService;
import com.lps.vo.CollectShowModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: CollectServiceImpl
 * @Description:
 * @Author: 梁培珊
 * @Date: 8:16 2019/3/17
 **/
@Service
public class CollectServiceImpl implements ICollectService {

    @Autowired
    private CollectMapper collectMapper;

    @Override
    public List<CollectShowModel> findByUserId(int custId) {
        return collectMapper.selectByCustIdShow(custId);
    }

    @Override
    public void deleteByCollcetId(int collcetId) {
        collectMapper.deleteByPrimaryKey(collcetId);
    }

    @Override
    public void deleteByCustId(int custId) {
        collectMapper.deleteByCustId(custId);
    }

    @Override
    public void insertCollect(Collect collect) {
//        如果前台不能设置已收藏效果 需要判断是否已收藏
        collectMapper.insertSelective(collect);
    }
}
