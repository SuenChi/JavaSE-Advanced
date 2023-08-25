package com.itheima.regex;

public class RegexDemo5 {
    public static void main(String[] args) {
        //需求1:校验密码(必须是数字/字母/下划线 至少6位)
        System.out.println("abc_123".matches("\\w{6,}"));   //T
        System.out.println("abc_1".matches("\\w{6,}")); //F
        System.out.println("abc#123".matches("\\w{6,}"));   //F
        //需求2:验证码(必须是数字和英文大小写字母 必须是4位)
        System.out.println("aBs3".matches("[a-zA-Z0-9]{4}"));   //T
        System.out.println("aBs35".matches("[a-zA-Z0-9]{4}"));  //F
        System.out.println("aB%5".matches("[a-zA-Z0-9]{4}"));   //F
        System.out.println("aBs3".matches("[a-zA-Z0-9]{4}")); //T
    }
}
