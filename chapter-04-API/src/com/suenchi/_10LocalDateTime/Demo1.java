package com.suenchi._10LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * 1.利用LocalDateTime/LocalDate/LocalTime获取 当前时间 所对应的对象
 * 2.利用LocalDateTime/LocalDate/LocalTime获取 指定时间 所对应的对象
 */
public class Demo1 {
    public static void main(String[] args) {
        /**
         * public static LocalDateTime now() : 获取当前时间所对应的日期对象
         */
        LocalDateTime dateTime1=LocalDateTime.now();
        LocalDate date=LocalDate.now();
        LocalTime time=LocalTime.now();
        System.out.println("当前的日期时间 : "+dateTime1);
        System.out.println("当前的日期 : "+date);
        System.out.println("当前的时间 : "+time);

        /**`
         * public static LocalDateTime of(...) :
         *      获取指定时间所对应的对象:2008-10-12 12:12:12
         *      也即 : 基于传递的实际参数获取表示指定时间的日期对象
         *      LocalDate和LocalTime都可以调用静态的of方法,方法的功能是一样的,但是参数可能略有不同
         */
        LocalDateTime dateTime2=LocalDateTime.of(2008,10,12,12,12,12);
        System.out.println("指定的时间 : " + dateTime2);

    }
}