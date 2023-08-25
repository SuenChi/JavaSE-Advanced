package com.suenchi._99homework;

/**基础题1：猴子吃桃问题
 * 猴子第一天摘下若干桃子，当即吃了一半，觉得好不过瘾，于是又多吃了一个
 * 第二天又吃了前天剩余桃子数量的一半，觉得好不过瘾，于是又多吃了一个
 * 以后每天都是吃前天剩余桃子数量的一半，觉得好不过瘾，又多吃了一个
 * 等到第10天的时候发现桃子只有1个了。
 * 需求：请问猴子第一天摘了多少个桃子？
 */
public class Test01 {
    public static void main(String[] args) {
        /**
         * 第十天 : 1
         * 第九天 : (1+1)*2=4
         * 第八天 : (4+1)*2=10
         * ......
         */
        System.out.println("猴子第一天摘了 " + func(10, 1)+" 个桃子");
    }

    /**
     * 倒推第一天的桃子总数, 若day==1, 则直接返回n即可
     * @param day 天数
     * @param n 该天数剩余的桃子
     * @return 第一天总共有多少桃子
     */
    public static int func(int day,int n){
        if(day==1)
            return n;
        return func(day-1,(n+1)*2);
    }
}