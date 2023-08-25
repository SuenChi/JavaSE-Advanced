package com.suenchi._99homework._03;

public class Bear extends Animal {
    public Bear() {
    }

    public Bear(String color, int legNum) {
        super(color, legNum);
    }

    @Override
    public void eat() {
        System.out.println(getColor()+getLegNum()+"条腿的北极熊在吃蜂蜜");
    }

    public void catchFish() {
        System.out.println(getColor()+getLegNum()+"条腿的北极熊在抓鱼");
    }
}
