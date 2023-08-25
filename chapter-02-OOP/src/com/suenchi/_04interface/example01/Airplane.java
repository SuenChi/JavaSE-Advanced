package com.suenchi._04interface.example01;

public class Airplane implements Flyable{
    @Override
    public void fly() {
        System.out.println("飞机引擎轰鸣,翱翔天际");
    }
}
