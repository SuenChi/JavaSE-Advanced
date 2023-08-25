package com.suenchi._01Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**Map集合遍历方式
 * 1.将Map放到Set集合后再遍历
 * 2.利用Map对象的forEach方法
 */
public class Demo2 {
    public static void main(String[] args) {
        //生成Map集合
        HashMap<Character, Integer> hashMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一串字符 : ");
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            Character c = str.charAt(i);
            if (hashMap.containsKey(c)) {
                int cnt = hashMap.get(c);
                hashMap.put(c, cnt + 1);
            } else {
                hashMap.put(c, 1);
            }
        }
        /**(1)将Map放到Set集合后再遍历
         * Set<Map.Entry<K, V>> entrySet()
         *      将每个键值对封装为Entry对象后, 保存到Set集合返回
         * 思想: 把“键值对“看成一个整体, 保存到Set集合, 然后遍历该Set集合
         * 技巧：直接用HashMap对象调用entrySet()即可，然后利用var让idea自动生成对象引用；
         */
        System.out.println("(1)-------------------------------------------------------------------");
            //1.将每个Entry对象保存到Set集合中
        Set<Map.Entry<Character, Integer>> entrySet = hashMap.entrySet();
            //2.遍历该Set集合
        entrySet.forEach(entry -> {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key : " + key + " value : " + value);
        });

        /**(2)利用Map对象的forEach方法
         * default void forEach(BiConsumer<K, V> action)
         *      传递BiConsumer的接口实现类，声明消费逻辑
         * 思想: 强调的是做什么(由Java自动完成Map的遍历, 我们只需声明每一个键和值要干什么)
         */
        System.out.println("(2)-------------------------------------------------------------------");
        hashMap.forEach((key, value) -> {
            //由Java自动完成获取每一个键和值的操作,声明accept的目的告诉Java每一个键和值要怎么消费!
            System.out.println("key : " + key + " value : " + value);
        });
    }
}
