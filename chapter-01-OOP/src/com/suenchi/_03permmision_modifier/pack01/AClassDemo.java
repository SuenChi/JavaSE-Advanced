package com.suenchi._03permmision_modifier.pack01;

public class AClassDemo {
    public static void main(String[] args) {
        AClass aClass=new AClass();
        System.out.println(aClass.n1);      //public,   所有地方均能访问
        System.out.println(aClass.n2);      //protected,同一个包下,以及子类,可访问
        System.out.println(aClass.n3);      //缺省,      同一个包,可访问
//        System.out.println(aClass.n4);    //private,  当前类中,可访问
    }
}
