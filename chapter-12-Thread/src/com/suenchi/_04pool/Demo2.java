package com.suenchi._04pool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**1.新任务拒绝策略
 *      1.ThreadPoolExecutor.AbortPolicy()
 *      2.ThreadPoolExecutor.DiscardPolicy()
 *      3.ThreadPoolExecutor.DiscardOldestPolicy()
 *      4.ThreadPoolExecutor.CallerRunsPolicy()
 */
public class Demo2 {
    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(
                5, 10, 10, TimeUnit.MINUTES, new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),
//                new ThreadPoolExecutor.AbortPolicy()  //(1.1)
//                new ThreadPoolExecutor.DiscardPolicy()    //(1.2)
//                new ThreadPoolExecutor.DiscardOldestPolicy()  //(1.3)
                new ThreadPoolExecutor.CallerRunsPolicy()   //(1.4)
        );
        for (int i=0;i<50;i++) {
            pool.execute(() -> {
                System.out.println("当前线程池中的线程名是 : "+Thread.currentThread().getName());
            });
        }
        pool.shutdown();
    }
}
