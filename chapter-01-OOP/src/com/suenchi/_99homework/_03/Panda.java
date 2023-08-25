package com.suenchi._99homework._03;

public class Panda extends Animal {
    public Panda() {
    }

    public Panda(String color, int legNum) {
        super(color, legNum);
    }

    @Override
    public void eat() {

        System.out.println(getColor()+getLegNum()+"条腿的熊猫在吃蜂蜜");
    }

    public void climbTree() {
        System.out.println(getColor()+getLegNum()+"条腿的熊猫在爬树");
    }
}
