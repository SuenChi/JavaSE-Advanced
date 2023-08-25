package com.suenchi._04box;
//'字符串'与'基本数据类型'还有'包装类'的转换
public class Demo4 {
    public static void main(String[] args) {
        //(1)字符串转换为基本数据类型
        int i=Integer.parseInt("123");

        //(2)字符串转换为包装类
        Integer integer=Integer.valueOf("123");

        //(3)任意数据类型转换为字符串
        String str=String.valueOf(200);

        //(4)拓展
        //int j=Integer.parseInt("suenchi");    //无法正确转换会报错
        boolean b1=Boolean.parseBoolean("true");  //true
        boolean b2=Boolean.parseBoolean("truue");  //boolean转换比较特殊,无法正确转换会返回false

    }
}
