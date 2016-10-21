package ua.com.vtkachenko.EasyTask8;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

//Создать класс фильтр матюков например swearingFilter.filter("Я ненавижу этот ебаный мир") -> "Я ненавижу этот @#%& мир" сделай так чтоб список матерных слов можно было пополнять
public class EasyTask8 {

    public static void main(String[] args) throws  IOException{

        String a = "Я сука мир";
        String b = "Я ненавижу этот сука мир";
        String c = "Вокруг одно лишь блядство";
        String d = "Да мне похуй на все";
        String e = "Охуели совсем";

        SwearingFilter.filter(a);
        SwearingFilter.filter(b);
        SwearingFilter.filter(c);
        SwearingFilter.filter(d);
        SwearingFilter.filter(e);

    }
}

class SwearingFilter {

    static void filter(String str) {

        try {
            StringBuilder bads = fileReading();

        String rr = bads.toString().trim() + " ";

            int count = 0;
            //String wr = "";
            for (int i = 0; i < rr.length(); i++) {
                if (rr.charAt(i) == ' ') {
                   String wr = rr.substring(count, i);
                    //System.out.println(wr);
                    count = i + 1;

                    //Делаем замену плохих слов
                    StringBuilder givenString = new StringBuilder();
                    givenString.append(str);
                    int inStart = givenString.indexOf(wr);
                    if (inStart != -1) {
                        int inFin = givenString.indexOf(wr) + wr.length();

                        //Определим длину заменяемых символов
                        int len = inFin - inStart;
                        //System.out.println(len);

                        String rep = "";
                        for (int j = 0; j < len; j++) {
                            Random r = new Random();
                            String dict = "@#$%^&*"; //строка содержит все доступные символы
                            char c = dict.charAt(r.nextInt(dict.length())); //в переменную с записывается случайный из них
                            rep = rep + c;
                        }
                        //System.out.println(rep);

                        givenString.replace(inStart, inFin, rep);
                        System.out.println(givenString.toString());
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static StringBuilder fileReading() throws IOException {

        String linkF = System.getProperty("user.dir") + System.getProperty("file.separator") + "SwearingWords.txt";
        StringBuilder badWordsString = new StringBuilder();

        //Чтение или заполнение файла с плохими словами
        File newFile = new File(linkF);
        if (newFile.createNewFile()) {
            //System.out.println("Новый файл создан");
            System.out.println("Заполните список плохих слов(через пробел)");
            Scanner sc = new Scanner(System.in);
            String badWords = sc.nextLine();

            //Запись в файл
            try (FileWriter writer = new FileWriter(linkF, false)) {
                // запись всей строки
                writer.write(badWords);
                // запись по символам
//                writer.append('\n');
//                writer.append('E');

                writer.flush();
                badWordsString.append(badWords);
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        } else {
            //System.out.println("Файл уже существует");

            //Читаем файл
            try (FileReader reader = new FileReader(linkF)) {
                // читаем посимвольно
                int cc;
                while ((cc = reader.read()) != -1) {

                    //System.out.print((char)cc);
                    badWordsString.append((char) cc);
                }
            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }
        return badWordsString;
    }

}
