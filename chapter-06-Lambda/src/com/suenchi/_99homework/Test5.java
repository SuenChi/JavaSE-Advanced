package com.suenchi._99homework;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**进阶题1:
 * 秒杀是网上竞拍的一种新方式，指商家在网络平台发布一些超低价格的商品，让所有买家在同一时间抢购的一种销售方式。
 * 由于商品价格非常低廉，通常活动时间一到，商品就会被买家抢购一空，有时甚至只用一秒钟，所以该种方式被称为秒杀。
 * 在秒杀活动页面往往会有一个倒计时的功能
 *
 * 请在素材的seckill项目的指定位置补全相关的代码，实现秒杀倒计时的功能！
 * 秒杀开始时间为：明天的06时0分0秒。案例执行效果如下所示：
 *
 */
public class Test5 {
    public static void main(String[] args) throws ParseException {
        // 创建一个定时器对象
        Timer timer = new Timer() ;
        timer.schedule(new TimeTask(), 0 , 1000);         // 每隔1秒执行一次

    }
}
class TimeTask extends TimerTask {

    // 定义秒杀开始时间
    private long startTime ;

    // 构造方法，对秒杀开始时间进行初始化
    public TimeTask() throws ParseException {
        // 补全代码
        Calendar calendar= Calendar.getInstance();
        int tomorrowDay=calendar.get(Calendar.DAY_OF_YEAR)+1;
        calendar.set(Calendar.DAY_OF_YEAR,tomorrowDay);
        calendar.set(Calendar.HOUR_OF_DAY,6);
        calendar.set(Calendar.MINUTE,0);
        calendar.set(Calendar.SECOND,0);

        Date tomorrow=calendar.getTime();
        startTime=tomorrow.getTime();
    }

    @Override
    public void run() {                                 // 每一秒执行一次该方法
        // 补全代码
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long nowTime=new Date().getTime();
        long secKillTime=new Date(startTime).getTime();
        long midTime=(secKillTime-nowTime)/1000;
        long h=midTime/60/60%60;
        long m=midTime/60%60;
        long s=midTime%60;

        System.out.println("即将开始,距开始: "+ h + "小时" + m + "分钟" + s + "秒");

    }
}