package com.ua.vtkachenko.easytask18;

import java.util.Arrays;
import java.util.Random;

public class ShakerSortingArray {

    public static void main(String[] args) {

        int[] a = new int[50000];

        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(a.length*10);
        }

        System.out.println(Arrays.toString(a));

        long start = System.currentTimeMillis();


        //Shaker Sorting
        int z = 0;
        int t = 0;
        for (int j = a.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (a[i] > a[i + 1]) {
                    t = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = t;
                }
            }
            for (int k = j - 1; k >= a.length - j; k--) {
                if (a[k] < a[k - 1]) {
                    t = a[k - 1];
                    a[k - 1] = a[k];
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
