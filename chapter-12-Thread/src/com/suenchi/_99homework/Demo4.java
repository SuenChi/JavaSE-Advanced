package com.suenchi._99homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Random;
import java.util.function.Consumer;

/**
 * 基础题4:
 * 某公司组织年会,会议入场时有两个入口,在入场时每位员工都能获取一张双色球彩票,
 * 假设公司有100个员工,利用多线程模拟年会入场过程,并分别统计每个入口入场的人数,以及每个员工拿到的彩票的号码。
 * 双色球球规则:
 *      双色球: 由6个红色球号码和1个蓝色球号码组成。
 *      红色球: 从1--33中选择。
 *      蓝色球: 从1--16中选择。
 *      红球从小到大的顺序,不可重复,蓝球和红球可以重复
 * 分析 : 一个入口代表一个线程
 */
public class Demo4 {
    public static class Employee{
        private Integer cnt;
        private Random r=new Random();

        public Employee(Integer cnt) {
            this.cnt = cnt;
        }

        public Integer getCnt() {
            return cnt;
        }

        public void setCnt(Integer cnt) {
            this.cnt = cnt;
        }

        public ArrayList<Integer> getBall(){
            HashSet<Integer> hashSet=new HashSet<>(6);
            while(hashSet.size()<6){
                int i = r.nextInt(33) + 1;
                hashSet.add(i);
            }
            ArrayList<Integer> arrayList=new ArrayList<>(7);
            hashSet.forEach(new Consumer<Integer>() {
                @Override
                public void accept(Integer integer) {
                    arrayList.add(integer);
                }
            });
            //对红球排序
            arrayList.sort(Comparator.comparingInt(o -> o));
            //生成蓝球, 并加入arrayList
            arrayList.add(r.nextInt(16)+1);
            return arrayList;
        }
    }

    public static class MyRunnable implements Runnable{
        private Employee e;

        public MyRunnable(Employee e) {
            this.e = e;
        }

        @Override
        public void run() {
            while(true){
                synchronized (this){
                    if(e.getCnt()>0){
                        ArrayList<Integer> ball = e.getBall();
                        System.out.println("编号为"+e.getCnt() +"的员工从"+ Thread.currentThread().getName()+"入场, 拿到的" +
                                "双色球彩票号码为 : "+ball);
                        e.setCnt(e.getCnt()-1);
                    }else {
                        break;
                    }
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    public static void main(String[] args) {
        Employee e=new Employee(100);
        MyRunnable task = new MyRunnable(e);
        Thread t1 = new Thread(task, "前门");
        Thread t2 = new Thread(task, "后**门");
        t1.start();
        t2.start();
    }
}