package com.suenchi._02Exception;

import java.io.IOException;

/**
 * 如何处理编译期异常?
 *      (2)背锅法示例
 */
public class Demo3 {
    public static void main(String[] args) {
        //将可能产生异常的代码基于try...catch语法结构进行进行处理
        try {
            func();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("背锅法抛出异常后的代码执行了");
    }
    public static void func() throws IOException {
        //甩锅法 : 要在当前方法上声明可以抛出异常
        throw new IOException();
    }
}
