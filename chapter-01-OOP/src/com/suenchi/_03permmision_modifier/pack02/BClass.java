package com.suenchi._03permmision_modifier.pack02;

import com.suenchi._03permmision_modifier.pack01.AClass;

public class BClass extends AClass {
    public void show(){
        System.out.println(n1);      //能访问
        System.out.println(n2);      //能访问
//        System.out.println(n3);    //不能访问
//        System.out.println(n4);    //不能访问
    }
}