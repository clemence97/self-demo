package com.example.muiltThread;


import java.util.concurrent.*;

public class BlockQueueTest {

    private static SynchronousQueue synchronousQueue = new SynchronousQueue();
    private static ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(2);
    private static LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
    private static PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
    private static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 3, 1, TimeUnit.SECONDS, new LinkedBlockingDeque(1));



    private static void testSynchronousQueue() throws InterruptedException {
        /** put/take **/
//        threadPoolExecutor.execute(() -> {
//            try {
//                Object take = synchronousQueue.take();
//                System.out.println(take);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        });
//        threadPoolExecutor.execute(() -> {
//            try {
//                synchronousQueue.put("1");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });



        /** offer/take  **/
        threadPoolExecutor.execute(() -> {
            try {
                Object take = synchronousQueue.take();
                System.out.println(take);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        TimeUnit.SECONDS.sleep(1);
        threadPoolExecutor.execute(() -> {
            try {
                boolean offer = synchronousQueue.offer("1");
                System.out.println(offer);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        synchronousQueue.peek();

    }



//    private static void testArrayBlockingQueue(){
//        ArrayBlockingQueue
//    }
//
//    private static void testLinkedBlockingQueue(){
//        LinkedBlockingQueue
//    }
//
//    private static void testPriorityBlockingQueue (){
//        PriorityBlockingQueue
//    }

    public static void main(String []args) throws InterruptedException {
        testSynchronousQueue();
    }


}
