package com.suenchi._02synchronized;

/**1.如何实现线程同步
 *      1.同步代码块(方式一)
 *      2.同步方法(方式二) √
 *      3.Lock锁(方式三)
 */
public class Demo2 {

    public static class Account {

        private Integer money;  //账户余额

        public Account(Integer money) {
            this.money = money;
        }

        //(1.2)
        public synchronized void takeMoney(Integer money) throws InterruptedException {
            System.out.println(Thread.currentThread().getName() + "准备取钱,取钱金额是 : " + money + " 元");
            if (this.money >= money) {
                System.out.println(Thread.currentThread().getName() + "开始取钱,请稍等,点钞中(哗啦啦啦啦)");
                Thread.sleep(1000);
                this.money -= money;
                System.out.println(Thread.currentThread().getName() + "取钱完成,请取钞,剩余余额为 : " + this.money + " 元");
            } else {
                System.out.println(Thread.currentThread().getName() + "取钱失败,余额不足,余额为 : " + this.money + " 元");
            }
        }
    }

    public static class MyRunnable implements Runnable{
        //将共享资源account作为线程类的成员变量
        private Account account;

        public MyRunnable(Account account) {
            this.account = account;
        }

        @Override
        public void run() {
            try {
                account.takeMoney(100000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        //创建共享资源(账户对象)
        Account account = new Account(100000);

        //创建线程任务对象
        MyRunnable myRunnable = new MyRunnable(account);

        //创建多个线程, 完成同一个线程任务对象
        Thread t1 = new Thread(myRunnable, "小明");  //"小明"是线程名
        Thread t2 = new Thread(myRunnable, "小红");  //"小红"是线程名

        t1.start();
        t2.start();
    }
}