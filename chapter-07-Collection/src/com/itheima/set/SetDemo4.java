package com.itheima.set;

import com.itheima.entity.Dog;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * PROJECT_NAME: advanced-415
 * NAME: SetDemo4
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/21
 */
public class SetDemo4 {
    public static void main(String[] args) {
        //创建TreeSet集合保存Dog元素(并且在创建的时候需要声明元素默认的排序规则)
        TreeSet<Dog> dogTreeSet = new TreeSet<>((o1, o2) -> o2.getAge() - o1.getAge());

        Dog dog1 = new Dog("大黄", 5);
        Dog dog2 = new Dog("花花", 12);
        Dog dog3 = new Dog("笨笨", 7);
        Dog dog4 = new Dog("小黄", 5);

        //指定完毕规则之后,当基于add添加元素会默认按照排序完成排序(当排序规则返回的结果是0)
        dogTreeSet.add(dog1);
        dogTreeSet.add(dog2);
        dogTreeSet.add(dog3);
        dogTreeSet.add(dog4);

        dogTreeSet.forEach(System.out::println);
    }
}
