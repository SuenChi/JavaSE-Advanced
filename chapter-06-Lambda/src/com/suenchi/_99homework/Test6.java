package com.suenchi._99homework;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

/**进阶题2:
 * "抓阄"是指每人从预先做好记号的纸卷或纸团中摸取一个，以决定做什么。
 * 比如：学羊叫5声、蛙跳10个、吃芥末、喝一杯啤酒、做10个俯卧撑等。
 * 请设计一个抓阄游戏程序，实现5个人的抓阄
 */
public class Test6 {
    public static void main(String[] args) {
        List<String> nameList=new ArrayList<>();
        Collections.addAll(nameList,"suenchi","sunqi","cooper","cassius","christopher");
        List<String> lotsList=new ArrayList<>();
        Collections.addAll(lotsList,"学羊叫5声","蛙跳10个","吃芥末","喝一杯啤酒","做10个俯卧撑");
        Random r=new Random();
        nameList.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                int index=r.nextInt(lotsList.size());
                System.out.println(s+"抽到的是 : "+lotsList.remove(index));
            }
        });
    }
}
