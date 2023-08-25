package com.suenchi._09Calendar;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 输入一个年份,打印这一年的二月份一共有多少天
 * 要求:使用Calendar
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入年份:");
        int year=sc.nextInt();
        Calendar calendar=Calendar.getInstance();
        calendar.set(year, Calendar.MARCH,1);   //以后月份的表示直接使用Calendar的常量
        //3月1日的前一天就是2月的月末一天
        calendar.add(Calendar.DAY_OF_MONTH,-1);

        //2月的月末一天是几号,那么该年的二月份就有几天
        System.out.println(year+"年的二月份共有"+calendar.get(Calendar.DAY_OF_MONTH)+"天");
    }
}