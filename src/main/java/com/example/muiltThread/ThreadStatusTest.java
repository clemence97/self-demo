package com.example.muiltThread;


import javax.sound.midi.Soundbank;
import java.util.concurrent.*;
import java.util.concurrent.locks.LockSupport;

public class ThreadStatusTest {

    private static final String str = "Lock";


    /**
     * wait和park对中断的区别
     * wait: 会产生中断异常 isInterrupt是false
     * park: 响应中断（作用和unpark相同） isInterrupt是true
     *
     * @throws InterruptedException
     */
    private static void testInterrupt() throws InterruptedException {


        Thread waitThread = new Thread(()->{
            synchronized (str){
                System.out.println("wait 对中断的测试1");
                try {
                    str.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("wait 对中断的测试2");
            }

        });

        Thread competeThread = new Thread(()->{
            synchronized (str){
                System.out.println("competeThread 获取到锁");
                System.out.println("waitThread interrupt: " + waitThread.isInterrupted());
//                str.notify();
            }

        });


        Thread parkThread = new Thread(() ->{
            System.out.println("park 对中断的测试1");
            LockSupport.park();
            System.out.println("park 对中断的测试2");
        });

        Thread interruptWaitThread = new Thread(() -> {
            waitThread.interrupt();
        });


        Thread interruptParkThread = new Thread(() -> {
            parkThread.interrupt();
            System.out.println("parkThread interrupt: " + parkThread.isInterrupted());
        });


        waitThread.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("waitThread state1: " + waitThread.getState());
        competeThread.start();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("waitThread state2: " + waitThread.getState());
        interruptWaitThread.start();


        parkThread.start();
        interruptParkThread.start();
        TimeUnit.SECONDS.sleep(1);


    }


    static class Task implements Runnable{
        private Thread currentThread;

        Task(){}

        @Override
        public void run() {
            try {
                TimeUnit.SECONDS.sleep(1);
                this.currentThread = Thread.currentThread();
                System.out.println(Thread.currentThread().getName()+"execute");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * keepAliveTime： coreSize < poolSize 空闲线程超过keepAliveTime时间后仍是空闲则terminated
     *
     * 没有要处理的任务时，线程池的线程数量始终和coreSize相同
     * @throws Exception
     */
    private static void testThreadPoolExecutor() throws Exception{
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 1, TimeUnit.SECONDS, new LinkedBlockingDeque(1));


        Task task1 = new Task();
        Future<String> submit1 = threadPoolExecutor.submit(task1, Thread.currentThread().getName());
//        TimeUnit.SECONDS.sleep(1);


        Task task2 = new Task();
        Future<String> submit2 = threadPoolExecutor.submit(task2, Thread.currentThread().getName());
//        TimeUnit.SECONDS.sleep(1);

        Task task3 = new Task();
        Future<String> submit3 = threadPoolExecutor.submit(task3, Thread.currentThread().getName());
//        TimeUnit.SECONDS.sleep(1);

        Task task4 = new Task();
        Future<String> submit4 = threadPoolExecutor.submit(task4, Thread.currentThread().getName());
//        TimeUnit.SECONDS.sleep(1);

        TimeUnit.SECONDS.sleep(10);
        System.out.println("poolSize:" + threadPoolExecutor.getPoolSize());
        printState(task1.currentThread);
        printState(task2.currentThread);
        printState(task3.currentThread);
        printState(task4.currentThread);

    }

    private static void printState(Thread thread){
        String task1 = thread.getName();
        Thread.State state = thread.getState();
        System.out.println(task1 + ":" + state);
    }




    private static void testExecutor(){
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Future<?> submit = executorService.submit(() -> {
            System.out.println("777");
        });
    }



    public static void main(String []args) throws Exception {
//        testInterrupt();
        testThreadPoolExecutor();
    }


}
