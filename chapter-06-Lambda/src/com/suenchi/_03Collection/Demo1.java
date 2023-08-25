package com.suenchi._03Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Collection的常用方法
 * 1.public boolean remove(Object obj)
 * 2.public boolean contains(Object obj)
 * 3.public int size()
 * 4.public boolean isEmpty()
 * 5.public T[] toArray(T[] arr)
 * 6.public void clear()
 */
public class Demo1 {
    public static void main(String[] args) {
        //基于多态, 创建一个Collection接口引用指向ArrayList实现类对象
        Collection<String> strCollection=new ArrayList<>();
        /**
         * public boolean add(E e)
         *      添加元素到集合末尾
         */
        strCollection.add("张三");
        strCollection.add("李四");
        strCollection.add("王五");
        strCollection.add("赵六");

        System.out.println("strCollection = " + strCollection);

        /**
         * public boolean remove(Object obj)
         *      删除集合中指定元素
         *      ★如果集合存储的是自定义对象, 要正常使用此方法, 还需要在JavaBean中重写equals方法
         */
        boolean removeRes1=strCollection.remove("张三");
        boolean removeRes2=strCollection.remove("张四");
        System.out.println("在集合中删除\"张三\"的结果是 : "+removeRes1);
        System.out.println("在集合中删除\"张四\"的结果是 : "+removeRes2);
        System.out.println("strCollection = " + strCollection);

        /**
         * public boolean contains(Object obj)
         *      判断集合中是否包含指定的对象
         */
        System.out.println("集合中是否包含\"张三\" : "+strCollection.contains("张三"));
        System.out.println("集合中是否包含\"李四\" : "+strCollection.contains("李四"));
        System.out.println("strCollection = " + strCollection);


        /**
         * public int size()
         *      获取集合元素个数
         */
        System.out.println("集合长度为 : "+strCollection.size());

        /**
         * public boolean isEmpty()
         *      判空
         */
        System.out.println("集合是否为一个空集合 : "+strCollection.isEmpty());

        /**
         * public T[] toArray(T[] arr)
         *      将集合转换为指定类型的数组
         *      该方法是一个泛型方法, 参数arr是一个保存集合内容的数组对象
         */
        String[] strArray=strCollection.toArray(new String[strCollection.size()]);
        System.out.println("集合转换为数组后的内容是 : "+ Arrays.toString(strArray));

        /**
         * public void clear()
         *      清空所有元素
         */
        strCollection.clear();
        System.out.println("strCollection = " + strCollection);
    }
}
