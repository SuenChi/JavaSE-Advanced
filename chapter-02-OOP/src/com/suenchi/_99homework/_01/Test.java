package com.suenchi._99homework._01;

public class Test {
    public static void main(String[] args) {
        Audi audi = new SmartAudi();
        audi.run();

        SmartAudi smartAudi = (SmartAudi) audi;
        smartAudi.automaticDrive();
        smartAudi.automaticParking();
    }
}