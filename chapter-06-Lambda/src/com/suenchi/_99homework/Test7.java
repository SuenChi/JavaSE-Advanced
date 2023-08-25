package com.suenchi._99homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/**进阶题3:
 * "斗地主"游戏规则：本游戏为三人游戏，一副牌54张，每人17张，留3张做底牌，在确定地主之前玩家不能看底牌。
 * 确定地主后，地主可获得3张底牌。
 *
 * 请在素材的landlords项目的Entry类中指定位置补全相关代码，实现斗地主的发牌以及看牌功能
 * 操作步骤:
 * 1、创建四个List集合对象，分别用来存储3个玩家的牌以及底牌
 * 2、遍历牌盒将合适的牌存储到上述指定的集合中
 * 3、看牌就是对集合的元素进行遍历
 * */
public class Test7 {
    public static void main(String[] args) {

        //创建一个牌盒，也就是定义一个集合对象，用ArrayList集合实现
        List<String> broker = new ArrayList<>();

        /*往牌盒里装牌
         * ♦♣♥♠
         * */
        //定义花色数组
        String[] colors = {"♦" , "♣" , "♥" , "♠" };

        //定义点数数组
        String[] numbers = {"2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "J" , "Q" , "K" , "A"};

        //拼接让每个花色都有13张从2-A的牌
        for (String color : colors) {
            for (String number : numbers) {
                broker.add(color+number);
            }
        }

        //加入大小王
        broker.add("小王");
        broker.add("大王");

        // 洗牌，打乱集合中的元素
        Collections.shuffle(broker);

        // 补全代码
        List<String> player1=new ArrayList<>();
        List<String> player2=new ArrayList<>();
        List<String> player3=new ArrayList<>();
        List<String> player4=new ArrayList<>();

        //发牌
        int i = 0;
        for (; i < broker.size()-3;) {
            player1.add(broker.get(i++));
            player2.add(broker.get(i++));
            player3.add(broker.get(i++));
        }
        player4.add(broker.get(i++));
        player4.add(broker.get(i++));
        player4.add(broker.get(i++));

        //打印牌
        System.out.print("玩家1的牌 : ");
        myPrint(player1);
        System.out.print("玩家2的牌 : ");
        myPrint(player2);
        System.out.print("玩家3的牌 : ");
        myPrint(player3);
        System.out.print("底牌 : ");
        myPrint(player4);

    }
    public static void myPrint(List<String> player){
        player.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.print(s+" ");
            }
        });
        System.out.println();
    }
}