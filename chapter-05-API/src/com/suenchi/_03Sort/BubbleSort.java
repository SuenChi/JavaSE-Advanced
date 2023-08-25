package com.suenchi._03Sort;

import java.util.Arrays;

/**
 * 找工作时可能要求你手写一个冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.ceil(Math.random() * 100);
        }
        System.out.println("排序前的数组 : " + Arrays.toString(arr));
        sort(arr);
        System.out.println("排序前的数组 : " + Arrays.toString(arr));
    }

    public static void sort(int[] arr) {
        int flag;
        for (int i = 0; i < arr.length; i++) {
            flag = 1;
            for (int i1 = 0; i1 < arr.length - i - 1; i1++) {
                if (arr[i1] > arr[i1 + 1]) {
                    flag = 0;
                    int t = arr[i1];
                    arr[i1] = arr[i1 + 1];
                    arr[i1 + 1] = t;
                }
            }
            if (flag == 1) {
                break;
            }
        }
    }
}
