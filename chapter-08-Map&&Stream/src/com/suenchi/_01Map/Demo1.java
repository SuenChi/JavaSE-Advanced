package com.suenchi._01Map;

import java.util.HashMap;

/**
 * Map常用方法
 */
public class Demo1 {
    public static void main(String[] args) {
        HashMap<String, Integer> infoMap = new HashMap<>();

        /**(1) public V put(K key,V value)
         * 添加一个键和一个值到Map集合中
         * 如果本次存储的内容键已存在，则值会覆盖原有的内容
         *      ==> 既能添加数据, 也能修改数据
         */
        System.out.println("(1)------------------------------------------------------------");
        infoMap.put("张三", 10);
        infoMap.put("李四", 13);
        infoMap.put("王五", 12);
        System.out.println("infoMap = " + infoMap);
        infoMap.put("张三", 20);   //起到修改的作用
        System.out.println("infoMap = " + infoMap);

        /**(2) public V remove(Object key)
         * 基于传递的键删除对应的键值数据
         * 若存在则返回value, 若不存在则返回null
         * 若Map的键是自定义类型的数据,则需要重写hashCode方法和equals方法
         */
        System.out.println("(2)------------------------------------------------------------");
        System.out.println("infoMap.remove(\"李四\") = " + infoMap.remove("李四")); //删除存在的键
        System.out.println("infoMap.remove(\"suenchi\") = " + infoMap.remove("suenchi"));   //删除不存在的键
        System.out.println("infoMap = " + infoMap);

        /**(3) public V get(Object key)
         * 基于传递的键返回对应的值
         * 若存在则返回value, 若不存在返回null
         */
        System.out.println("(3)------------------------------------------------------------");
        System.out.println("infoMap.get(\"张三\") = " + infoMap.get("张三"));   //返回存在的键
        System.out.println("infoMap.get(\"suenchi\") = " + infoMap.get("suenchi")); //返回不存在的键
        System.out.println("infoMap = " + infoMap);

        /**(4) public boolean containsKey(Object key)
         * 判断Map中是否包含某个键
         */
        System.out.println("(4)------------------------------------------------------------");
        System.out.println("infoMap.containsKey(\"张三\") = " + infoMap.containsKey("张三"));   //包含的键
        System.out.println("infoMap.containsKey(\"suenchi\") = " + infoMap.containsKey("suenchi")); //不包含的键
        System.out.println("infoMap = " + infoMap);

        /**(5) public boolean containsValue(Object value)
         * 判断Map是否包含某个值
         */
        System.out.println("(5)------------------------------------------------------------");
        System.out.println("infoMap.containsValue(20) = " + infoMap.containsValue(20));//包含的值
        System.out.println("infoMap.containsKey(13) = " + infoMap.containsKey(13)); //不包含的值
        System.out.println("infoMap = " + infoMap);

        /**(6) public int size() :
         * 获取集合长度(键值对个数)
         */
        System.out.println("(6)------------------------------------------------------------");
        System.out.println("infoMap.size() = " + infoMap.size());
        System.out.println("infoMap = " + infoMap);


        /**(7) public boolean isEmpty()
         * 判断集合是否为空集合(true:没元素 false:有元素)
         */
        System.out.println("(7)------------------------------------------------------------");
        System.out.println("infoMap.isEmpty() = " + infoMap.isEmpty());
        System.out.println("infoMap = " + infoMap);

        /**(8) public Set<K> keySet()
         * 获取全部键的集合
         */
        System.out.println("(8)------------------------------------------------------------");
        System.out.println("infoMap.keySet() = " + infoMap.keySet());
        System.out.println("infoMap = " + infoMap);

        /**(9) public Collection<V> values()
         * 获取全部值的集合
         */
        System.out.println("(9)------------------------------------------------------------");
        System.out.println("infoMap.values() = " + infoMap.values());
        System.out.println("infoMap = " + infoMap);

        /**(10) public void clear()
         * 清空集合
         */
        System.out.println("(10)------------------------------------------------------------");
        infoMap.clear();
        System.out.println("infoMap = " + infoMap);
    }
}
