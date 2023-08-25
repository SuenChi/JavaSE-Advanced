package com.suenchi._04Search;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.ceil(Math.random() * 100);
        }
        System.out.println("排序前的数组 = " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("排序后的数组 = " + Arrays.toString(arr));
        Random r = new Random();
        int index = r.nextInt(arr.length);
        int targetNum = arr[index];
        System.out.println("目标查找的元素为 : " + targetNum);
        binarySearch(arr,targetNum);
    }

    public static void binarySearch(int[] arr, int targetNum) {
        int left = 0, right = arr.length - 1;
        int mid = (left + right) / 2;
        int cnt=0;
        while(left<=right){
            cnt++;
            if(arr[mid]==targetNum){
                break;
            }else if(arr[mid]>targetNum){
                right=mid-1;
            }else{
                left=mid+1;
            }
            mid=(left+right)/2;
        }
        System.out.println("通过二分查找 "+cnt+"次,在排好序的数组中找到目标元素 : "+targetNum);
    }
}
