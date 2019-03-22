package com.lps.service;

import com.lps.po.PropName;
import com.lps.po.PropValue;
import com.lps.vo.PropNameAndValueList;

import java.util.List;

public interface IPropsService {
    //    添加属性
    public void insertPropName(PropNameAndValueList propNameAndValueList);

    //    根据主键删除属性及其值
    public void deleteByPnId(int pnId);

    //    根据类别ID批量删除属性及其值
    public void deleteByCatIdBatch(int catId);

    //    根据主键ID查询属性信息
    public PropNameAndValueList selectByPnId(int pnId);

    //    根据类别查询属性及其值信息
    public List<PropNameAndValueList> selectByCatId(int catId);

    //    修改属性信息
    public void updatePropName(PropName propName);

    //    添加属性值
    public void insertPropValue(PropValue propValue);

    //    删除属性值
    public void deleteByPvId(int pvId);

    //    修改属性值
    public void updatePropValue(PropValue propValue);
}
