package com.suenchi._10LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**日期与字符串的转换方式
 * DateTimeFormatter
 *      1.封装模板
 *      2.将日期转换为字符串
 */
public class Demo4 {
    public static void main(String[] args) {
        /**public static DateTimeFormatter ofPattern(String pattern)
         *      获取保存模板信息的DateTimeFormatter
         */
        DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");

        /**
         * public String format(任意日期对象)
         *      将日期对象按照指定模板转换为字符串
         */
        String str=dateTimeFormatter.format(LocalDateTime.now());
        System.out.println("str = " + str);

        /**
         * public static LocalDateTime parse(CharSequence seq,String pattern)
         * public static LocalDate parse(CharSequence seq,String pattern)
         * public static LocalTime parse(CharSequence seq,String pattern)
         */
        String date="2023/11/11 11:11:11";
        LocalDateTime res=LocalDateTime.parse(date,DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        System.out.println("res = " + res);
        String date2="2023/11/11";
        LocalDate res2=LocalDate.parse(date2,DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println("res2 = " + res2);

    }
}
