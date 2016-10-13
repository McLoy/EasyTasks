package com.ua.vtkachenko.easytask14;

import java.util.Random;

public class FindNumberInArray {

    public static void main(String[] args) {

        int[] a = new int[5];

        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(a.length * 10);
            //System.out.println(a[i]);
        }


        long timeStart = System.currentTimeMillis();

        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[i] < a[j]) {
                    int t = a[j];
                    a[j] = a[i];
                    a[i] = t;
                }

            }
        }

        long timeFinish = System.currentTimeMillis();

        //System.out.println("++++++++");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }

        int mseconds = (int) (timeFinish - timeStart);
        System.out.println("Time execution: " + mseconds + "ms or ~" + mseconds / 1000 + "s");


        int searchingNum = r.nextInt(a.length*10);
        System.out.println("We searching a position of number " + searchingNum);

        int index;

        if (searchingNum == a[0])
            index = 0;
        else if (searchingNum == a[a.length - 1])
            index = a.length - 1;


    }

}
