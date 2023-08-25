package com.itheima.collections;

import com.itheima.entity.Dog;

import java.util.ArrayList;
import java.util.Collections;

/**
 * PROJECT_NAME: advanced-415
 * NAME: CollectionDemo1
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/21
 */
public class CollectionsDemo3 {
    public static void main(String[] args) {
        //Collections是工具类里面的静态方法
        ArrayList<Dog> dogList = new ArrayList<>();
        Collections.addAll(dogList, new Dog("大黄", 3), new Dog("花花", 2), new Dog("笨笨", 4));
        //public static <T> void sort(List list) : 基于元素包含排序规则完成集合内容排序
        Collections.sort(dogList);
        dogList.forEach(System.out::println);
    }
}
