package com.suenchi._01Thread;

/**1.Thread类构造方法
 *      1.Thread(Runnable target)
 *      2.Thread(Runnable target, String name)
 */
public class Demo1 {
    public static class MyRunnable implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                System.out.println(Thread.currentThread().getName()+" 执行第 " + (i + 1) + " 次.");
            }
        }
    }

    public static void main(String[] args) {
        //(1.1)
        Thread t1 = new Thread(new MyRunnable());
        t1.start();

        //(1.2)
        Thread t2 = new Thread(new MyRunnable(),"线程t2");
        t2.start();

    }
}