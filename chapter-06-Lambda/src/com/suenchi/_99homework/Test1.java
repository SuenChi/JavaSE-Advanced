package com.suenchi._99homework;

/**
 * 基础题1:
 * 定义一个函数式接口JumpAble(会跳的/能跳的)，含有唯一的抽象方法jump(跳的方法)，且无参数、无返回值.
 * 在测试类中定义方法fun,使用函数式接口JumpAble作为参数,fun方法内部调用JumpAble接口的jump方法.
 * 在main方法中调用fun方法(使用三种方式: 传递匿名内部类对象,传递lambda表达式标准格式,lambda表达式简化格式)
 */
public class Test1 {
    public static void main(String[] args) {
        //1.传递匿名内部类对象调用fun
        fun(new JumpInter() {
            @Override
            public void jump() {
                System.out.println("使用匿名内部类对象调用fun");
            }
        });
        //2.传递lambda表达式标准格式调用fun
        fun(()->{
            System.out.println("传递lambda表达式标准格式调用fun");
        });

        //3.传递lambda表达式简化格式调用fun
        fun(() -> System.out.println("传递lambda表达式简化格式调用fun"));

    }


    public static void fun(JumpInter jumpInter) {
        jumpInter.jump();
    }
}


@FunctionalInterface
interface JumpInter {
    public abstract void jump();
}
