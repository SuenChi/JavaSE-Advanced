package com.suenchi._04interface.example01;

public class Demo {
    public static void main(String[] args) {
        Flyable flyable=new Bird();
        flyable.fly();
        flyable=new Airplane();
        flyable.fly();
    }
}