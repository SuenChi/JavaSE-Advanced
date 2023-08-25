package com.suenchi._99homework;

/**
 * 基础题2:
 * 定义一个函数式接口Calculator(计算数据用的)，
 * 含有唯一的抽象方法calculate(计算的方法: 对两个int数据进行运算,返回一个int数据)，
 * 其功能是可以将两个int数字进行计算，并返回结果.
 * <p>
 * 在测试类中定义方法fun,使用函数式接口Calculator作为参数,
 * 在main方法中分别调用fun方法(使用两种方式: 传递lambda表达式标准格式,lambda表达式简化格式),
 * 完成两个int数字的加减乘除运算
 */
public class Test2 {
    public static void main(String[] args) {
        int n1 = 2, n2 = 3;
        //1.匿名内部类格式
        System.out.println(n1 + " + " + n2 + " : " + fun(n1, n2, new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        }));
        //2.标准lambda格式
        System.out.println(n1 + " + " + n2 + " : " + fun(2, 3, (int a, int b) -> {
            return a + b;
        }));

        System.out.println(n1 + " - " + n2 + " : " + fun(n1, n2, (int a, int b) -> {
            return a - b;
        }));

        System.out.println(n1 + " * " + n2 + " : " + fun(n1, n2, (int a, int b) -> {
            return a * b;
        }));

        System.out.println(n1 + " / " + n2 + " : " + fun(n1, n2, (int a, int b) -> {
            return a / b;
        }));

        //3.简化lambda格式
        System.out.println(n1 + " + " + n2 + " : " + fun(n1, n2, (a, b) -> a + b));

        System.out.println(n1 + " - " + n2 + " : " + fun(n1, n2, (a, b) -> a - b));

        System.out.println(n1 + " * " + n2 + " : " + fun(n1, n2, (a, b) -> a * b));

        System.out.println(n1 + " / " + n2 + " : " + fun(n1, n2, (a, b) -> a / b));

    }


    public static int fun(int n1, int n2, Calculator cal) {
        return cal.calculate(n1, n2);
    }
}

@FunctionalInterface
interface Calculator {
    public abstract int calculate(int a, int b);
}