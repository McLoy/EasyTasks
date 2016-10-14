package com.ua.vtkachenko.easytask17;

import java.util.Arrays;
import java.util.Random;

public class CompareTimeOfSorting {

    public static void main(String[] args) {


        int[] a = new int[3000];

        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(1000000);
        }
        System.out.println("+++Bubble sorting+++");
        System.out.println(Arrays.toString(a));

        //int[] b = (int[])a.clone();
        int[] b = a.clone();
        //System.arraycopy(a, 0, b, 0, a.length);
        //int[] c = a.clone();

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
        int msec = (int) (finish - start);
        System.out.println("Time of sorting: " + msec / 1000 + " sec" + " or " + msec + "msec");

        System.out.println("+++Simple sorting+++");
        System.out.println(Arrays.toString(b));
        start = System.currentTimeMillis();
        //Simple Sorting
        for (int i = 0; i < b.length - 1;) {
            if (b[i] > b[i + 1]){
                int t = b[i + 1];
                b[i + 1] = b[i];
                b[i] = t;
                i = 0;

            } else i++;
            if (i == b.length - 1) break;
        }
        finish = System.currentTimeMillis();
        System.out.println(Arrays.toString(b));
        msec = (int) (finish - start);
        System.out.println("Time of sorting: " + msec / 1000 + " sec" + " or " + msec + "msec");
    }
}
