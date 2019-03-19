package com.lps.service.impl;

import com.lps.service.ICollectService;
import com.lps.vo.CollectShowModel;
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
    @Override
    public List<CollectShowModel> findByUserId(int custId) {
        return null;
    }

    @Override
    public void deleteByCollcetId(int collcetId) {

    }

    @Override
    public void deleteByCustId(int custId) {

    }

    @Override
    public void insertCollect(int custId, int goodId) {

    }
}
