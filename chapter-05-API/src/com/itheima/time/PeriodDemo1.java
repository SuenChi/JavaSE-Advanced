package com.itheima.time;

import java.time.*;

/**
 * PROJECT_NAME: advanced-415
 * NAME: PeriodDemo1
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/18
 */
public class PeriodDemo1 {
    public static void main(String[] args) {
        //计算2023年的圣诞节距离2019年的劳动节过了多少天
        //public static Period between(LocalDate start,LocalDate end) : 获取从开始时间到结束时间之间的差额对象
        Period period = Period.between(LocalDate.of(2019, Month.MAY, 1), LocalDate.of(2023, Month.DECEMBER, 25));
        //public int getYear() : 获取相差的年份 public int getMonths() : 获取相差的年份  public int getDays() : 获取相差的天数
        System.out.println("2019年的劳动节距离2023年的圣诞节相差" + period.getYears() + "年" + period.getMonths() + "月" + period.getDays() + "天!");

        //小明早上7:41:10秒出了家门,小明的弟弟早上7:45:9秒出了家门(相隔多长时间)
        //public static Duration between(开始时间,结束时间) : 获取开始时间到结束时间之间的差额对象
        Duration duration = Duration.between(LocalTime.of(7, 41, 10), LocalTime.of(7, 45, 9));
        long minutes = duration.toMinutes();
        System.out.println("小明弟弟与小明出门相隔了" + minutes + "分钟!");
        long seconds = duration.toSeconds();
        System.out.println("小明弟弟与小明出门相隔了" + seconds + "秒!");
    }
}
