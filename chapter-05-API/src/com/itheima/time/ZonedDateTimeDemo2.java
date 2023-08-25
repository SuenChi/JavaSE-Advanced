package com.itheima.time;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

/**
 * PROJECT_NAME: advanced-415
 * NAME: ZonedDateTimeDemo1
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/18
 */
public class ZonedDateTimeDemo2 {
    public static void main(String[] args) {
        //public static ZonedDateTime now() : 默认获取表示当前时区信息的时间对象
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("zoneDateTime : " + zonedDateTime);

        //public static ZonedDateTime now(ZoneId) : 获取指定时区信息的时间对象
        ZoneId tokyoZoneId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyoZonedDateTime = ZonedDateTime.now(tokyoZoneId);
        System.out.println("tokyoZonedDateTime : " + tokyoZonedDateTime);
    }
}
