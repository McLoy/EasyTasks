package com.ua.vtkachenko.EasyTask11;

import java.util.*;
import static com.ua.vtkachenko.EasyTask1.EasyTask1.putStringInArrayList;

//Создать класс фильтр матюков например swearingFilter.filter("Я ненавижу этот ебаный мир") -> "Я ненавижу этот @#%& мир" сделай так чтоб список матерных слов можно было пополнять
public class EasyTask11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите плохие слова разделяя их запятой или пробелом:");
        String ss = in.nextLine();
        System.out.println("Чудесно, у вас богатый багаж знаний!");
        SwearingFilter sf = new SwearingFilter();
        sf.bw = putStringInArrayList(ss);
        ArrayList<String> badWords = sf.bw;
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

            System.out.println("Фильтр выполнил замену:");
            System.out.println(sf.filter(ss2));

            System.out.println("Вы хотите продолжить наш лингвистический тур? Y(Д)/N(Н)");
            ex = in.nextLine();
            ex = ex.toUpperCase();
        }
        while (ex.equals("Y") || ex.equals("Д"));
    }
}

class SwearingFilter{

    public static String charsForMask = "@#$%^&*";

    public String filter(String str){

        StringBuilder sb = new StringBuilder(str);

        for (String badW: bw){

            do {
                if (sb.indexOf(badW) != -1){

                String rs;

                if (hm.get(badW) == null) {
                    rs = getMask(badW);
                    hm.put(badW, rs);
                } else {
                    rs = hm.get(badW);
                }


                    sb.replace(sb.indexOf(badW), sb.indexOf(badW) + badW.length(), rs);
                }
            }
            while (sb.indexOf(badW) != -1);

        }

        return sb.toString();
    }

    private String getMask(String badWord){

        String rep = "";
        for (int j = 0; j < badWord.length(); j++) {
            Random r = new Random();
            String dict = charsForMask;
            char c = dict.charAt(r.nextInt(dict.length()));
            rep = rep + c;
        }
        return rep;
    }

    public Map<String, String> hm = new HashMap<>();
    public ArrayList<String > bw = new ArrayList<>();
}
