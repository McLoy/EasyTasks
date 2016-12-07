package ua.com.vtkachenko.threads.example2guessdigit;

import java.util.Random;

public class MyThredy extends Thread {

    private String name;

    public MyThredy(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int findMeM = 7;
        int findMeL = 7;
        int f;
        Random r = new Random();
        if (name.equals("Рядовой")) {
            f = 0;
            while ((f = r.nextInt(20)) != findMeM) {
                System.out.println(name + " = может это " + f + " ?");
//                try {
//                    sleep(300);
//                } catch (InterruptedException e) {
//                    System.out.println("Exception of first thread");
//                }
            }
            System.out.println(name + " = Bingo!(" + f + ")");
        }

        if (name.equals("Лейтенант")) {
            f = 0;
            while ((f = r.nextInt(20)) != findMeL) {
                System.out.println(name + " = может это " + f + " ?");
//                try {
//                    sleep(300);
//                } catch (InterruptedException e) {
//                    System.out.println("Exception of second thread");
//                }
            }
            System.out.println(name + " = Bingo!(" + f + ")");
        }
    }
}
