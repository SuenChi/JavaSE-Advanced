package com.suenchi._06BigDecimal;

import java.math.BigDecimal;

/**创建BigDecimal对象方法
 * 注意 : 就只能用以下两种方式创建BigDecimal对象 , 其他方式创建则可能底层不是基于十进制运算
 */
public class Demo1 {
    public static void main(String[] args) {
        /**1.利用构造方法
         * public BigDecimal(String value) : 传递字符串类型的数字创建BigDecimal对象
         */
        BigDecimal b1=new BigDecimal("1232132143243253253425");
        System.out.println("b1 = " + b1);
        /**2.利用静态方法
         * public static BigDecimal valueOf(double value) : 传递数据创建BigDecimal
         */
        BigDecimal b2=BigDecimal.valueOf(321321321.54321524);
        //底层采用十进制运算,并不代表必须存储整数
        System.out.println("b2 = " + b2);
    }
}