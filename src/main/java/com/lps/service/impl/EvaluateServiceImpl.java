package com.lps.service.impl;

import com.fasterxml.jackson.databind.annotation.JsonAppend;
import com.lps.exception.CustomException;
import com.lps.mapper.EvaluateMapper;
import com.lps.po.Evaluate;
import com.lps.service.IEvaluateService;
import com.lps.vo.EvaluateShowModel;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private EvaluateMapper evaluateMapper;

    @Override
    public void insertEvaluate(Evaluate evaluate) {
        evaluateMapper.insertSelective(evaluate);
    }

    @Override
    public void deleteById(int evaId) {
        evaluateMapper.deleteByPrimaryKey(evaId);
    }

    @Override
    public List<EvaluateShowModel> findByGoodId(int goodId) {
        return evaluateMapper.selectByGoodId(goodId);
    }

    @Override
    public List<EvaluateShowModel> findByCustId(int custId) {
        return evaluateMapper.selectByCustId(custId);
    }

    @Override
    public void updateEvaluateSelective(Evaluate evaluate) throws CustomException{
        Evaluate evaluate1 = evaluateMapper.selectByPrimaryKey(evaluate.getEvaluateId());
        if (evaluate1.getEvaluateState())
            throw new CustomException("该评论已作修改！不可再次修改！");
        evaluate.setEvaluateState(true);
        evaluateMapper.updateByPrimaryKeySelective(evaluate);
    }
}
