package com.suenchi._99homework._02;

public class Television extends Appliance implements Socket{

    @Override
    public void powerOn() {
        System.out.println("电视通电");
    }

    @Override
    public void turnOn() {
        System.out.println("打开电视");
    }

    @Override
    public void turnOff() {
        System.out.println("关闭电视");
    }

    public void playVideo(){
        System.out.println("播放电视剧");
    }
}
