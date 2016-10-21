package ua.com.vtkachenko.arraysorting.easytask13;

import java.util.Random;

public class Sort {

    public static void main(String[] args) {

        int[] a = new int[50000];

        Random r = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(a.length*10);
            //System.out.println(a[i]);
        }


        long timeStart = System.currentTimeMillis();

        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[i] < a[j]){
                    int t = a[j];
                    a[j] = a[i];
                    a[i] = t;
                }

            }
        }

        long timeFinish = System.currentTimeMillis();

        //System.out.println("++++++++");
        for (int i = 0; i < 20; i++) {
            System.out.println(a[i]);
        }

        int mseconds = (int)(timeFinish - timeStart);
        System.out.println("Time execution: " + mseconds + "ms or ~" + mseconds/1000 + "s" );

    }
}
