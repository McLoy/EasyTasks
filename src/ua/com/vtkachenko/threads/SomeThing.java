package ua.com.vtkachenko.threads;

import static java.lang.Thread.sleep;

public class SomeThing  implements  Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5 ; i++) {
            System.out.println("Привет из побочного потока! - " + i);
            try{
                sleep(1000);
            }catch(InterruptedException e){}
        }
    }
}

