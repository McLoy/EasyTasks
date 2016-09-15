package com.ua.vtkachenko.EasyTask6;

//Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

//nonStart("Hello", "There") → "ellohere"
     //   nonStart("java", "code") → "avaode"
   //     nonStart("shotl", "java") → "hotlava",
public class EasyTask6 {
    public static void main(String[] args) {
        nonStart("Hello", "There");// → "ellohere"
        nonStart("java", "code");// → "avaode"
        nonStart("shotl", "java"); //→ "hotlava"
    }

    public static void nonStart(String c1, String c2){
        System.out.println(c1.substring(1)+ c2.substring(1));
    }
}
