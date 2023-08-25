package com.suenchi._04box;

/**
 * 已知:
 * 1.一个对象默认不能与数字进行加减乘除运算
 * 2.给一个引用类型的变量赋值应该赋的是一个地址值,不能是普通数据!
 * 自动拆箱是啥:当系统发现只有将包装类对象拆箱后才能继续完成操作,那么系统就自动会完成拆箱
 * 自动装箱是啥:当系统发现只有将基本类型变量装箱后才能继续完成操作,那么系统就自动会完成装箱
 */
public class Demo3 {
    public static void main(String[] args) {
        //自动装箱
        Integer i1 = 100;
        //自动拆箱
        System.out.println(i1 + 20);
        //以下代码自动装箱1次,自动拆箱1次
        Integer i2 = i1 + 30;   //底层代码:Integer i2 = Integer.valueOf(i2.intValue() + 30);
    }
}
