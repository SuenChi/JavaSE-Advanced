package com.suenchi._02Exception;

import java.util.Scanner;

/**
 * 案例 : 用户注册验证
 *     (1)用户名必须是8-16位的数字字母下划线组成的内容, 否则抛出异常
 *     (2)密码必须是6位的数字密码, 否则抛出异常
 *
 *     正则表达式,自定义异常的使用,运行时异常的使用
 */
public class Demo4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您注册的用户名");
        String username=sc.next();
        System.out.println("请输入您注册的密码");
        String password=sc.next();

        //注册验证
        register(username,password);

    }

    public static void register(String username,String password){   //由于RegisterException是运行时异常,故直接抛出即可
        if(!username.matches("\\w{8,16}")){
            throw new RegisterException("您输入的用户名不符合规范(用户名必须是8-16位的数字字母下划线组成的内容)");
        }
        if(!password.matches("\\d{6}")){
            throw new RegisterException("您输入的密码不符合规范(密码必须是6位的数字密码)");
        }

        System.out.println("恭喜,注册成功,您的用户名为 : "+username+" , 用户密码为 : "+password);
    }

}
