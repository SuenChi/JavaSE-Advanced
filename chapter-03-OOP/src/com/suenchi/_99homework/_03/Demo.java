package com.suenchi._99homework._03;

//要求：请完善下列代码，在main方法中调用Inner的method方法,输出30
public class Demo {
    public static void main(String[] args) {
        // 请在此处调用Inner类中的method方法
        //____________________?
        //1.同级类
        Outer.Inner oi = new Outer().new Inner();
        oi.method();

        //2.成员内部类
        OuterClass.InnerClass oi2=new OuterClass().new InnerClass();
    }
}

/**
 * 同级类：同级的类之间可以互相调用，但是除了 public 的类，其他不能够在其他文件调用
 */
class Outer {
    class Inner {
        public void method(){
            int num = 30;
            System.out.println(num);
        }
    }
}

/**答案分析
 * 内部类能直接访问外部类
 * 外部类不能直接访问内部类
 * 想访问内部类成员,需要创建外部类对象
 * 在根据外部类对象创建内部类对象
 * 格式:外部类类名.内部类类名 对象名 = new 外部类对象.new 内部类对象()
 */