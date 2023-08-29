package com.suenchi._03communicate;

public class Desk {
    private Integer count;//食物的编号
    private Boolean flag; //true:有食物 false:没有食物

    //放食物(生产者线程可以调用此方法完成食物的存储)
    public synchronized void make() throws InterruptedException {
        if (!flag) { //没有食物进入到if中执行
            Thread.sleep(500);
            count += 1;
            System.out.println(Thread.currentThread().getName() + "做了编号是" + count + "的猪肉大葱包子!");
            flag = true;
            //当做完食物之后无论消费者线程是否处于无限等待状态都进行唤醒
            this.notifyAll();
        } else { //有食物 进入到无限等待
            this.wait();
        }
    }
    //获取食物(消费者线程可以调用此方法完成食物的获取)
    public synchronized void take() throws InterruptedException {
        if (flag) { //有食物进入到if中执行
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName() + "吃了编号是" + count + "的猪肉大葱包子!");
            flag = false;
            //当吃完食物之后无论生产者线程是否处于无限等待状态都进行唤醒
            this.notifyAll();
        } else { //没有食物 进入到无限等待
            this.wait();
        }
    }

    public Desk(Integer count, Boolean flag) {
        this.count = count;
        this.flag = flag;
    }
}