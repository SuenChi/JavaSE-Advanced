package com.suenchi._08SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 1.SimpleDateFormat对象的创建
 * 2.将Date对象格式化为指定格式的字符串(which符合某种日期格式,比如 "yyyy-MM-dd HH:mm:ss" )
 * 3.将指定格式的字符串(which符合某种日期格式,若不符合将会报错)解析为Date对象
 */
public class Demo1 {
    public static void main(String[] args) throws ParseException {
        /**(1)
         * public SimpleDateFormat(String pattern)
         *      创建SimpleDateFormat对象 , 并指定转换模板
         *              pattern : 转换模板字符串
         */
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");    //MM表月份,mm表分钟
        /**(2)
         * public String format(Date date)
         *      传递Date对象 , 将其格式化为指定格式的字符串
         */
        Date now = new Date();
        System.out.println("打印Date对象 : "+now);
        String str = simpleDateFormat.format(now);
        System.out.println("将该Date对象利用SimpleDateFormat格式化后,打印结果 : "+str);

        /**(3)
         * public Date parse(String str)
         *      将满足模板格式的字符串解析为日期对象
         *      如果不满足模板格式,将会报错
         */
        String date="2008-12-04 12:12:12";
        Date parse = simpleDateFormat.parse(date);
        System.out.println("解析字符串\"2008-12-04 12:12:12\"为日期对象:");
        System.out.println(parse);
    }
}