package com.itheima.lambda;

/**
 * PROJECT_NAME: advanced-415
 * NAME: LambdaDemo1
 * <b>AUTHOR: SHINIAN</b>
 * DATE: 2023/8/19
 */
public class LambdaDemo1 {
    public static void main(String[] args) {
        //之前(面向对象)思想:可以使用匿名内部类创建Flyable接口的实现类对象
        useFlyable(new Flyable() {
            @Override
            public void fly() {
                System.out.println("煽动翅膀飞行!");
            }
        });

        /*
        函数式思想:可明确的就是可省略的
            问题1:调用useFlyable方法,是不是一定要传递一个Flyable接口的实现类对象? 明确! -> 可以省略!
            问题2:传递Flyable接口的实现类对象,是不是一定要实现接口中的抽象方法fly? 明确! -> 可以省略!
            问题3:实现fly方法的逻辑能不能明确?  不能! -> 不能省略!
        既然只有方法的逻辑不能省略,那么就只需要传递方法的逻辑作为参数即可! Lambda表达式本质就是一个方法逻辑的载体。
         */
        useFlyable(() -> {
            System.out.println("通过引擎产生推力进行飞行!");
        });
    }

    //定义一个方法,将Flyable接口声明为方法的参数,并在方法中使用接口调用fly方法
    public static void useFlyable(Flyable f) {
        f.fly();
    }
}
