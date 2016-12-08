package ua.com.vtkachenko.threads.example4;

public class Program {

    private static Integer count = 0;

    static class MyThread extends Thread{

        @Override
        public void run() {
            count = count + "Hello".length();
            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

        System.out.println("Start");
        mt1.start();
        mt2.start();
        for (int h = 0; h < 5; h++) {
            for (int j = 0; j < 1000000000; j++) {
                for (int i = 0; i < 1000000000; i++) {
                }
            }
        }
        if (! mt1.isAlive() & ! mt2.isAlive()){
            System.out.println(count);
        }
        System.out.println("End");
    }
}
