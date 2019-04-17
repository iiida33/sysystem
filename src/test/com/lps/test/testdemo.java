package com.lps.test;

import com.lps.mapper.CategoryMapper;
import com.lps.mapper.CustomerMapper;
import com.lps.mapper.GoodMapper;
import com.lps.mapper.PropNameMapper;
import com.lps.po.Category;
import com.lps.po.Good;
import com.lps.service.*;
import com.lps.service.impl.GoodServiceImpl;
import com.lps.vo.CategoryShow;
import com.lps.vo.GoodCatSku;
import com.lps.vo.GoodSimpleShow;
import com.lps.vo.PropNameAndValue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sound.midi.Soundbank;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.zip.CheckedOutputStream;

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
    IGoodService goodService;
    @Autowired
    GoodMapper goodMapper;
    @Autowired
    PropNameMapper propNameMapper;

    @Test
    public void test() {
        List<PropNameAndValue> propNameAndValues=propNameMapper.selectPropNameAndValue("2,3");
        return;
    }

    @Test
    public void timeTest() {
        //        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");//设置日期格式
        //        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        //        SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        //        /*天数差*/
        //        Date fromDate1 = simpleFormat.parse("2019-04-13 18:10");
        //        Date toDate1 = simpleFormat.parse("2018-03-12 12:00");
        //        long from1 = fromDate1.getTime();
        //        long to1 = toDate1.getTime();
        //        int days = (int) ((to1 - from1) / (1000 * 60 * 60 * 24));
        //        System.out.println("两个时间之间的天数差为：" + days);
        //        Date date1 = customerMapper.selectCurrentBuyTime(1);
        //        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        //        Date date2 = new Date();// new Date()为获取当前系统时间
        //        long from1 = date1.getTime();
        //        long to1 = date2.getTime();
        //        int days = (int) ((to1 - from1) / (1000 * 60 * 60 * 24));
        //        System.out.println(date1);
        //        System.out.println("两个时间之间的天数差为：" + days);}
    }
}
