package ua.com.vtkachenko.threads.example5;

public class App0 {
    static boolean flag = true;

    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (flag);
            }
        }).start();

        flag = false;

    }
}
