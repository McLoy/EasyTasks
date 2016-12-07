package ua.com.vtkachenko.threads.example2guessdigit;

import java.util.Random;

public class MyThredy extends Thread {

    private String name;

    public MyThredy(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int findMeM = 2;
        int findMeL = 8;
        int f;
        Random r = new Random();
        if (name.equals("M")) {
            f = 0;
            while ((f = r.nextInt(20)) != findMeM) {
                System.out.println(name + " = " + f + " ?");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                }
            }
            System.out.println(name + " = Bingo!(" + f + ")");
        }

        if (name.equals("L")) {
            f = 0;
            while ((f = r.nextInt(20)) != findMeL) {
                System.out.println(name + " = " + f + " ?");
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                }
            }
            System.out.println(name + " = Bingo!(" + f + ")");
        }
    }
}
