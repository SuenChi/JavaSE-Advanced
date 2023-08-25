package com.itheima.set;

import java.util.HashSet;
import java.util.function.Consumer;

/**
 * PROJECT_NAME: advanced-415
 * NAME: SetDemo1
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/21
 */
public class SetDemo1 {
    public static void main(String[] args) {
        //创建HashSet的集合对象
        HashSet<String> stringSet = new HashSet<>();

        //由于HashSet能够使用的方法基本上都是实现自Collection接口的没有特有方法
        stringSet.add("张二狗");
        stringSet.add("李狗蛋");
        stringSet.add("刘铁柱");
        stringSet.add("刘铁柱"); //如果可以保证元素唯一(添加重复内容不存)

        //基于Lambda表达式遍历HashSet集合
        stringSet.forEach(System.out::println);
    }
}
