package com.suenchi._99homework;

/**
 * 基础题1:
 * 本案例模拟一个简单的银行系统,使用两个不同的线程向同一个账户存钱。
 * 账户的初始余额是1000元，两个线程每次存储100元,分别各存储1000元，不允许出现错误数据。
 */
public class Demo1 {
    public static class Account {
        private Integer money;

        public Account(Integer money) {
            this.money = money;
        }

        public synchronized void save(Integer money) {
            System.out.print(Thread.currentThread().getName() + "往账户中存钱100元...");
            this.money += money;
            System.out.println("\t成功存入100元, 账户余额 : " + this.money);
        }

        public Integer getMoney() {
            return money;
        }

        public void setMoney(Integer money) {
            this.money = money;
        }
    }

    public static class MyRunnable implements Runnable {
        private Account account;    //线程任务的共享资源
        private Integer cnt;    //存钱次数

        public MyRunnable(Account account,Integer cnt) {
            this.account = account;
            this.cnt=cnt;
        }

        @Override
        public void run() {
            for (int i = 0; i < cnt; i++) {
                account.save(100);

            }
        }
    }

    public static void main(String[] args) {
        Account account=new Account(1000);
        MyRunnable task = new MyRunnable(account, 10);
        Thread t1 = new Thread(task, "小王");
        Thread t2 = new Thread(task, "小李");
        t1.start();
        t2.start();
    }
}