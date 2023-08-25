package com.suenchi._99homework._02;

public class AirConditioning extends Appliance implements Socket{

    @Override
    public void powerOn() {
        System.out.println("空调通电");
    }

    @Override
    public void turnOn() {
        System.out.println("打开空调");
    }

    @Override
    public void turnOff() {
        System.out.println("关闭空调");
    }

    public void refrigeration(){
        System.out.println("空调制冷");
    }
}