package ua.com.vtkachenko.easytask20;

public class ReverseWord {

    public static void main(String[] args){

        StringBuffer str = new StringBuffer("Hello here!");
        StringBuffer newString = new StringBuffer();
        int size = str.length();
        for (int i = str.length()-1; i >= 0; i--) {
            newString.append(str.charAt(i));
        }
        System.out.println(newString);
    }

}
