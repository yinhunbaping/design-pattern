package org.example.thread.threadLocal;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ThreadLocal数据污染
 */
public class ThreadLocalDemo {
    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void main(String[] args) {

        // 创建固定线程大小为2的线程池
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2);

        // 线程1执行任务
        fixedThreadPool.execute(() -> {
            threadLocal.set("task 1");
            System.out.println(Thread.currentThread().getName() + ":" + threadLocal.get());

            // 模拟业务逻辑
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });

        // 线程2执行任务
        fixedThreadPool.execute(() -> {
            threadLocal.set("task 2");
            System.out.println(Thread.currentThread().getName() + ":" + threadLocal.get());

            // 模拟业务逻辑
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });

        // 线程3执行任务, 因为只有两个线程，这里会触发线程池的线程复用
        fixedThreadPool.execute(() -> {
            System.out.println(Thread.currentThread().getName() + ":" + threadLocal.get());
            threadLocal.remove();
        });
    }
}
