package com.itheima.lambda;

import java.util.Random;

/**
 * PROJECT_NAME: advanced-415
 * NAME: LambdaDemo3
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/19
 */
public class LambdaDemo3 {
    public static void main(String[] args) {
        //省略:方法体中有一行代码{}与分号可以省略
        useInterA(() -> System.out.println("Lambda表达式实现了InterA接口的show方法!"));

        //省略:参数类型与小括号以及方法体的大括号和分号
        useInterB(number -> System.out.println("基于Lambda表达式操作,本次的number参数*5的结果是" + (number * 5)));

        //省略:{}与分号以及return省略
        useInterC(() -> new Random().nextInt(100));

        //省略:参数类型与小括号以及方法体的大括号和分号
        useInterD(food -> "炒" + food);

        //省略:参数类型以及方法体的大括号和分号和return
        useInterE((foodOne, foodTwo) -> foodOne + foodTwo + "汤");
    }

    //练习:声明方法,将InterA作为方法参数,使用Lambda传递参数
    public static void useInterA(InterA interA) {
        interA.show();
    }

    //练习:声明方法,将InterB作为方法参数,使用Lambda传递参数
    public static void useInterB(InterB interB) {
        interB.function(20);
    }

    //练习:声明方法,将InterC作为方法参数,使用Lambda传递参数
    public static void useInterC(InterC interC) {
        Integer i = interC.create();
        System.out.println("本次interC调用create方法返回的结果是 : " + i);
    }

    //练习:声明方法,将InterD作为方法参数,使用Lambda传递参数
    public static void useInterD(InterD interD) {
        String result = interD.make("鸡蛋");
        System.out.println("本次interD调用make方法传递鸡蛋接收的返回值是 : " + result);
    }

    //练习:声明方法,将InterE作为方法参数,使用Lambda传递参数
    public static void useInterE(InterE interE) {
        String result = interE.make("豆角", "土豆");
        System.out.println("本次interE调用make方法传递豆角/土豆接收的返回值是 : " + result);
    }
}
