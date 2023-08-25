package com.suenchi._08SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 案例:秒杀活动
 * 秒杀开始时间:2023年11月11日 00:00:00
 * 秒杀结束时间:2023年11月11日 00:10:00
 * 顾客1下单付款时间:2023年11月11日 00:01:18
 * 顾客2下单付款时间:2023年11月11日 00:10:51
 * 用代码判断他们是否秒杀成功
 */

public class Demo2 {
    public static void main(String[] args) throws ParseException {
        //创建SimpleDateFormat对象
        SimpleDateFormat SDF=new SimpleDateFormat("yy年MM月dd日 HH:mm:ss");
        //获取符合指定格式的字符串对象
        String startTimeStr="2023年11月11日 00:00:00";
        String endTimeStr="2023年11月11日 00:10:00";
        String consumer1_OrderTimeStr="2023年11月11日 00:01:18";
        String consumer2_OrderTimeStr="2023年11月11日 00:10:51";
        //将符合指定格式的字符串对象转换为Date对象
        Date startTime=SDF.parse(startTimeStr);
        Date endTime=SDF.parse(endTimeStr);
        Date consumer1_OrderTime=SDF.parse(consumer1_OrderTimeStr);
        Date consumer2_OrderTime=SDF.parse(consumer2_OrderTimeStr);
        //调用方法
        showResult(startTime,endTime,consumer1_OrderTime,"顾客1");
        showResult(startTime,endTime,consumer2_OrderTime,"顾客2");
    }

    public static void showResult(Date startTime,Date endTime,Date orderTime,String consumerName){
        if(orderTime.getTime()>=startTime.getTime()&&orderTime.getTime()<=endTime.getTime()){
            System.out.println(consumerName+"秒杀成功");
        }else{
            System.out.println(consumerName+"秒杀失败");
        }
    }
}
