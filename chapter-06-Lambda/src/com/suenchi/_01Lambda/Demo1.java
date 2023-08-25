package com.suenchi._01Lambda;

public class Demo1 {
    public static void main(String[] args) {

        /**
         * 无参无返
         */
        /*useInterA(new InterA() {
            @Override
            public void show() {
                System.out.println("利用匿名内部类调用了useInterA()方法");
            }
        });
        useInterA(()->{
            System.out.println("利用Lambda表达式调用了useInterA()方法");
        });*/

        /**
         * 有参无返
         */
        /*useInterB(new InterB() {
            @Override
            public void function(Integer number) {
                System.out.println("利用匿名内部类调用了useInterB()方法,接受到参数 : "+number);
            }
        });

        useInterB((Integer number)->{
            System.out.println("利用Lambda表达式调用了useInterB()方法,接受到参数 : "+number);
        });*/

        /**
         * 无参有返
         */
        /*useInterC(new InterC() {
            @Override
            public Integer create() {
                Integer i = 2048;
                System.out.println("利用匿名内部类调用了useInterC()方法,返回参数 : " + i);
                return i;
            }
        });

        useInterC(()->{
            Integer i = 2048;
            System.out.println("利用Lambda表达式调用了useInterC()方法,返回参数 : " + i);
            return i;
        });*/

        /**
         * 有参有返
         */
        /*useInterD(new InterD() {
            @Override
            public String make(String food) {
                String str = "炒" + food;
                System.out.println("利用匿名内部类调用了useInterD()方法,接收到参数 : " + food + " 返回参数 : " + str);
                return str;
            }
        });
        useInterD((String food)->{
            String str = "炒" + food;
            System.out.println("利用Lambda表达式调用了useInterD()方法,接收到参数 : " + food + " 返回参数 : " + str);
            return str;
        });*/

        /**
         * 多参有返
         */
        useInterE(new InterE() {
            @Override
            public String make(String foodOne, String foodTwo) {
                String str = foodOne + "炒" + foodTwo;
                System.out.println("利用匿名内部类调用了useInterE()方法,接收到参数 : " + foodOne + " 和 : " + foodTwo + " 返回参数 : " + str);
                return str;
            }
        });

        useInterE((String foodOne,String foodTwo)->{
            String str = foodOne + "炒" + foodTwo;
            System.out.println("利用Lambda表达式调用了useInterE()方法,接收到参数 : " + foodOne + " 和 : " + foodTwo + " 返回参数 : " + str);
            return str;
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