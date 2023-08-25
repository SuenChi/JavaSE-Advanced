package com.suenchi._04interface.example02;

public class Mouse implements USB{
    //重写:父类有逻辑,子类重新写逻辑
    //实现:父类没有逻辑,子类规定其逻辑

    @Override
    public void powerOn() {
        System.out.println("鼠标插入USB接口,开始安装驱动...");
        System.out.println("鼠标驱动安装完毕!");
    }

    @Override
    public void powerOff() {
        System.out.println("鼠标拔出USB接口,开始卸载驱动...");
        System.out.println("鼠标驱动卸载完毕");
    }

    @Override
    public void use() {
        System.out.println("使用鼠标");
    }
}
