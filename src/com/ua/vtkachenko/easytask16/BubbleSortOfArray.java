package com.ua.vtkachenko.easytask16;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortOfArray {

    public static void main(String[] args) {

        int[] a = new int[40000];
        createRandNumsInArray(a);

        System.out.println(Arrays.toString(a));

        long start = System.currentTimeMillis();

        bubbleSortOfArray(a);

        long finish = System.currentTimeMillis();
        System.out.println(Arrays.toString(a));
        int sec = (int)(finish-start);

        System.out.println("Time of sorting: " + sec/1000 + " sec");
    }

    public static void createRandNumsInArray(int[] arr){

        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(arr.length*100);
        }

    }

    public static void bubbleSortOfArray(int[] a){
        int t = 0;
        for (int j = a.length - 1; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                if (a[i] > a[i + 1]) {
                    t = a[i + 1];
                    a[i + 1] = a[i];
                    a[i] = t;
                }
            }
        }
    }
}
