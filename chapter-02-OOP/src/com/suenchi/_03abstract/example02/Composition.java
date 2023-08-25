package com.suenchi._03abstract.example02;

public abstract class Composition {
    public final void write(String title){
        System.out.println("作文题目:"+title);
        System.out.print("作文内容:");
        //作文内容,每个人都不一样
        writeBody();
        System.out.println("感谢各位的聆听!");
    }

    //抽象方法,需要子类重写
    public abstract void writeBody();
}
