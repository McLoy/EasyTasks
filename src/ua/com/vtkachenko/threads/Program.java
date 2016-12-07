package ua.com.vtkachenko.threads;

import static java.lang.Thread.sleep;

public class Program {
    static SomeThing someThing;

    public static void main(String[] args) {
        someThing = new SomeThing();
        Thread myThread = new Thread(someThing);
        myThread.start();
        for (int i = 0; i < 10; i++) {
            if (! myThread.isAlive()){break;}
            System.out.println("Основной поток - " + i);
            try{
                sleep(1000);
            }catch(InterruptedException e){}
        }
        System.out.println("Главный поток завершен...");
    }
}
