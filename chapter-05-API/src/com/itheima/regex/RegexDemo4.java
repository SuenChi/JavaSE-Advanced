package com.itheima.regex;

public class RegexDemo4 {
    public static void main(String[] args) {
        //单字符匹配(其他匹配练习) public boolean matches(String regex):判断调用者内容是否与正则表达式匹配
        System.out.println("abc".matches("(?i)abc")); //T : abc可以任意大小写
        System.out.println("ABC".matches("(?i)abc")); //T : abc可以任意大小写
        System.out.println("aBc".matches("a((?i)b)c")); //T : ac必须小写B可以任意大小写
        System.out.println("ABc".matches("a((?i)b)c")); //F : ac必须小写B可以任意大小写
    }
}
