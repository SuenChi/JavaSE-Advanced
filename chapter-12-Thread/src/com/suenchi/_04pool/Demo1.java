package com.suenchi._04pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**1.创建线程池对象
 *      1.使用接口ExecutorService的实现类ThreadPoolExecutor创建一个线程池对象
 * 2.ExecutorService成员方法
 *      1. void execute(Runnable command)
 *      2. void shutdown()
 * 3.注意 : 本电脑 Runtime.getRuntime().availableProcessors() 返回值为8
 */
public class Demo1 {
    public static void main(String[] args) {
        //(1.1)
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                Runtime.getRuntime().availableProcessors() + 1,  //核心线程数:Cpu密集型任务 核心数+1 / IO密集型任务 核心数 * 2
                Runtime.getRuntime().availableProcessors() + 6, //最大线程数 = 核心线程数 + 临时线程数(不需要显式声明)
                10, //临时线程销毁时间(数值单位)
                TimeUnit.MINUTES, //临时线程销毁时间(时间单位)  只要参数3+参数4才有实际意义
                new ArrayBlockingQueue<>(5),//任务队列BlockingQueue接口的实现类对象 new ArrayBlockingQueue(int capacity) 有界阻塞 / new LinkedBlockingQueue() 无界阻塞
                Executors.defaultThreadFactory(),//线程工厂:当线程池中没有线程的时候线程工厂负责生产线程 Executors.defaultThreadFactory() 返回一个可用的线程工厂对象
                new ThreadPoolExecutor.AbortPolicy() //拒绝策略:当线程都在忙+队列已满的新任务处理方案
        );
        //(2.1)
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("当前线程池中的线程名是 : "+Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        //(2.2)
        pool.shutdown();
    }
}
