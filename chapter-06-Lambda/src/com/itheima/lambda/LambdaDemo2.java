package com.itheima.lambda;

import java.util.Random;

/**
 * PROJECT_NAME: advanced-415
 * NAME: LambdaDemo2
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/19
 */
public class LambdaDemo2 {
    public static void main(String[] args) {
        //调用useInterA-匿名内部类方式
        useInterA(new InterA() {
            @Override
            public void show() {
                System.out.println("匿名内部类实现了InterA接口的show方法!");
            }
        });
        //调用useInterA-Lambda表达式(作为唯一抽象方法show方法的逻辑载体)
        //当Lambda作为没有参数没有返回值方法逻辑载体存在的时候,()中不需要任何内容,{}中也不需要编写return;
        useInterA(() -> {
            System.out.println("Lambda表达式实现了InterA接口的show方法!");
        });

        //调用useInterB方法-匿名内部类
        useInterB(new InterB() {
            @Override
            public void function(Integer number) {
                System.out.println("基于匿名内部类判断,本次的number参数" + (number % 2 == 0 ? "是一个偶数!" : "是一个奇数!"));
            }
        });

        //调用useInterB方法-Lambda
        //当Lambda作为有参数没有返回值方法逻辑载体存在的时候,()中需要和方法的形参列表保持一致,{}中不需要编写return;
        useInterB((Integer number) -> {
            System.out.println("基于Lambda表达式操作,本次的number参数*5的结果是" + (number * 5));
        });

        //调用useInterC方法-匿名内部类
        useInterC(new InterC() {
            @Override
            public Integer create() {
                return 100;
            }
        });

        //调用useInterC方法-Lambda
        //当Lambda作为没有参数有返回值方法逻辑载体存在的时候,()中不需要声明内部,{}中必须通过return返回满足方法返回值类型的类型
        useInterC(() -> {
            return new Random().nextInt(100);
        });

        //调用useInterD方法-匿名内部类
        useInterD(new InterD() {
            @Override
            public String make(String food) {
                return food + "汤";
            }
        });

        //调用useInterD方法-Lambda
        //当Lambda作为有参数有返回值方法逻辑载体存在的时候,()中需要和方法的形参列表保持一致,{}中必须通过return返回满足方法返回值类型的类型
        useInterD((String food) -> {
            return "炒" + food;
        });

        //调用useInterE方法-匿名内部类
        useInterE(new InterE() {
            @Override
            public String make(String foodOne, String foodTwo) {
                return foodOne + "炒" + foodTwo;
            }
        });

        //调用useInterE方法-Lambda
        //当Lambda作为有参数有返回值方法逻辑载体存在的时候,()中需要和方法的形参列表保持一致,{}中必须通过return返回满足方法返回值类型的类型
        useInterE((String foodOne, String foodTwo) -> {
            return foodOne + foodTwo + "汤";
        });
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

@FunctionalInterface
interface InterA {
    //声明一个没有参数没有返回值的方法
    void show();
}

@FunctionalInterface
interface InterB {
    //声明一个有参数没有返回值的方法
    void function(Integer number);
}

@FunctionalInterface
interface InterC {
    //声明一个没有参数有返回值的方法
    Integer create();
}

@FunctionalInterface
interface InterD {
    //声明一个有参数有返回值的方法
    String make(String food);
}

@FunctionalInterface
interface InterE {
    //声明一个有多个参数的方法
    String make(String foodOne, String foodTwo);
}
