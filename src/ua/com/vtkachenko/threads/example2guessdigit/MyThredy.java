package ua.com.vtkachenko.threads.example2guessdigit;

import java.util.Random;

public class MyThredy extends Thread {

    private String name;

    public MyThredy(String name) {
        this.name = name;
    }

    @Override
    public void run() {
//        gate.await();
        int findMe = 7;
        int f;
        int sleepTime = 500;
        Random r = new Random();
        if (name.equals("Рядовой")) {
            f = 0;
            while ((f = r.nextInt(20)) != findMe) {
                System.out.println(name + " = может это " + f + " ?");
                try {
                    sleep(sleepTime);
                } catch (InterruptedException e) {
                    System.out.println("Exception of first thread");
                }
            }
            System.out.println(name + " = Bingo!(" + f + ")");
        }

        if (name.equals("Лейтенант")) {
            f = 0;
            while ((f = r.nextInt(20)) != findMe) {
                System.out.println(name + " = может это " + f + " ?");
                try {
                    sleep(sleepTime);
                } catch (InterruptedException e) {
                    System.out.println("Exception of second thread");
                }
            }
            System.out.println(name + " = Bingo!(" + f + ")");
        }


        if (name.equals("Командир")) {
            f = 0;
            while ((f = r.nextInt(20)) != findMe) {
                System.out.println(name + " = может это " + f + " ?");
                try {
                    sleep(sleepTime);
                } catch (InterruptedException e) {
                    System.out.println("Exception of third thread");
                }
            }
            System.out.println(name + " = Bingo!(" + f + ")");
        }
    }
}
