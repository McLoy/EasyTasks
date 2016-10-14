package com.ua.vtkachenko.arraysorting.easytask13;

import java.util.Random;

public class SortingOfArray {

    public static void main(String[] args) {

        int[] arr = new int[10];
        Random rr = new Random();
        //Put random values in array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rr.nextInt(30);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int tt = 0;
        for (int i = arr.length-1; i >= 0  ; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j+1]){
                tt = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tt;
                }
            }
        }

        System.out.println("++++++++++++");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

}
