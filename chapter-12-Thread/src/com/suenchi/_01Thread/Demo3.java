package com.suenchi._01Thread;

/**1.创建多线程对象
 *      1.继承Thread类(方式一)
 *          1.定义子类继承java.lang.Thread类
 *          2.重写run方法, 在其中声明当前线程的代码逻辑
 *          3.创建子类对象，调用start()方法启动线程
 *      2.实现Runnable接口(方式二)
 *          1.实现Runnable接口，在run()方法中声明当前线程的代码逻辑，得到线程任务类
 *          2.创建线程任务类对象，以该对象为参数调用Thread有参构造
 *          3.调用Thread对象的start()方法启动线程
 */
public class Demo3 {
    //(1.1.1)
    public static class MyThread extends Thread{
        //(1.1.2)
        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                System.out.println(Thread.currentThread().getName()+"执行第 "+(i+1)+" 次.");
            }
        }
    }

    //(1.2.1)
    public static class MyRunnable implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                System.out.println(Thread.currentThread().getName()+"执行第 "+(i+1)+" 次.");
            }
        }
    }

    public static void main(String[] args) {
        //(1.1.3)
        MyThread t1=new MyThread();
        t1.start();
        //(1.2.2)
        Thread t2 = new Thread(new MyRunnable());
        //(1.2.3)
        t2.start();
    }
}