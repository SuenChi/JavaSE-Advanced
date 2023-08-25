package com.suenchi._07Date;

import java.util.Date;
/**
 * Date类创建对象和getTime()方法的调用
 * 1.public Date()  系统当前此刻日期时间
 * 2.public Date(long time) 把时间毫秒值转换成Date日期对象。
 * 3.public long getTime() 获取Date对象表示的时间毫秒值
 * */
public class Demo {
    public static void main(String[] args) {
        //1.public Date()  系统当前此刻日期时间
        Date now=new Date();
        System.out.println("当前的时间为 : " + now);//格式不是我们想要的 : Wed Aug 16 14:46:22 CST 2023

        /**2.public Date(long time)
         *      传递的参数表示距离时间原点过了多少毫秒
         *      把时间毫秒值转换成Date日期对象。
         */
        Date d=new Date(60*1000);   //距离时间原点过了1分钟
        System.out.println("距离时间原点经过1分钟后的时间 : " + d); //Thu Jan 01 08:01:00 CST 1970

        /**
         * 3.public long getTime()
         *      获取Date对象表示的时间毫秒值
         */
        long timeMillis=now.getTime();
        System.out.println("从时间原点到现在经过的毫秒数 : " + timeMillis);

        //new Date().getTime() : 和System.currentTimeMillis()方法获取的结果一模一样
        System.out.println(new Date().getTime());
        System.out.println(System.currentTimeMillis());
    }
}
