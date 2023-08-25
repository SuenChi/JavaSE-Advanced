package com.suenchi._02final.example02;

public class Car {
    //final修饰成员变量

    //若final修饰的变量没有初始化值
    //报错原因:brand唯一一次的赋值机会被系统用掉了,而且赋值为null
    final String brand;
    //解决方法:所有的构造方法都需要带有此参数==>不能有无参构造
    int age;

    //若final修饰的变量有初始化值,则所有的构造方法都不能带有此参数

/*
    public Car(int age) {
        this.age = age;
    }
*/

    public Car(String brand, int age) {
        this.brand = brand;
        this.age = age;
    }
}
