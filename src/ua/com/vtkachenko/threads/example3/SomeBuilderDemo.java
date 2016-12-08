package ua.com.vtkachenko.threads.example3;

import java.util.Hashtable;


public class SomeBuilderDemo {

    public static class SomeBuilder {
        private Hashtable<String, Integer> counters = new Hashtable<String, Integer>();
        public void build() {
            System.out.println("Thread " + Thread.currentThread().getName() + " Build some structure...");
            if (!counters.containsKey(Thread.currentThread().getName()))
                counters.put(Thread.currentThread().getName(), 0);
            counters.put(Thread.currentThread().getName(), counters.get(Thread.currentThread().getName()) + 1);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public int getCount() {
            return counters.get(Thread.currentThread().getName());
        }
    }

    public static class SomeBuilderThread extends Thread {
        private SomeBuilder builder;

        public SomeBuilderThread(SomeBuilder builder) {
            this.builder = builder;
        }

        @Override
        public void run() {
            for (int i = 0; i < Math.random() * 10; i++) {
                builder.build();
            }
            System.out.println("My name is " + getName() + " and I built " + builder.getCount() + " things");
        }
    }

    public static void main(String[] args) {
        SomeBuilder builder = new SomeBuilder();
        Thread thread1 = new SomeBuilderThread(builder);
        Thread thread2 = new SomeBuilderThread(builder);
        try{
            thread1.start();
            thread2.start();
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}