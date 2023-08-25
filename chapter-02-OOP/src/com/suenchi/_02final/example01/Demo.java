package com.suenchi._02final.example01;

public class Demo {
    public static void main(String[] args) {
        //final修饰基本数据类型变量:可以在声明时赋值,也可以先声明再赋值(变量只能赋值1次,但赋值的时机可以选择)
        final int n1=10;
        final int n2;
        n2=20;
        //final修饰引用数据类型变量:
        final String n3="suenchi";
//        n3="sunqi";   //报错

    }
}
