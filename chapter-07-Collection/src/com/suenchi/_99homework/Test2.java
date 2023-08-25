package com.suenchi._99homework;

import java.util.*;

/**基础题2:
 * 彩票双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
 * 红色球号码从1~33中选择；蓝色球号码从1~16中选择；
 * 请结合集合所学知识，随机生成一注双色球号码，要求同色号码不重复, 红色球从小到大排序。
 */
public class Test2 {
    public static void main(String[] args) {
        //利用HashSet中元素不重复的特性

        //1.创建一个HashSet集合redBallSet
        HashSet<Integer> redBallSet=new HashSet<>();

        //2.不断从1~33中随机生成红球的号码,添加到该集合中,直到HashSet集合包含6个元素
        Random r=new Random();
        while(redBallSet.size()<6){
            int i=r.nextInt(33)+1;
            redBallSet.add(i);
        }

        //3.从1~16中随机生成一个篮球的号码
        int blueBall=r.nextInt(16)+1;

        //4.将redBallSet放到ArrayList中, 完成排序
        ArrayList<Integer> ballList = new ArrayList<>(redBallSet);
        Collections.sort(ballList);

        //5.将蓝色球号码添加到ballList中
        ballList.add(blueBall);

        //6.输出双色球号码
        System.out.println("此次随机生成的双色球号码为 : "+ballList);

    }
}
