package com.ua.vtkachenko.easytask14;

import java.util.Arrays;
import java.util.Random;
// You must find position of number in sorted array
public class FindNumberInArray {

    public static void main(String[] args) {

        int[] a = new int[100000000];

        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            //a[i] = r.nextInt(a.length);
            a[i] = i+1;
            //System.out.println(a[i]);
        }

        //Sorting
//        for (int i = a.length - 1; i >= 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (a[i] < a[j]) {
//                    int t = a[j];
//                    a[j] = a[i];
//                    a[i] = t;
//                }
//
//            }
//        }

        int myNum =  r.nextInt(a.length);

        int findedIndex = -1;

        int si = 0;
        int fi = a.length - 1;
        int side = -1;

        int count = 0;

        long timeStart = System.currentTimeMillis();

        while (fi - si != 0) {

            count += 1;
            if (myNum == a[si])
                findedIndex = si;

            if (myNum == a[fi])
                findedIndex = fi;

            if (findedIndex == -1) {
                side = (si + fi)/2;
                if (a[side] == myNum) {
                    findedIndex = side;
                    break;
                } else if (a[side] > myNum) {
                    fi = side - 1;
                } else if (a[side] < myNum) {
                    si = side + 1;
                }
            } else break;

        }

        long timeFinish = System.currentTimeMillis();
        int mseconds = (int) (timeFinish - timeStart);

        if (a.length < 60)
            System.out.println(Arrays.toString(a));

        if (findedIndex == -2)
            System.out.println("Number " + myNum + " is out of array");
        else if (findedIndex != -1){
            System.out.println("Position of " + myNum + " in array is " + (findedIndex + 1));
            System.out.println("Value is find into " + count + " steps of loop");
            System.out.println("Time execution of search: " + mseconds + "ms or ~" + mseconds / 1000 + "s");
        } else System.out.println("We can't find index of " + myNum);
    }

}
