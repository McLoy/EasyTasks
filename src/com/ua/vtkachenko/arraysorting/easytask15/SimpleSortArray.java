package com.ua.vtkachenko.arraysorting.easytask15;

import java.util.Arrays;
import java.util.Random;

public class SimpleSortArray {

    public static void main(String[] args) {

        int[] a = new int[30];

        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
        }

        System.out.println(Arrays.toString(a));

        //Simple Sorting
        for (int i = 0; i < a.length - 1;) {
            if (a[i] > a[i + 1]){
                int t = a[i + 1];
                a[i + 1] = a[i];
                a[i] = t;
                i = 0;

            } else i++;
            if (i == a.length - 1) break;
        }

        System.out.println(Arrays.toString(a));
    }
}
