package com.ua.vtkachenko.arraysorting.easytask18;

import java.util.Arrays;

import static com.ua.vtkachenko.arraysorting.easytask16.BubbleSortOfArray.createRandNumsInArray;

public class ShakerSortingArray {

    public static void main(String[] args) {

        int[] a = new int[50000];


        createRandNumsInArray(a);

        System.out.println(Arrays.toString(a));

        long start = System.currentTimeMillis();

       shakerSortOfArray(a);

        long finish = System.currentTimeMillis();
        System.out.println(Arrays.toString(a));
        int sec = (int)(finish-start);

        System.out.println("Time of sorting: " + sec/1000 + " sec");
    }

    public static void shakerSortOfArray(int[] a){
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
    }
}
