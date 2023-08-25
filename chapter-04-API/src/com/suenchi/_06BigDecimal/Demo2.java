package com.suenchi._06BigDecimal;

import java.math.BigDecimal;

/**BigDecimal对象的add(),subtract(),multiply()
 *      1.BigDecimal只可以和同类对象进行运算
 *      2.BigDecimal运算的方法 : 不会修改调用者对象的内容,而是将计算结果封装成一个新的BigDecimal对象返回;
 */
public class Demo2 {
    public static void main(String[] args) {

        /**(1)add
         * public BigDecimal add(BigDecimal b) : 使用调用者内容与参数内容进行相加后返回结果
         */
        BigDecimal b1=new BigDecimal("25");
        BigDecimal b2=b1.add(new BigDecimal("12"));
        System.out.println("b1 = " + b1);   //没有改变b1对象的内容
        System.out.println("b2 = " + b2);
        System.out.println("===============================================");

        /**(2)subtract
         * public BigDecimal subtract(BigDecimal b) : 使用调用者内容与参数内容进行相减后返回结果
         */
        BigDecimal b3=new BigDecimal("30");
        BigDecimal b4=BigDecimal.valueOf(16);
        BigDecimal b5=b3.subtract(b4);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);
        System.out.println("b5 = " + b5);
        System.out.println("===============================================");
        //(3)multiply
        BigDecimal b6=new BigDecimal("40");
        BigDecimal b7=BigDecimal.valueOf(2);
        BigDecimal b8=b6.multiply(b7);
        System.out.println("b6 = " + b6);
        System.out.println("b7 = " + b7);
        System.out.println("b8 = " + b8);
    }
}
