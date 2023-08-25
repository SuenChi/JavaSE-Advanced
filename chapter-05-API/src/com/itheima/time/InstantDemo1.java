package com.itheima.time;
import java.time.Instant;
/**
 * PROJECT_NAME: advanced-415
 * NAME: InstantDemo1
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/18
 */
public class InstantDemo1 {
    public static void main(String[] args) {
        //Instant可以维护一个距离时间原点的毫秒值(计算精度可以达到纳秒)
        //public static Instant now() : 获取当前时间的毫秒值 = System.currentTimeMillis()
        Instant now = Instant.now();
        System.out.println("now : " + now);

        //public long getEpochSecond() : 获取Instant对象距离时间原点的秒数
        long epochSecond = now.getEpochSecond();
        System.out.println("now距离时间原点过了 " + epochSecond + " 秒!");

        //public int getNano() : 获取不带1秒的纳秒数
        int nano = now.getNano();
        System.out.println("now距离时间原点过了 " + epochSecond + " 秒 " + nano + " 纳秒");
    }
}