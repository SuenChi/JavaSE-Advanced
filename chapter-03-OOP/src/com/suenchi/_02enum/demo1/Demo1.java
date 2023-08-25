package com.suenchi._02enum.demo1;
//单例模式回顾
public class Demo1 {
    //1.构造私有化
    private Demo1() {
    }
    //2.维护一个静态成员变量
    private static final Demo1 obj=new Demo1();

    //3.提供一个静态方法获取该类唯一的对象
    public static Demo1 getInstance(){
        return obj;
    }
}

class Test{
    public static void main(String[] args) {
        //如果对象的地址都一样,说明输出的是同一个对象
        System.out.println(Demo1.getInstance());
        System.out.println(Demo1.getInstance());
        System.out.println(Demo1.getInstance());
        System.out.println(Demo1.getInstance());
    }
}
