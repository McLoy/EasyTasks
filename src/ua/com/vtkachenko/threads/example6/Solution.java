package ua.com.vtkachenko.threads.example6;

import java.net.Socket;

public class Solution {

    public static void main(String[] args) {

        Thread first = new Thread() {
            @Override
            public void run() {
                System.out.println(currentThread().getName() + "start");
                for (int i = 0; i < Math.random()*100_000_000_0; i++) {
//                    System.out.println(currentThread().getName());
                }
                System.out.println(currentThread().getName() + "finish");
            }
        };
        first.start();

        Thread second = new Thread() {
            @Override
            public void run() {
                System.out.println(currentThread().getName() + "start");
                for (int i = 0; i < Math.random()*100_000_000_0; i++) {
//                    System.out.println(currentThread().getName());
                }
                System.out.println(currentThread().getName() + "finish");
            }
        };
        second.start();
    }
}
