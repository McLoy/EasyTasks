package ua.com.vtkachenko.threads.examplespeed64long;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FalseSharing {

//    volatile static long value0 = 0;
//    volatile static long value1 = 0;
//    volatile static long value2 = 0;
//    volatile static long value3 = 0;
//    volatile static long value4 = 0;
//    volatile static long value5 = 0;
//    volatile static long value6 = 0;
//    volatile static long value7 = 0;
//    volatile static long value8 = 0;
//
//    public static void main(String[] args) throws InterruptedException{
//        ExecutorService pool = Executors.newFixedThreadPool(2);
//        final CountDownLatch latch0 = new CountDownLatch(2);
//        final CountDownLatch latch1 = new CountDownLatch(1);
//        final CountDownLatch latch2 = new CountDownLatch(2);
//        pool.submit(new Callable<Void>() {
//            public Void call() throws Exception {
//                latch0.countDown();
//                latch1.await();
//                long t0 = System.nanoTime();
//                for (int k = 0; k < 100; k++) {
//                    value0 = value0 * k;
//                }
//                long t1 = System.nanoTime();
//                System.out.println((t1 - t0) / 1000000 + "ms");
//                latch2.countDown();
//                return null;
//            }
//        });
//        pool.submit(new Callable<Void>() {
//            public Void call() throws Exception {
//                latch0.countDown();
//                latch1.await();
//                long t0 = System.nanoTime();
//                for (int k = 0; k < 100; k++) {
//                    value8 = value8 * k;
//                }
//                long t1 = System.nanoTime();
//                System.out.println((t1 - t0) / 1000000 + "ms");
//                latch2.countDown();
//                return null;
//            }
//        });
//
//    }
}
