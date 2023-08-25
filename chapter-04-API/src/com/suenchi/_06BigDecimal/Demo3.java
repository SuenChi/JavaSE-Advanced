package com.suenchi._06BigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * BigDecimal对象的divide()
 */
public class Demo3 {
    public static void main(String[] args) {
        //(1)public BigDecimal divide(BigDecimal b)
        BigDecimal b1=new BigDecimal("13.70367");
        BigDecimal b2=new BigDecimal("3");
        System.out.println(b1+" 除以 "+b2+" 结果为 : "+b1.divide(b2));      //除不尽会出现异常

        /**(2)public BigDecimal divide(BigDecimal b,int scale,RoundingMode m)
         *      scale : 精确位数
         *      m : 舍入模式,通过RoundingMode的常量来指定
         */
        System.out.println(b1.divide(b2,3, RoundingMode.UP));   //精确3位,进1法
        System.out.println(b1.divide(b2,3, RoundingMode.DOWN));   //精确3位,去尾法
        System.out.println(b1.divide(b2,3, RoundingMode.HALF_UP));   //精确3位,四舍五入法

        //(3)public double doubleValue(): 将BigDecimal对象转换为double类型的数据
        System.out.println(b1.doubleValue());
    }
}