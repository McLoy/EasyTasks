package com.ua.vtkachenko.arraysorting.easytask19;

import java.util.Arrays;

import static com.ua.vtkachenko.arraysorting.easytask16.BubbleSortOfArray.createRandNumsInArray;

public class EvenAndUnevenSort {

    public static void main(String[] args) {

        int[] a = new int[10];

        createRandNumsInArray(a);

        System.out.println(Arrays.toString(a));

        //Even and uneven Sorting
       evenAndUnevenSortOfArray(a);

        System.out.println(Arrays.toString(a));
    }

    public static void evenAndUnevenSortOfArray(int[] arr){

        int count = -1;
        int cc = 0;
        int t = 0;

        int restEven = arr.length%2;

        while (count != 0){
            count = 0;
            cc += 1;
        for (int i = 0; i < arr.length - restEven; i = i + 2) {
            if (arr[i] > arr[i + 1]) {
                t = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = t;
                count = 1;
            }
        }
        for (int i = 1; i < arr.length - 1; i = i + 2) {
            if (arr[i] > arr[i + 1]) {
                t = arr[i + 1];
                arr[i + 1] = arr[i];
                arr[i] = t;
                count = 1;
            }
        }
        }
    }
}


