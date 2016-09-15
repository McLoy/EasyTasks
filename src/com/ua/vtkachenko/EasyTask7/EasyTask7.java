package com.ua.vtkachenko.EasyTask7;

//Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
public class EasyTask7 {
    public static void main(String[] args) {

        countCode("aaacodebbb");// → 1

    }
    public static void countCode(String in){
        int count = 0;

        if (in.contains("code"))
        {
            do{
            in.replaceFirst("code","");
                count = 1;
            }
            while (in.contains("code"));
        }        //System.out.println(c1.substring(1)+ c2.substring(1));
        System.out.println(count);
    }
}
