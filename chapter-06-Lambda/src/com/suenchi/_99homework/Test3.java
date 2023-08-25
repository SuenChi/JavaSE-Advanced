package com.suenchi._99homework;

import java.util.Arrays;
import java.util.Objects;

/**
 * 基础题3:
 * 定义一组泛型方法，可以获取任意类型数组的最大值、最小值。
 */
public class Test3 {

    public static void main(String[] args) {
        Integer[] arr1 = {1, 43, 654, 213, 56, 213, 1, 12, 654};
        Double[] arr2 = {1.0, 4.3, 65.4, 2.13, 5.6, 2.13, 1.0, 12.0, 6.54};
        System.out.println("arr1 = " + Arrays.toString(arr1));
        System.out.println("arr1的最大值 : "+ getMax(arr1));
        System.out.println("arr1的最小值 : "+getMin(arr1));

        System.out.println("arr2 = " + Arrays.toString(arr2));
        System.out.println("arr2的最大值 : "+getMax(arr2));
        System.out.println("arr2的最小值 : "+getMin(arr2));
    }


    public static <T extends Comparable<T>> T getMax(T[] arr) {
        if (Objects.isNull(arr)) {
            return null;
        }
        T max = arr[0];
        for (T t : arr) {
            if (t.compareTo(max) > 0) {
                max = t;
            }
        }
        return max;
    }

    public static <T extends Comparable<T>> T getMin(T[] arr) {
        if (Objects.isNull(arr)) {
            return null;
        }
        T min = arr[0];
        for (T t : arr) {
            if (t.compareTo(min) < 0) {
                min = t;
            }
        }
        return min;
    }
}
