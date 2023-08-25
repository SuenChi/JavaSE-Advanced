package com.suenchi._05Regex;

public class Demo1 {
    public static void main(String[] args) {
        System.out.println("a".matches("[abc]"));   //T : 只能是a,b,c
        System.out.println("e".matches("[abcd]"));  //F : 只能是a,b,c,d
        System.out.println("d".matches("[^abc]"));  //T : 除a,b,c以外的所有字符
        System.out.println("a".matches("[^abc]"));  //F : 除a,b,c以外的所有字符
        System.out.println("b".matches("[a-zA-Z]"));//T : a-z以及A-Z的字符都可以
        System.out.println("2".matches("[a-zA-Z]"));//F : a-z以及A-Z的字符都可以
        System.out.println("k".matches("[a-z&&[^bc]]"));// T : a-z中除b,c之外的字符
        System.out.println("b".matches("[a-z&&[^bc]]"));// F : a-z中除b,c之外的字符
        System.out.println("ab".matches("[a-zA-Z0-9]"));// F : 只能是a-z,A-Z或0-9中的单个字符
    }
}
