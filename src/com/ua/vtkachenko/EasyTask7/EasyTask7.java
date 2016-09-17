package com.ua.vtkachenko.EasyTask7;

//Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
public class EasyTask7 {
    public static void main(String[] args) {
        countCode("aaacodebbb", "code");// → 1
        countCode("fgsfghghwowowphjgbrawowebbb", "wow");
    }
    public static void countCode(String in, String word){

        int wl = word.length();
        int count = 0;
        for (int i = 0; i < in.length() - wl; i++) {
            String wordOfString = in.substring(i, i+wl);
            if (wordOfString.equals(word))
                count = count + 1;
        }
        System.out.println("String '" + word + "' appears " + count + " times in string '" + in + "'");
    }
}
