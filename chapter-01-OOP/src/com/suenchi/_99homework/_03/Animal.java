package com.suenchi._99homework._03;

public class Animal {
    private String color;
    private int legNum;

    public void eat(){
        System.out.println("吃");
    }

    public Animal() {
    }

    public Animal(String color, int legNum) {
        this.color = color;
        this.legNum = legNum;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegNum() {
        return legNum;
    }

    public void setLegNum(int legNum) {
        this.legNum = legNum;
    }
}
