package com.suenchi._99homework._02;

public class Test {
    public static void main(String[] args) {
        Television tv=new Television();
        tv.powerOn();
        tv.turnOn();
        tv.playVideo();
        tv.turnOff();

        AirConditioning airC=new AirConditioning();
        airC.powerOn();
        airC.turnOn();
        airC.refrigeration();
        airC.turnOff();
    }

}