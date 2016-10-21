package ua.com.vtkachenko.easytask17;

import static ua.com.vtkachenko.arraysorting.combsorting.CombSorting.combSortOfArray;
import static ua.com.vtkachenko.arraysorting.easytask16.BubbleSortOfArray.bubbleSortOfArray;
import static ua.com.vtkachenko.arraysorting.easytask16.BubbleSortOfArray.createRandNumsInArray;
import static ua.com.vtkachenko.arraysorting.easytask18.ShakerSortingArray.shakerSortOfArray;
import static ua.com.vtkachenko.arraysorting.easytask19.EvenAndUnevenSort.evenAndUnevenSortOfArray;
import static ua.com.vtkachenko.arraysorting.quicksorting.QuickSortingOfArray.quickSortOfArray;

public class CompareTimeOfSorting {

    public static void main(String[] args) {

        int t = 0;

        int averageTimeBubble = 0;
        int averageTimeShaker = 0;
        int averageTimeEvenUneven = 0;
        int averageTimeComb = 0;
        int averageTimeQuick = 0;

        int totalTimeBubble = 0;
        int totalTimeShaker = 0;
        int totalTimeEvenUneven = 0;
        int totalTimeComb = 0;
        int totalTimeQuick = 0;

        int countOfIterations = 100;

        for (int i = 0; i < countOfIterations; i++) {

            int[] aArr = new int[50000];
            createRandNumsInArray(aArr);

            int[] bArr = aArr.clone();
            int[] cArr = aArr.clone();
            int[] dArr = aArr.clone();
            int[] eArr = aArr.clone();
            int[] fArr = aArr.clone();

//            System.out.println("+++Bubble sorting+++");
//            System.out.println(Arrays.toString(cArr));

            long start = System.currentTimeMillis();

            bubbleSortOfArray(bArr);

            long finish = System.currentTimeMillis();
//            System.out.println(Arrays.toString(cArr));
            int msec = (int) (finish - start);
//            System.out.println("Time of sorting: " + msec / 1000 + " sec" + " or " + msec + "msec");
            totalTimeBubble += msec;

//            System.out.println("+++Shaker sorting+++");
//            System.out.println(Arrays.toString(bArr));

            start = System.currentTimeMillis();

            shakerSortOfArray(cArr);

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

            //System.out.println(Arrays.toString(eArr));
            start = System.currentTimeMillis();
            combSortOfArray(eArr);
            //System.out.println(Arrays.toString(eArr));
            finish = System.currentTimeMillis();
            msec = (int) (finish - start);
            //System.out.println("Time of sorting: " + msec / 1000 + " sec" + " or " + msec + "msec");
            totalTimeComb += msec;
            //System.out.println(i);

            start = System.currentTimeMillis();
            quickSortOfArray(dArr);
            finish = System.currentTimeMillis();
            msec = (int) (finish - start);
            totalTimeQuick += msec;

        }

        averageTimeBubble = totalTimeBubble/countOfIterations;
        averageTimeShaker = totalTimeShaker/countOfIterations;
        averageTimeEvenUneven = totalTimeEvenUneven/countOfIterations;
        averageTimeComb = totalTimeComb/countOfIterations;
        averageTimeQuick = totalTimeQuick/countOfIterations;

        System.out.println("Average time of Bubble sorting " + averageTimeBubble / 1000 + " sec" + " or " + averageTimeBubble + "msec");
        System.out.println("Average time of Shaker sorting " + averageTimeShaker / 1000 + " sec" + " or " + averageTimeShaker + "msec");
        System.out.println("Average time of EvenUneven sorting " + averageTimeEvenUneven / 1000 + " sec" + " or " + averageTimeEvenUneven + "msec");
        System.out.println("Average time of Comb sorting " + averageTimeComb / 1000 + " sec" + " or " + averageTimeComb + "msec");
        System.out.println("Average time of Quick sorting " + averageTimeQuick / 1000 + " sec" + " or " + averageTimeQuick + "msec");

    }
}
