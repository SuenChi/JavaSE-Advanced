package com.suenchi._03communicate;

//生产者消费者模型
public class Demo {
    public static void main(String[] args) {
        //食物编号为0 默认没有食物
        Desk desk = new Desk(0, false);

        //创建生产者与消费者线程
        ConsumerThread consumerThread = new ConsumerThread(desk);
        consumerThread.setName("张二狗");
        ProducerThread producerThread = new ProducerThread(desk);
        producerThread.setName("刘铁柱");

        consumerThread.start();
        producerThread.start();
    }
}