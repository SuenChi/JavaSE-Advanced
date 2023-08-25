package com.suenchi._99homework.expand02.template;

public abstract class House {
    private String name;

    public House() {
    }

    public House(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public final void construct(){
        //地基
        createGround();
        //墙
        createWall();
        //门
        createDoor();
        //窗户
        createWindow();
    }

    protected abstract void createWindow();

    protected abstract void createDoor();

    protected abstract void createWall();

    protected abstract void createGround();
}
