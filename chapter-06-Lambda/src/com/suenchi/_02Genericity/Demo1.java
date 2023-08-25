package com.suenchi._02Genericity;

/**
 * 1.泛型类的定义
 * 2.泛型类对象的创建
 */
public class Demo1 {
    public static void main(String[] args) {
        /**
         * 1.创建泛型对象:
         *      类名<具体类型> 对象名 = new 类名<具体类型>();
         * 2.优化:
         *      类名<具体类型> 对象名 = new 类名<>();
         */
        Box<String> stringBox=new Box<>();
        stringBox.setData("张三");
        System.out.println("将数据 : "+stringBox.getData()+" 存入盒子");
    }
}

/**
 * 定义泛型类Box
 */
class Box<T>{
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Box(T data) {
        this.data = data;
    }

    public Box() {
    }
}
