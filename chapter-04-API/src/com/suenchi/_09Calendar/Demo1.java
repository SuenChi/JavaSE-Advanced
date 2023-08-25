package com.suenchi._09Calendar;

import java.util.Calendar;
import java.util.Date;

/**
 * 1.创建Calendar对象
 * 2.通过Calendar对象获取年/月/日/时/分/秒
 * 3.指定Calendar对象某个时间字段
 * 4.指定Calendar对象某个时间字段增加/减少的值
 * 5.将Calendar对象转换成Date类对象
 */

public class Demo1 {
    public static void main(String[] args) {
        /**public static Calendar getInstance() : 获取表示当前时间的Calendar对象
         *      多态 : Calendar是个抽象类
         *              Calendar.getInstance()可以返回一个Calendar的子类,前面的calendar是父类引用
         */
        Calendar calendar= Calendar.getInstance();
        System.out.println("calendar = " + calendar);

        /**
         * public int get(int field) : 基于字段编号获取字段数据
         * 通过Calendar类的常量来获取年/月/日/时/分/秒
         */
        int year=calendar.get(Calendar.YEAR);
        System.out.println("year = " + year);
        int month=calendar.get(Calendar.MONTH)+1;   //注意:Calendar底层表示月份从0开始,故需要额外加1
        System.out.println("month = " + month);
        int day=calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("day = " + day);
        int hour=calendar.get(Calendar.HOUR_OF_DAY);
        System.out.println("hour = " + hour);
        int minute=calendar.get(Calendar.MINUTE);
        System.out.println("minute = " + minute);
        int second=calendar.get(Calendar.SECOND);
        System.out.println("second = " + second);

        /**
         * public void set(int field,int value) : 基于字段编号和修改后内容修改时间字段
         */
        calendar.set(Calendar.YEAR,2008);
        System.out.println(calendar.get(Calendar.YEAR));
        calendar.set(Calendar.MONTH,0); //想设计的月份为1,需要额外减1
        System.out.println(calendar.get(Calendar.MONTH)+1); //注意:Calendar底层表示月份从0开始,故需要额外加1

        /**
         * public void add(int field,int amount) : 为某个字段增加/减少指定的值
         */
        System.out.println("修改前的year:"+calendar.get(Calendar.YEAR));
        calendar.add(Calendar.YEAR,10);
        System.out.println("10年后的year:"+calendar.get(Calendar.YEAR));

        System.out.println("修改前的day:"+calendar.get(Calendar.DAY_OF_MONTH));
        calendar.add(Calendar.DAY_OF_MONTH,-2);
        System.out.println("2天前的day:"+calendar.get(Calendar.DAY_OF_MONTH));

        //public Date getTime() : 将Calendar对象转换为Date对象
        Date date=calendar.getTime();
        System.out.println(date);
    }
}