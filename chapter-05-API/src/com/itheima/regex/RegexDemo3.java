package com.itheima.regex;

public class RegexDemo3 {
    public static void main(String[] args) {
        //多字符匹配(数量匹配练习) public boolean matches(String regex):判断调用者内容是否与正则表达式匹配
        //在Java中的\有特殊含义,所以需要在\再编写一个\告诉Java后面的内容只是一个普通字符内容不需要进行解析
        System.out.println("a".matches("\\w?"));   //T : 数字字母下划线(1次或0次)
        System.out.println("".matches("\\w?"));    //T : 数字字母下划线(1次或0次)
        System.out.println("abc".matches("\\w?")); //F : 数字字母下划线(1次或0次)
        System.out.println("abc12".matches("\\w*"));   //T : 数字字母下划线(任意次)
        System.out.println("".matches("\\w*"));        //T : 数字字母下划线(任意次)
        System.out.println("abc12张".matches("\\w*")); //F : 数字字母下划线(任意次)
        System.out.println("abc12".matches("\\w+"));   //T : 数字字母下划线(1次或n次)
        System.out.println("".matches("\\w+"));       //F : 数字字母下划线(1次或n次)
        System.out.println("abc12张".matches("\\w+")); //F : 数字字母下划线(1次或n次)
        System.out.println("a3c".matches("\\w{3}"));   //T : 数字字母下划线(3次)
        System.out.println("abcd".matches("\\w{3}"));  //F : 数字字母下划线(3次)
        System.out.println("abcd".matches("\\w{3,}"));     //T : 数字字母下划线(至少3次)
        System.out.println("ab".matches("\\w{3,}"));     //F : 数字字母下划线(至少3次)
        System.out.println("abcde蔡".matches("\\w{3,}"));     //F : 数字字母下划线(至少3次)
        System.out.println("abc232d".matches("\\w{3,9}"));     //T : 数字字母下划线(至少3次不超过9次)
    }
}
