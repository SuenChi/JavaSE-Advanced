package com.suenchi._99homework;

/**
 * 基础题2:
 * 小明上课时打瞌睡,被老师发现,老师惩罚他抄写100遍单词"HelloWorld",小明就找到了小王帮助他一起抄写单词。
 * 请使用多线程模拟小明和小王一起完成抄单词的惩罚。
 */
public class Demo2 {
    public static class Punishment {
        private Integer cnt;

        public synchronized void copyOut() {
            System.out.println(Thread.currentThread().getName() + "抄写1遍, 还剩" + cnt + "遍");
            cnt--;
        }

        public Punishment(Integer cnt) {
            this.cnt = cnt;
        }

        public Integer getCnt() {
            return cnt;
        }

        public void setCnt(Integer cnt) {
            this.cnt = cnt;
        }
    }

    public static class MyRunnable implements Runnable {

        private Punishment punishment;

        public MyRunnable(Punishment punishment) {
            this.punishment = punishment;
        }

        @Override
        public void run() {
            int cnt = 0;
            while (true) {
                synchronized (this) {
                    if (punishment.getCnt() > 0) {
                        punishment.copyOut();
                        cnt++;
                    } else {
                        break;
                    }
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + "抄写了" + cnt + "次.");
        }
    }

    public static void main(String[] args) {
        Punishment punishment=new Punishment(100);
        MyRunnable task = new MyRunnable(punishment);
        Thread t1 = new Thread(task, "小明线程");
        Thread t2 = new Thread(task, "小王线程");
        t1.start();
        t2.start();

    }
}