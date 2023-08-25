package com.suenchi._99homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**基础题1:
 * "抓阄"是指每人从预先做好记号的纸卷或纸团中摸取一个，以决定做什么。
 * 比如：学羊叫5声、蛙跳10个、吃芥末、喝一杯啤酒、做10个俯卧撑等。
 * 请设计一个抓阄游戏程序，实现5个人的抓阄
 * */
public class Test1 {
    public static void main(String[] args) {
        //1.一个集合nameList存储5个人的姓名
        ArrayList<String> nameList=new ArrayList<>(5);
        Collections.addAll(nameList,"suenchi","sunqi","cooper","cassius","christopher");

        //2.一个集合xList存储5个阄的内容
        ArrayList<String> xList=new ArrayList<>(5);
        Collections.addAll(xList,"学羊叫5声","蛙跳10个","吃芥末","喝一杯啤酒","做10个俯卧撑");

        //3.遍历nameList,随机从xList中获取一个元素,作为该人抓到的阄,然后删除该元素
        Random r=new Random();
        for (String s : nameList) {
            int index=r.nextInt(xList.size());
            System.out.println(s+"抓到的阄为 : "+xList.remove(index));
        }

        System.out.println("当前xList集合 : "+xList);
    }
}