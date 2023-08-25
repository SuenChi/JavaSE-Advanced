package com.suenchi._99homework.expand02.subclass;

import com.suenchi._99homework.expand02.template.House;

public class House01 extends House {
    public House01() {
        super();
    }

    public House01(String name) {
        super(name);
    }

    @Override
    protected void createWindow() {
        System.out.println(getName()+"的窗户要面向北方");
    }

    @Override
    protected void createDoor() {
        System.out.println(getName()+"的门采用防盗门");
    }

    @Override
    protected void createWall() {
        System.out.println(getName()+"的墙使用大理石建造");
    }

    @Override
    protected void createGround() {
        System.out.println(getName()+"的地基使用钢铁地基");
    }
}
