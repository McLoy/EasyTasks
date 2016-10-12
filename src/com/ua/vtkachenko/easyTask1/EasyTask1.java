package com.ua.vtkachenko.easyTask1;

import java.util.*;

import static java.lang.Character.*;

/*
Необходимо из произвольной строки убрать все лишние символы кроме букв, цифр и "_"
 */
public class EasyTask1 {
    public static void main(String[] args) {

        //old code
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter some text for parsing: ");
//        String text = in.nextLine();
//        ArrayList<String> box = new ArrayList<String>();
//
//        StringBuilder word = new StringBuilder();
//
//        for (int i = 0; i < text.length(); i++) {
//            char c = text.charAt(i);
//            if (mustBe(c)){
//                word.append(c);
//            } else {
//                if (word.length() != 0){
//                    box.add(word.toString());
//                    word = new StringBuilder();
//                }
//            }
//        }
//        if (word.length() != 0){
//            box.add(word.toString());
//        }

        String myString = "rgwerge%#^$^%#$^%GGHRETHryUYTU79879ert%$^$erw4#@%3 rERYtre 53$^%6";
        ArrayList<String> myWords = new ArrayList<>();
        myWords = putStringInArrayList(myString);

        for (int i = 0; i < myWords.size(); i++) {
            System.out.println(myWords.get(i));
        }
    }

    public static boolean mustBe(char c){

    if (isDigit(c) || isAlphabetic(c) || '_' == c )
        return true;
    return false;
    }

    public static ArrayList<String> putStringInArrayList(String inputString){

        //Scanner in = new Scanner(System.in);
        //System.out.println("Enter some text for parsing: ");
        String text = inputString;
        ArrayList<String> box = new ArrayList<>();

        StringBuilder word = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (mustBe(c)){
                word.append(c);
            } else {
                if (word.length() != 0){
                    box.add(word.toString());
                    word = new StringBuilder();
                }
            }
        }
        if (word.length() != 0){
            box.add(word.toString());
        }

        return box;
    }
}
