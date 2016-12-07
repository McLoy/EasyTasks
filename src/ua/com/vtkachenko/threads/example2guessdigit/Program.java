package ua.com.vtkachenko.threads.example2guessdigit;

import java.util.Random;

import static java.lang.Thread.sleep;

public class Program {
    public static void main(String[] args) {
        MyThredy mt1 = new MyThredy("M");
        MyThredy mt2 = new MyThredy("L");
        mt1.start();
        mt2.start();

        String name1 = "S";
        int findMe1 = 3;
        int f1 = 0;
        Random r1 = new Random();
        while ((f1 = r1.nextInt(20)) != findMe1) {
            System.out.println(name1 + " = " + f1 + " ?");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
            }
        }
        System.out.println(name1 + " = Bingo!(" + f1 + ")");
    }
}
