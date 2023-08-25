package com.suenchi._02Exception;

import java.io.IOException;

/**
 * 如何处理编译期异常?
 *      (1)甩锅法示例
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        //甩锅法 : 将调用方法上声明的编译期异常, 继续在当前方法上声明
        func();
        System.out.println("甩锅法抛出异常后的代码执行了");   //实际没有执行
    }
    public static void func() throws IOException {
        //甩锅法 : 要在当前方法上声明可以抛出异常
        throw new IOException();
    }
}
