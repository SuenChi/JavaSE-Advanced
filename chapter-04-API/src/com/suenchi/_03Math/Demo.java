package com.suenchi._03Math;

public class Demo {
    public static void main(String[] args) {
        //(1)public static int abs(int n): 获取参数绝对值
        System.out.println(Math.abs(-25));

        //(2)public static double ceil(double n): 向上取整
        System.out.println(Math.ceil(10.1));
        System.out.println(Math.ceil(10.9));
        System.out.println(Math.ceil(10.0));

        //(3)public static double floor(double n): 向下取整
        System.out.println(Math.floor(10.1));
        System.out.println(Math.floor(10.9));
        System.out.println(Math.floor(10.0));

        //(4)public static int round(float n): 四舍五入
        System.out.println(Math.round(1.4));
        System.out.println(Math.round(1.5));
        System.out.println(Math.round(1.49));   //按照小数点后第一位小数四舍五入

        //(5)public static int max(int n1,int n2)
        System.out.println(Math.max(10,11));

        //(6)public static int min(int n1,int n2)
        System.out.println(Math.min(10,11));

        //(7)public static double pow(double n1,double n2): 返回n1的n2次方
        System.out.println(Math.pow(2,4));

        //(8)public static double random(): 随机获取一个[0.0~1.0)之间的小数
        for (int i = 0; i < 5; i++) {
            System.out.println(Math.floor(Math.random()*100));  //快速获取0~99之间的随机数
        }
    }
}