package com.itheima.regex;

public class RegexDemo2 {
    public static void main(String[] args) {
        //单字符匹配(预定义字符匹配练习) public boolean matches(String regex):判断调用者内容是否与正则表达式匹配
        //在Java中的\有特殊含义,所以需要在\再编写一个\告诉Java后面的内容只是一个普通字符内容不需要进行解析
        System.out.println("中".matches(".")); //T : 任意单字符
        System.out.println("中国".matches(".")); //F : 任意单字符
        System.out.println("3".matches("\\d"));  //T : 任意一个单个数字
        System.out.println("a".matches("\\d"));  //F : 任意一个单个数字
        System.out.println(" ".matches("\\s"));   //T : 任意一个空白字符
        System.out.println("a".matches("\\s")); //F : 任意一个空白字符
        System.out.println("a".matches("\\S"));  //T : 任意一个非空白字符
        System.out.println(" ".matches("\\S")); //F : 任意一个非空白字符
        System.out.println("a".matches("\\w"));  //T : 任意一个单数字字母下划线
        System.out.println("_".matches("\\w")); //T : 任意一个单数字字母下划线
        System.out.println("蔡".matches("\\w")); //F : 任意一个单数字字母下划线
        System.out.println("蔡".matches("\\W"));  //T : 任意一个非数字字母下划线
        System.out.println("a".matches("\\W"));  //F : 任意一个非数字字母下划线
        System.out.println("23232".matches("\\d")); //F : 任意一个单个数字
    }
}
