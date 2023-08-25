package com.suenchi._99homework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/**
 * 基础题4:
 * 以多态的形式定义一个Collection集合，添加以下英文名：
 * Angelababy
 * Alexis
 * Cyndi
 * Eason
 * Ruby
 * 接着依次使用迭代器、增强for循环、Lambda表达式三种方式遍历集合，将得到的数据全部转换成大写输出
 */
public class Test4 {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        Collections.addAll(names, "Angelababy", "Alexis", "Cyndi", "Eason", "Ruby");

        //1.迭代器
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str + " 全部转为大写后 : " + str.toUpperCase());
        }

        //2.增强for循环
        for (String name : names) {
            System.out.println(name + " 全部转为大写后 : " + name.toUpperCase());
        }

        //3.lambda表达式
        names.forEach(s -> System.out.println(s + " 全部转为大写后 : " + s.toUpperCase()));
    }
}
