package com.suenchi._04interface.example02;

public class Keyboard implements USB{
    @Override
    public void powerOn() {
        System.out.println("键盘插入USB接口,开始安装驱动...");
        System.out.println("键盘驱动安装完毕!");
    }

    @Override
    public void powerOff() {
        System.out.println("键盘拔出USB接口,开始卸载驱动...");
        System.out.println("键盘驱动卸载完毕");
    }

    @Override
    public void use() {
        System.out.println("使用键盘");
    }
}
