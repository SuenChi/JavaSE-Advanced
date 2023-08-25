package com.suenchi._04interface.example02;

public class Demo {
    public static void main(String[] args) {
        insertUSB(new Mouse());
        insertUSB(new Keyboard());
    }

    public static void insertUSB(USB usb){
        usb.powerOn();
        usb.use();
        usb.powerOff();
    }
}