package com.lps.service.impl;

import com.lps.po.Evaluate;
import com.lps.service.IEvaluateService;
import com.lps.vo.EvaluateShowModel;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: EvaluateServiceImpl
 * @Description:
 * @Author: 梁培珊
 * @Date: 8:22 2019/3/17
 **/
@Service
public class EvaluateServiceImpl implements IEvaluateService {
    @Override
    public void insertEvaluate(Evaluate evaluate) {

    }

    @Override
    public void deleteById(int evaId) {

    }

    @Override
    public List<EvaluateShowModel> findByGoodId(int goodId) {
        return null;
    }

    @Override
    public List<EvaluateShowModel> findByCustId(int custId) {
        return null;
    }

    @Override
    public void updateEvaluateSelective(Evaluate evaluate) {

    }
}
