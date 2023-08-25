package com.suenchi._99homework._code_02;

public class Laptop {
    public void start(){
        System.out.println("电脑开机");
    }
    public void stop(){
        System.out.println("电脑关机");
    }
    public void useUSB(USB usb){
        usb.open();
        usb.close();
    }
}
