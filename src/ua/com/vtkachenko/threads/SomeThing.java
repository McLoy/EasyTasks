package ua.com.vtkachenko.threads;

public class SomeThing  implements  Runnable{

    @Override
    public void run() {
        System.out.println("Привет из побочного потока!");
    }
}

