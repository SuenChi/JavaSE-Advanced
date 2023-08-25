package com.suenchi._01Arrays;

import java.util.Arrays;
/**
 * public static void sort(数据类型[] arr)
 */
public class Demo2 {
    public static void main(String[] args) {
        /**
         * public static void sort(数据类型[] arr)
         *      对数组元素进行排序
         *      排序方式 : Comparable接口
         */
        int[] arr={1,2,21,32,54,1,324,1,2,23};
        Arrays.sort(arr);
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
