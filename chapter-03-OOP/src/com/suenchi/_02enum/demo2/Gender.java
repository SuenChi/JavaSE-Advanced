package com.suenchi._02enum.demo2;
//不使用enum枚举类,该如何创建一个只有有限个数对象的类
public class Gender {
    private Gender() {
    }
    public static final Gender MALE=new Gender();
    public static final Gender FEMALE=new Gender();
}

class Test{
    public static void main(String[] args) {
        Gender male=Gender.MALE;
        Gender female=Gender.FEMALE;
    }
}