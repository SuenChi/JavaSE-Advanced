package com.itheima.set;

import com.itheima.entity.Dog;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * PROJECT_NAME: advanced-415
 * NAME: SetDemo1
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/21
 */
public class SetDemo3 {
    public static void main(String[] args) {
        //创建LinkedHashSet的集合对象
        LinkedHashSet<Dog> dogSet = new LinkedHashSet<>();
        Dog dog1 = new Dog("大黄", 3);
        Dog dog2 = new Dog("花花", 2);
        Dog dog3 = new Dog("笨笨", 1);
        Dog dog4 = new Dog("大黄", 3); //内容和dog1是一模一样
        //计算4个Dog对象的哈希值 -> 基于hashCode方法计算! 未重写:Object(地址) 重写:Dog(内容)
        System.out.println("dog1的哈希值是:" + dog1.hashCode());
        System.out.println("dog2的哈希值是:" + dog2.hashCode());
        System.out.println("dog3的哈希值是:" + dog3.hashCode());
        System.out.println("dog4的哈希值是:" + dog4.hashCode());
        //添加对象到HashSet中(基于哈希表完成去重)
        dogSet.add(dog2);  //花花
        dogSet.add(dog3);  //笨笨
        dogSet.add(dog1);  //大黄
        dogSet.add(dog4);  //重复大黄
        //基于Lambda表达式遍历HashSet集合
        dogSet.forEach(System.out::println);
    }
}
