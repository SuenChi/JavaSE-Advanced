package com.suenchi._99homework;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

/**进阶题1:
 * 中国福利彩票"双色球"投注区分为红色球号码区和蓝色球号码区，
 * 红色球号码区由1-33共三十三个号码组成，
 * 蓝色球号码区由1-16共十六个号码组成
 * 投注时选择6个红色球号码和1个蓝色球号码组成一注进行单式投注
 * 现通过程序模拟双色球随机生成一注号码, 要求红球号码从小到大排序,且号码不能重复
 * 要求 : 使用TreeSet实现
 */
public class Test4 {
    public static void main(String[] args) {
        //1.创建TreeSet集合对象 : redSet
        TreeSet<Integer> redSet=new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        //2.随机生成6个互不重复的红球号码
        Random r=new Random();
        while(redSet.size()<6){
            int i=r.nextInt(33)+1;
            redSet.add(i);
        }
        //3.随机生成一个篮球号码
        int blueBall=r.nextInt(16)+1;

        //4.输出此次随机生成的双色球号码
        System.out.println(redSet+" | "+blueBall);
    }
}
