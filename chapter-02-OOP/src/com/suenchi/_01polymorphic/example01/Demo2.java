package com.suenchi._01polymorphic.example01;
//多态的微观体现(实际开发中使用)
public class Demo2 {
    public static void main(String[] args) {
        func(new Dog());    //传入Dog对象
        func(new Cat());    //传入Cat对象
    }

    public static void func(Animal animal){
        animal.eat();
    }
}