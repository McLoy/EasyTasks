package com.ua.vtkachenko.easytask13;

import java.util.Random;

public class Sort {

    public static void main(String[] args) {

        int[] a = new int[10];

        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(1000);
            System.out.println(a[i]);
        }

        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[i] < a[j]){
                    int t = a[j];
                    a[j] = a[i];
                    a[i] = t;
                }

            }
        }
        System.out.println("++++++++");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
