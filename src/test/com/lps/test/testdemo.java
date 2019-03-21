package com.lps.test;

import com.lps.mapper.CategoryMapper;
import com.lps.mapper.CollectMapper;
import com.lps.mapper.CustomerMapper;
import com.lps.mapper.DeliveryInfoMapper;
import com.lps.po.Category;
import com.lps.po.Collect;
import com.lps.service.ICategoryService;
import com.lps.service.IDeliveryInfoService;
import com.lps.service.impl.EvaluateServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
    private IDeliveryInfoService deliveryInfoService;

    @Autowired
    private EvaluateServiceImpl evaluateService;
    @Test
    public void test() {
        System.out.println(evaluateService.findByCustId(1));
    }
}
