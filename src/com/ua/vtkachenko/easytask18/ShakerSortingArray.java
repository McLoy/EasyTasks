package com.ua.vtkachenko.easytask18;

import java.util.Arrays;
import java.util.Random;

public class ShakerSortingArray {

    public static void main(String[] args) {

        int[] a = new int[9];

        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(1000);
        }

        System.out.println(Arrays.toString(a));

        long start = System.currentTimeMillis();


        //Shaker Sorting
        for (int j = a.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (a[i] > a[i + 1]) {
                    int t = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = t;
                }
            }
            for (int k = a.length; k > j; k--) {
                if (a[k] < a[k + 1]) {
                    int t = a[k + 1];
                    a[k + 1] = a[k];
                    a[k] = t;
                }
            }
        }
        long finish = System.currentTimeMillis();
        System.out.println(Arrays.toString(a));
        int sec = (int)(finish-start);

        System.out.println("Time of sorting: " + sec/1000 + " sec");
    }
}
