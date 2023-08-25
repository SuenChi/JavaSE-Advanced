package com.suenchi._01Arrays;

import java.util.Arrays;

/**
 * 1.public static String toString(数据类型[] 数组)
 * 2.public static 数据类型[] copyOfRange(数据类型[] arr,起始索引,结束索引)
 * 3.public static 数据类型[] copyOf(数据类型[] arr,int newLength)
 */

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = {12, 3241, 123, 312, 312, 435, 654, 786, 435, 23};
        /**
         * public static String toString(数据类型[] 数组)
         *      将数组内容拼接成字符串后返回
         *      格式 : [元素1,元素2,...]
         */
        String arrStr1= Arrays.toString(arr);
        System.out.println("arrStr1 = " + arrStr1);

        /**
         * public static 数据类型[] copyOfRange(数据类型[] arr,起始索引,结束索引)
         *      拷贝数组,从起始索引到结束索引,且包头不包尾
         */
        int[] newArr=Arrays.copyOfRange(arr,0,3);
        System.out.println("newArr = " + Arrays.toString(newArr));

        /**
         * public static 数据类型[] copyOf(数据类型[] arr,int newLength)
         *      拷贝数组到指定长度的新数组中
         */
        int[] newArr2=Arrays.copyOf(arr,arr.length+5);
        System.out.println("newArr2 = " + Arrays.toString(newArr2));
    }
}
