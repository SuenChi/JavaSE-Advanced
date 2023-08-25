package com.suenchi._04box;
//装箱和拆箱
public class Demo2 {
    public static void main(String[] args) {
        //装箱
        int i1=10;
        Integer i2=Integer.valueOf(i1); //Unnecessary boxing 'Integer.valueOf(i1)'
        //拆箱
        int i3=i2.intValue();   //Unnecessary unboxing 'i2.intValue()'
    }
}