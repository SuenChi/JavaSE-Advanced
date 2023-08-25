package com.suenchi._10LocalDateTime;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/**
 * 案例:输入一个年份,打印这一年的二月份一共有多少天
 * 要求:利用LocalDate类
 */
public class Demo3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要判断的年份:");
        int year=sc.nextInt();

        //封装一个表示指定年份的3月1日==>减1天,得到2月末==>输出当天的天数
        int count= LocalDate.of(year, Month.MARCH,1).plusDays(-1).getDayOfMonth();
        System.out.println("您输入的"+year+"年的2月共有"+count+"天");

    }
}
