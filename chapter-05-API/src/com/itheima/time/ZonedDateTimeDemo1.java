package com.itheima.time;

import java.time.ZoneId;
import java.util.Set;

/**
 * PROJECT_NAME: advanced-415
 * NAME: ZonedDateTimeDemo1
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/18
 */
public class ZonedDateTimeDemo1 {
    public static void main(String[] args) {
        //public static Set<String> getAvailableZoneIds() : 获取所有时区信息
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        for (String zoneId : zoneIds) {
            //System.out.println(zoneId);
        }

        //public static ZoneId systemDefault() : 根据当前系统获取默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("当前系统的默认时区 : " + zoneId);

        //public static ZoneId of(String zoneId) : 基于传递的时区字符串获取表示该时区的ZoneId对象
        ZoneId newYorkZoneId = ZoneId.of("America/New_York");
        System.out.println("表示纽约的时区信息 : " + newYorkZoneId);
    }
}
