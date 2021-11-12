package com.example.muiltThread;

import java.util.concurrent.*;

public class AQSExtendTest {
    /**
     *
     * await后面的代码要执行都需要条件
     *
     * @throws InterruptedException
     */
    private static void testCountDownLatch() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(2);
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "countDown1");
            try {
                TimeUnit.SECONDS.sleep(2);
                latch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();


        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "countDown2");
            try {
                TimeUnit.SECONDS.sleep(2);
                latch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        latch.await();
        System.out.println(Thread.currentThread().getName() + "countDown3");

    }


    /**
     * 让一组线程到达一个屏障（也可以叫同步点）时被阻塞，直到最后一个线程到达屏障时，
     * 屏障才会开门，所有被屏障拦截的线程才会继续运行
     *
     * await后面的代码要执行都需要条件
     *
     * 用于：多线程计算数据，最后合并计算结果的场景
     * @throws InterruptedException
     */
    private static void testCyclicBarrier() throws InterruptedException {
        CyclicBarrier barrier = new CyclicBarrier(3);

        new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + ": start");
                barrier.await();
                System.out.println(Thread.currentThread().getName() + ": end");
            } catch (Exception e) {
                System.out.println(Thread.currentThread().getName() + ": fail");
            }
        }).start();

        TimeUnit.SECONDS.sleep(1);

        new Thread(() -> {
            try {
                System.out.println(Thread.currentThread().getName() + ": start");
                barrier.await();
                System.out.println(Thread.currentThread().getName() + ": end");
            } catch (Exception e) {
                System.out.println(Thread.currentThread().getName() + ": fail");
            }
        }).start();

        TimeUnit.SECONDS.sleep(1);

        System.out.println(Thread.currentThread().getName() + ": start");
        try {
//            barrier.await();
            System.out.println(Thread.currentThread().getName() + ": end");
        } catch (Exception e) {
            System.out.println(Thread.currentThread().getName() + ": fail");
        }



    }

    /**
     * Semaphore可以用于做流量控制
     */
    private static void testSemaphore(){
        Semaphore semaphore = new Semaphore(3);

        for(int i = 0 ; i < 6; i++){
            new Thread(() -> {
                try {
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + "execute");
                    TimeUnit.SECONDS.sleep(3);
                    semaphore.release();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }

    }

    /**
     * 两个线程交换数据
     */
    private static void testExchanger() {
        Exchanger<String> exchanger = new Exchanger();
        new Thread(() -> {
            try {
                String str1 = "this is thread0";
                exchanger.exchange(str1);
                String str2 = exchanger.exchange("str2");
                System.out.println(Thread.currentThread().getName() + "str1:" + str1);
                System.out.println(Thread.currentThread().getName() + "str2:" + str2);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                String str1 = exchanger.exchange("str1");
                String str2 = "this is thread1";
                System.out.println(Thread.currentThread().getName() + "str1:" + str1);
                System.out.println(Thread.currentThread().getName() + "str2:" + str2);
                exchanger.exchange(str2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }

    private static void testReentrantLock(){

    }

    private static void testWriteReadReentrantLock(){

    }

    private static void testConditional(){

    }


    public static void main(String[]args){
        testSemaphore();
    }

}
