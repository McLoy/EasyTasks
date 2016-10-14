package com.ua.vtkachenko.easytask17;

import static com.ua.vtkachenko.easytask16.BubbleSortOfArray.bubbleSortOfArray;
import static com.ua.vtkachenko.easytask16.BubbleSortOfArray.createRandNumsInArray;
import static com.ua.vtkachenko.easytask18.ShakerSortingArray.shakerSortOfArray;
import static com.ua.vtkachenko.easytask19.EvenAndUnevenSort.evenAndUnevenSortOfArray;

public class CompareTimeOfSorting {

    public static void main(String[] args) {

        int t = 0;

        int averageTimeBubble = 0;
        int averageTimeShaker = 0;
        int averageTimeEvenUneven = 0;

        int totalTimeBubble = 0;
        int totalTimeShaker = 0;
        int totalTimeEvenUneven = 0;

        int countOfIterations = 100;

        for (int i = 0; i < countOfIterations; i++) {

            int[] aArr = new int[5000];
            createRandNumsInArray(aArr);

            int[] bArr = aArr.clone();
            int[] cArr = aArr.clone();
            int[] dArr = aArr.clone();

//            System.out.println("+++Bubble sorting+++");
//            System.out.println(Arrays.toString(cArr));

            long start = System.currentTimeMillis();

            bubbleSortOfArray(cArr);

            long finish = System.currentTimeMillis();
//            System.out.println(Arrays.toString(cArr));
            int msec = (int) (finish - start);
//            System.out.println("Time of sorting: " + msec / 1000 + " sec" + " or " + msec + "msec");
            totalTimeBubble += msec;

//            System.out.println("+++Shaker sorting+++");
//            System.out.println(Arrays.toString(bArr));

            start = System.currentTimeMillis();

            shakerSortOfArray(bArr);

            finish = System.currentTimeMillis();
//            System.out.println(Arrays.toString(bArr));
            msec = (int) (finish - start);
//            System.out.println("Time of sorting: " + msec / 1000 + " sec" + " or " + msec + "msec");
            totalTimeShaker += msec;
//            System.out.println(i);

            start = System.currentTimeMillis();
            evenAndUnevenSortOfArray(dArr);
            finish = System.currentTimeMillis();
            msec = (int) (finish - start);
            totalTimeEvenUneven += msec;

        }

        averageTimeBubble = totalTimeBubble/countOfIterations;
        averageTimeShaker = totalTimeShaker/countOfIterations;
        averageTimeEvenUneven = totalTimeEvenUneven/countOfIterations;

        System.out.println("Average time of Bubble sorting " + averageTimeBubble / 1000 + " sec" + " or " + averageTimeBubble + "msec");
        System.out.println("Average time of Shaker sorting " + averageTimeShaker / 1000 + " sec" + " or " + averageTimeShaker + "msec");
        System.out.println("Average time of EvenUneven sorting " + averageTimeEvenUneven / 1000 + " sec" + " or " + averageTimeEvenUneven + "msec");

    }
}
