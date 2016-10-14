package com.ua.vtkachenko.easytask16;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortOfArray {

    public static void main(String[] args) {

        int[] a = new int[40000];

        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(1000000);
        }

        System.out.println(Arrays.toString(a));

        long start = System.currentTimeMillis();


        //Bubble Sorting
        for (int j = a.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (a[i] > a[i + 1]) {
                    int t = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = t;
                }
            }
        }
        long finish = System.currentTimeMillis();
        System.out.println(Arrays.toString(a));
        int sec = (int)(finish-start);

        System.out.println("Time of sorting: " + sec/1000 + " sec");
    }
}
