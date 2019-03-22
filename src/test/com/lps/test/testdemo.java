package com.lps.test;

import com.lps.mapper.*;
import com.lps.po.Category;
import com.lps.po.Collect;
import com.lps.po.GoodSku;
import com.lps.service.ICategoryService;
import com.lps.service.IDeliveryInfoService;
import com.lps.service.IGoodSkuService;
import com.lps.service.IShoppingCartService;
import com.lps.service.impl.EvaluateServiceImpl;
import com.lps.vo.PropNameAndValueList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName: testdemo
 * @Description:
 * @Author: 梁培珊
 * @Date: 22:49 2019/3/18
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml", "classpath:mybatis-config.xml", "classpath:springmvc-servlet.xml"})
public class testdemo {

    @Autowired
    IGoodSkuService goodSkuService;
    @Test
    public void test() {
//        List<PropNameAndValueList> propNameAndValueLists=propNameMapper.selectAllNameAndValueByCatId(3);
        GoodSku goodSku=goodSkuService.selectBySkuProps("1,3");
        System.out.println(111111111);
    }
}
