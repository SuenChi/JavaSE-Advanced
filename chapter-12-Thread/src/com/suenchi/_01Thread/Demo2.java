package com.suenchi._01Thread;

/**1.Thread类成员方法
 *      1. String getName()
 *      2. void setName(String name)
 *      3. static Thread currentThread()
 *      4. static void sleep(long time)
 */
public class Demo2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 20; i++) {
                    //(1.1),(1.3)
                    System.out.println(Thread.currentThread().getName() + " 调用第 " + i + " 次");
                }
            }
        });
        //(1.2)
        t1.setName("匿名内部类创建的线程");
        t1.start();

        Thread t2 = new Thread(new MyRunnable(), "Runnable接口实现类创建的线程");
        t2.start();

    }
    public static class MyRunnable implements Runnable{
        @Override
        public void run() {
            for (int i = 1; i <= 20; i++) {
                try {
                    //(1.4)
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //(1.1),(1.3)
                System.out.println(Thread.currentThread().getName() + " 调用第 " + i + " 次");
            }
        }
    }
}
