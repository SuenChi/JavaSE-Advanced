package com.itheima.lambda;

import java.util.Random;

/**
 * PROJECT_NAME: advanced-415
 * NAME: LambdaDemo2
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/19
 */
public class LambdaDemo4 {
    public static void main(String[] args) {
        //调用useInterA-匿名内部类方式
        useInterA(() -> System.out.println("匿名内部类实现了InterA接口的show方法!"));

        //调用useInterB方法-匿名内部类
        useInterB(number -> System.out.println("基于匿名内部类判断,本次的number参数" + (number % 2 == 0 ? "是一个偶数!" : "是一个奇数!")));

        //调用useInterC方法-匿名内部类
        useInterC(() -> 100);

        //调用useInterD方法-匿名内部类
        useInterD(food -> food + "汤");

        //调用useInterE方法-匿名内部类
        useInterE((foodOne, foodTwo) -> foodOne + "炒" + foodTwo);
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

