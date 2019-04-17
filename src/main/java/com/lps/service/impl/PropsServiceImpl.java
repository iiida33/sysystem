package com.lps.service.impl;

import com.lps.mapper.PropNameMapper;
import com.lps.mapper.PropValueMapper;
import com.lps.po.PropName;
import com.lps.po.PropValue;
import com.lps.service.IPropsService;
import com.lps.vo.PropNameAndValue;
import com.lps.vo.PropNameAndValueList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: PropsServiceImpl
 * @Description:
 * @Author: 梁培珊
 * @Date: 10:01 2019/3/22
 **/
@Service
public class PropsServiceImpl implements IPropsService {

    @Autowired
    private PropNameMapper propNameMapper;

    @Autowired
    private PropValueMapper propValueMapper;

    @Override
    public void insertPropName(PropNameAndValueList propNameAndValueList) {
        propNameMapper.insertSelective(propNameAndValueList);
        List<PropValue> propValues=propNameAndValueList.getPropValues();
        if (propValues!=null){
            for(PropValue propValue:propValues){
                propValueMapper.insertSelective(propValue);
            }
        }
    }

    @Override
    public void deleteByPnId(int pnId) {
        List<PropValue> propValues = propValueMapper.selectByPnId(pnId);
        propNameMapper.deleteByPrimaryKey(pnId);
        for (PropValue propValue:propValues)
            propValueMapper.deleteByPrimaryKey(propValue.getPvId());
    }

    @Override
    public void deleteByCatIdBatch(int catId) {
        List<PropNameAndValueList> propNameAndValueLists= propNameMapper.selectAllNameAndValueByCatId(catId);
        for (PropNameAndValueList propNameAndValueList : propNameAndValueLists)
        {
            propNameMapper.deleteByPrimaryKey(propNameAndValueList.getPnId());
            for (PropValue propValue:propNameAndValueList.getPropValues())
            {
                propValueMapper.deleteByPrimaryKey(propValue.getPvId());
            }
        }
    }

    @Override
    public PropNameAndValueList selectByPnId(int pnId) {
        return propNameMapper.selectNameAndAllValueByPnId(pnId);
    }

    @Override
    public List<PropNameAndValueList> selectByCatId(int catId) {
        return propNameMapper.selectAllNameAndValueByCatId(catId);
    }

    @Override
    public void updatePropName(PropName propName) {
        propNameMapper.updateByPrimaryKeySelective(propName);
    }

    @Override
    public void insertPropValue(PropValue propValue) {
        propValueMapper.insertSelective(propValue);
    }

    @Override
    public void deleteByPvId(String pvId) {
        propValueMapper.deleteByPrimaryKey(pvId);
    }

    @Override
    public void updatePropValue(PropValue propValue) {
        propValueMapper.updateByPrimaryKeySelective(propValue);
    }

    @Override
    public List<PropNameAndValue> findPropNameAndValue(String skuProps) {
        List<PropNameAndValue> propNameAndValues = propNameMapper.selectPropNameAndValue(skuProps);
        return propNameAndValues;
    }
}
