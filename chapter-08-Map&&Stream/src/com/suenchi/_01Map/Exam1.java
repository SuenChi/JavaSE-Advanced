package com.suenchi._01Map;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 案例: 统计一串字符串中各个字符的个数
 * 要求 : 使用HashMap
 * public boolean containsKey(Object key)
 * public V get(Object key)
 * public V put(K key,V value)
 */
public class Exam1 {
    public static void main(String[] args) {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一串字符 : ");
        String str=sc.next();
        for (int i = 0; i < str.length(); i++) {
            Character c=str.charAt(i);
            //public boolean containsKey(Object key)
            if(hashMap.containsKey(c)){
                //public V get(Object key)
                int cnt=hashMap.get(c);
                //public V put(K key,V value)
                hashMap.put(c,cnt+1);
            }else{
                hashMap.put(c,1);
            }
        }
        System.out.println("hashMap = " + hashMap);
    }
}
