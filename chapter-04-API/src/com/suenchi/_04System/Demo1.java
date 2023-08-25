package com.suenchi._04System;

/**public static void exit(int status) : 终止Java虚拟机
 *      status为0 : 正常关闭 实际开发中千万不要用!
 *      会显示在控制台上:Process finished with exit code 0
 */
public class Demo1 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        //终止Java虚拟机
        System.exit(0);
        System.out.println(3);
        System.out.println(4);
    }
}