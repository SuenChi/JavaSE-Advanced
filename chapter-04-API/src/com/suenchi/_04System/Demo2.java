package com.suenchi._04System;
/**
 * 1.currentTimeMillis()获取当前时间毫秒值
 * 2.利用currentTimeMillis()粗略的统计代码的执行效率
 */
public class Demo2 {
    public static void main(String[] args) {
        /**public static long currentTimeMillis() : 获取当前时间毫秒值
         *      时间毫秒值 : 距离时间原点经过了多少毫秒
         *          时间原点 : 1970-1-1
         */
        long time=System.currentTimeMillis();
        System.out.println("time = " + time);

        /**
         * 简单应用 : 粗略的统计代码的执行效率
         *
         */
        long time1=System.currentTimeMillis();
        String str="";
        for (int i = 0; i < 50000; i++) {
            str+="suenchi";
        }
        long time2=System.currentTimeMillis();
        System.out.println("程序运行耗时:"+(time2-time1));
    }
}