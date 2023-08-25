package com.suenchi._10LocalDateTime;

import java.time.LocalDateTime;

public class Demo2 {
    public static void main(String[] args) {
        /**
         * public static LocalDateTime now()
         *      获取当前时间的日期对象
         */
        LocalDateTime now=LocalDateTime.now();
        System.out.println("现在时间 : "+now);

        //============================================
        //JavaLocalDateTime/LocalDate/LocalTime日期对象都是不变的 , 一旦对它们进行修改/累加/累减操作之后, 会把操作之后的日期封装成一个新的对象返回
        //============================================

        /**
         * public int getXxx()
         *      例如: now.getYear()
         *      获取日期对象中指定字段的内容
         */
        int year=now.getYear();
        int monthValue = now.getMonthValue();
        int day = now.getDayOfMonth();
        System.out.println("now中的年份 : " + year + " , 月份 : " + monthValue + " , 日期 : " + day);

        /**
         * public LocalDateTime withXxx(修改后的值)
         *      修改日期对象中指定字段的内容
         *      例如 : LocalDateTime res=now.withYear(2024);
         */
        LocalDateTime res1=now.withYear(2024);
        System.out.println("res1 = " + res1);

        /**
         * public LocalDateTime plusXxxs(累加的值/累减的值)
         *      例如 : LocalDateTime res=now.plusMonths(3);
         */
        LocalDateTime res2=now.plusMonths(3);
        System.out.println("res2 = " + res2);

    }
}
