package ua.com.vtkachenko.threads.example2guessdigit;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

import static java.lang.Thread.sleep;

public class Program {
    public static void main(String[] args) throws InterruptedException {

        int findMe1 = 7;
        System.out.println("Угадываем число " + findMe1);
        MyThredy mt1 = new MyThredy("Лейтенант");
        MyThredy mt2 = new MyThredy("Рядовой");
        MyThredy mt3 = new MyThredy("Командир");
        mt1.start();
        mt2.start();
        mt3.start();

        String name1 = "Прапор";
        int f1 = 0;
        Random r1 = new Random();
        while ((f1 = r1.nextInt(20)) != findMe1) {
            System.out.println(name1 + " = может это " + f1 + " ?");
            try {
                sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Exception of main flow");
            }
        }
        System.out.println(name1 + " = Bingo!(" + f1 + ")");
    }
}
