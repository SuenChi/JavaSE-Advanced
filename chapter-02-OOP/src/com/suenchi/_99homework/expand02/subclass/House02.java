package com.suenchi._99homework.expand02.subclass;

import com.suenchi._99homework.expand02.template.House;

public class House02 extends House {
    public House02() {
    }

    public House02(String name) {
        super(name);
    }

    @Override
    protected void createWindow() {
        System.out.println(getName()+"的窗户面向南方");
    }

    @Override
    protected void createDoor() {
        System.out.println(getName()+"的门要采用木门");
    }

    @Override
    protected void createWall() {
        System.out.println(getName()+"的墙使用玻璃制造");
    }

    @Override
    protected void createGround() {
        System.out.println(getName()+"的地基使用花岗岩");
    }
}
