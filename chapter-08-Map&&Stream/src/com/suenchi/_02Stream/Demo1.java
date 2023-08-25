package com.suenchi._02Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

/**获取Stream流的四种方式
 * 1.获取单列集合的Stream流
 * 2.获取双列集合的Stream流
 * 3.获取数组的Stream流
 * 4.获取零散数据的Stream流
 */
public class Demo1 {
    public static void main(String[] args) {
        //创建单列集合对象
        ArrayList<String> list=new ArrayList<>();
        //创建双列集合对象
        HashMap<String,Integer> map=new HashMap<>();
        //创建数组对象
        Integer[] arr=new Integer[0];

        /**★1.单列集合获取Stream流
         * 直接调用stream()
         * default Stream<E> stream
         *      获取当前集合对象的Stream流
         */
        Stream<String> stream1=list.stream();

        /**2.双列集合获取Stream流
         * 先变成单列, 再获取
         */
        Stream<Map.Entry<String,Integer>> stream2=map.entrySet().stream();

        /**★3.数组获取Stream流
         * 基于Arrays的静态方法stream()
         * public static <T> Stream<T> stream(T[] arr)
         *      获取当前数组的Stream流
         */
        Stream<Integer> stream3= Arrays.stream(arr);

        /**4.零散数据获取Stream流
         * 基于Stream接口的静态方法of
         * public static <T> Stream<T> of(T...values)
         *      获取当前接收数据的Stream流
         */
        Stream<String> stream4=Stream.of("suenchi","cassius","cooper");
    }
}
