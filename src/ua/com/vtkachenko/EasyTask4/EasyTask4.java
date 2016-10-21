package ua.com.vtkachenko.EasyTask4;

//Создать список чисел от 1 до 100.
// Пройти список циклом и вывести fiz если число делится на 3,
// вывести buzz если число делится на 5 и
// вывести fizbuzz если число делится и на 3 и на 5
//Вывести число если ни на что не делится
public class EasyTask4 {

    public static void main(String[] args) {

        int[] box = new int[100];
        for (int i = 0; i < box.length; i++) {
            int j = i + 1;
            box[i] += j;
        }

        for (int k = 0; k < box.length; k++) {

            if (box[k]%3 == 0 && box[k]%5 == 0) System.out.println(box[k] + " - " + "fizbuzz");
            else if (box[k]%3 == 0) System.out.println(box[k] + " - " + "fiz");
            else if (box[k]%5 == 0) System.out.println(box[k] + " - " + "buzz");
            else System.out.println(box[k]);

        }
    }
}
