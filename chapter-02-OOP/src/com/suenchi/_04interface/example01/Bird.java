package com.suenchi._04interface.example01;

public class Bird implements Flyable{
    @Override
    public void fly() {
        System.out.println("小鸟挥动翅膀,翱翔于蓝天白云");
    }
}
