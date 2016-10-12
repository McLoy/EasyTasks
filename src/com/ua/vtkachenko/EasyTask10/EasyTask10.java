package com.ua.vtkachenko.EasyTask10;

import java.util.*;
import static com.ua.vtkachenko.easyTask1.EasyTask1.putStringInArrayList;

//Создать класс фильтр матюков например swearingFilter.filter("Я ненавижу этот ебаный мир") -> "Я ненавижу этот @#%& мир" сделай так чтоб список матерных слов можно было пополнять
public class EasyTask10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите плохие слова разделяя их запятой или пробелом:");
        String ss = in.nextLine();
        ArrayList<String> badWords;
        badWords = putStringInArrayList(ss);
        System.out.println("Чудесно, у вас богатый багаж знаний!");
        SwearingFilter sf = new SwearingFilter();

        String ex = "";
        do {

            if (ex.length() != 0){
                System.out.println("Наши плохие слова:");
                for (String bb: badWords) {
                    System.out.print(bb + " ");
                }
                System.out.println("");
                System.out.println("Добавьте еще пару слов разделяя запятой или пробелом:");
                String sss = in.nextLine();
                badWords.addAll(putStringInArrayList(sss));
            }
            System.out.println("Введите предложение в котором мы будем искать плохие слова:");
            String ss2 = in.nextLine();

            sf.filter(ss2, badWords);
            System.out.println("Вы хотите продолжить наш лингвистический тур? Y(Д)/N(Н)");
            ex = in.nextLine();
            ex = ex.toUpperCase();
        }
        while (ex.equals("Y") || ex.equals("Д"));
    }
}

class SwearingFilter{

    public void filter(String str, ArrayList<String> bw){

        StringBuilder sb = new StringBuilder(str);

        for (String badW: bw){

                do {
                    String rs;

                    if (tm.get(badW) == null) {
                        rs = randSymb(badW);
                        tm.put(badW, rs);
                    } else {
                        rs = tm.get(badW);
                    }

                    if (sb.indexOf(badW) != -1){
                        sb.replace(sb.indexOf(badW), sb.indexOf(badW) + badW.length(), rs);
                    }
                }
                while (sb.indexOf(badW) != -1);

        }

            System.out.println("Фильтр выполнил замену:");
            System.out.println(sb.toString());

    }

    private String randSymb(String badWord){

        String rep = "";
        for (int j = 0; j < badWord.length(); j++) {
            Random r = new Random();
            String dict = "@#$%^&*";
            char c = dict.charAt(r.nextInt(dict.length()));
            rep = rep + c;
        }
        return rep;
    }

    public TreeMap<String, String> tm = new TreeMap<>();

}
