package com.suenchi._03API_Object;

public class Demo {
    public static void main(String[] args) {
        //未重写toString方法和equals方法
        Student stu1=new Student("孙淇",23,"男");
        Student stu2=new Student("孙淇",23,"男");
        System.out.println("stu1 : "+stu1);
        System.out.println("stu2 : "+stu2);
        System.out.println("stu1==stu2 : "+(stu1==stu2));
        System.out.println("stu1.equals(stu2) : "+stu1.equals(stu2));
        //重写了toString方法和equals方法
        Car car1=new Car("宝马A6",200000,"宝马");
        Car car2=new Car("宝马A6",200000,"宝马");
        System.out.println("car1 : "+car1);
        System.out.println("car2 : "+car2);
        System.out.println("car1==car2 : "+(car1==car2));
        System.out.println("car1.equals(car2) : "+car1.equals(car2));
    }
}