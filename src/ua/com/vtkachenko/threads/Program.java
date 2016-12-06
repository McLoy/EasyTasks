package ua.com.vtkachenko.threads;

public class Program {
    static SomeThing someThing;

    public static void main(String[] args) {
        someThing = new SomeThing();
        Thread myThread = new Thread(someThing);
        myThread.start();
        System.out.println("Главный поток завершен...");
    }
}
