package com.ua.vtkachenko.arraysorting.quicksorting;

import java.util.Arrays;

import static com.ua.vtkachenko.arraysorting.easytask16.BubbleSortOfArray.bubbleSortOfArray;
import static com.ua.vtkachenko.arraysorting.easytask16.BubbleSortOfArray.createRandNumsInArray;
import com.ua.vtkachenko.arraysorting.quicksorting.Quicksort;

public class QuickSortingOfArray {

    public static void main(String[] args) {

        int[] a = new int[10];

        createRandNumsInArray(a);

        System.out.println(Arrays.toString(a));


        long start = System.currentTimeMillis();

        quickSortOfArray(a);

        long finish = System.currentTimeMillis();
        System.out.println(Arrays.toString(a));
        int sec = (int)(finish-start);

        System.out.println("Time of sorting: " + sec/1000 + " sec or " + sec + "ms");

    }

    public static void quickSortOfArray(int[] ar){

        Quicksort q = new Quicksort();
        q.sort(ar); //quicksort

    }
}
