package com.suenchi._99homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * 基础题3:
 * 某房产公司大促销,所有购房者可以参加一次抽奖,抽奖箱中总共有10个奖品,
 * 分别是:"苹果手机","华为手机","三洋踏板摩托","迪拜7日游","苹果笔记本",
 * "联想笔记本","小米空气净化器","格力空调","海尔冰箱","海信电视"
 * 所有抽奖者分成两组进行抽奖,请创建两个线程,名称分别为“第一组”和“第二组”，随机从抽奖箱中完成抽奖
 * 程序运行效果如下图：不要求轮流写，不要求平均分配抽奖次数
 */
public class Demo3 {
    public static class Prize{
        private ArrayList<String> prizeList;
        private Random r=new Random();

        public Prize() {
            prizeList=new ArrayList<>(10);
            Collections.addAll(prizeList,"苹果手机","华为手机","三洋踏板摩托","迪拜7日游","苹果笔记本",
                    "联想笔记本","小米空气净化器","格力空调","海尔冰箱","海信电视");
        }

        public Prize(ArrayList<String> prizeList) {
            this.prizeList = prizeList;
        }

        public String draw(){
            return prizeList.remove(r.nextInt(prizeList.size()));
        }

        public ArrayList<String> getPrizeList() {
            return prizeList;
        }

        public void setPrizeList(ArrayList<String> prizeList) {
            this.prizeList = prizeList;
        }
    }

    public static class MyRunnable implements Runnable{
        private Prize prize;

        public MyRunnable(Prize prize) {
            this.prize = prize;
        }

        @Override
        public void run() {
            while(true){
                synchronized (this){
                    if(prize.getPrizeList().size()>0){
                        String draw = prize.draw();
                        System.out.println(Thread.currentThread().getName()+"抽得奖品:"+draw);
                    }
                    else{
                        break;
                    }
                }
                try {
                    Thread.sleep(60);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Prize prize=new Prize();
        MyRunnable task = new MyRunnable(prize);
        Thread t1 = new Thread(task, "第一组");
        Thread t2 = new Thread(task, "第二组");
        t1.start();
        t2.start();
    }
}
