package com.suenchi._04box;
//创建包装类对象
public class Demo1 {
    public static void main(String[] args) {
        //Integer
        //1.自动装箱
        Integer i1 = 10;
        //2.构造方法
        Integer i2 = new Integer(10);   //Unnecessary boxing 'new Integer(10)'
        //3.静态方法
        Integer i3 = Integer.valueOf(10);   //Unnecessary boxing 'Integer.valueOf(10)'

        //Double
        //1.自动装箱
        Double d1=13.14;
        //2.构造方法
        Double d2=new Double(13.14);    //Unnecessary boxing 'new Double(13.14)'
        //3.静态方法
        Double d3=Double.valueOf(13.14);    //Unnecessary boxing 'Double.valueOf(13.14)'
    }
}