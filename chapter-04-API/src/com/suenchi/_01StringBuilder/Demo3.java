package com.suenchi._01StringBuilder;

import java.util.Scanner;

//回文:从前往后看,和,从后往前看,都是同样的
//      举例 : 上海自来水来自海上
//案例:键盘录入一个字符串,判断其是否为回文
public class Demo3 {
    public static void main(String[] args) {
        //1.键盘录入数据
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //2.创建StringBuilder对象,将录入的内容作为初始化内容
        StringBuilder strBuilder = new StringBuilder(str);
        //3.分别输出反转前和反转后的字符串
        System.out.println("反转前的字符串 : " + str);
        System.out.println("反转后的字符串 : " + strBuilder.reverse().toString());
        //4.判断该字符串是否为回文字符串
            //if (strBuilder.reverse().toString().equals(str)) {    //strBuilder已经反转过了,再反转一次又回到原来的状态
        if (strBuilder.toString().equals(str)) {
            System.out.println("您所输入的字符串是回文");
        } else {
            System.out.println("您所输入的字符串不是回文");
        }
    }
}