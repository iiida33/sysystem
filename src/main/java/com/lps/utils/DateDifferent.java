package com.lps.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: DateDifferent
 * @Description:
 * @Author: 梁培珊
 * @Date: 17:54 2019/4/13
 **/
public final class DateDifferent {
    public static int differentDate(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        return 0;
    }
}
