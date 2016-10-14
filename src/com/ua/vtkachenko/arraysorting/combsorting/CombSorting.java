package com.ua.vtkachenko.arraysorting.combsorting;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

import static com.ua.vtkachenko.arraysorting.easytask16.BubbleSortOfArray.bubbleSortOfArray;
import static com.ua.vtkachenko.arraysorting.easytask16.BubbleSortOfArray.createRandNumsInArray;

public class CombSorting {

    public static void main(String[] args) {

        int[] a = new int[10];

        createRandNumsInArray(a);

        System.out.println(Arrays.toString(a));


        long start = System.currentTimeMillis();

        combSortOfArray(a);

        long finish = System.currentTimeMillis();
        System.out.println(Arrays.toString(a));
        int sec = (int)(finish-start);

        System.out.println("Time of sorting: " + sec/1000 + " sec or " + sec + "ms");

    }

    public static void combSortOfArray(int[] arr){

        double factorDecrease = 1.247;
        int t = 0;
        int step = 0;

        while (step != 1) {

            if (step == 0)
                step = (int) Math.round(arr.length/factorDecrease);

            for (int i = 0; i < arr.length - step; i++) {
                if (arr[i] > arr[i + step]) {
                    t = arr[i + step];
                    arr[i + step] = arr[i];
                    arr[i] = t;
                }
            }
            if (step/factorDecrease < 2)
                step = 1;
            else
                step = (int) Math.round(step/factorDecrease);
        }

        bubbleSortOfArray(arr);
    }
}
