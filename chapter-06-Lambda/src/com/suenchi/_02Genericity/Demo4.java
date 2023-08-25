package com.suenchi._02Genericity;

import java.util.ArrayList;

/**
 * 1.泛型是否支持多态?
 * 2.利用通配符号 '?' 来提高扩展性
 */
public class Demo4 {
    public static void main(String[] args) {
        ArrayList<Object> objList=new ArrayList<>();
        ArrayList<String> strList=new ArrayList<>();
        ArrayList<Integer> intList=new ArrayList<>();

        func1(objList);
//        func1(strList); //报错,说明泛型不支持多态
//        func1(intList); //报错

        func2(objList);
        func2(strList); //可以使用通配符号 '?' 来提高扩展性
        func2(intList);

    }

    public static void func1(ArrayList<Object> objList){}

    //虽然扩展性提高了, 但通配范围提高得过大, 任何对象作为参数都可传入, 这不是我们所希望的!
    public static void func2(ArrayList<?> objList){}

}
