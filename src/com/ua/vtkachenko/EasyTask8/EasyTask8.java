package com.ua.vtkachenko.EasyTask8;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

//сделай класс фильтр матюков например swearingFilter.filter("Я ненавижу этот ебаный мир") -> "Я ненавижу этот @#%& мир" сделай так чтоб список матерных слов можно было пополнять
public class EasyTask8 {

    public static void main(String[] args) throws  IOException{

        String a = "Я сука мир";
        String b = "Я ненавижу этот сука мир";
        String c = "Вокруг одно лишь блядство";
        String d = "Да мне похуй на все";
        String e = "Охуели совсем";

        System.out.println("Словарь: " + swearingFilter.fileReading().toString());

//        swearingFilter.filter(a);
//        swearingFilter.filter(b);
//        swearingFilter.filter(c);
//        swearingFilter.filter(d);
//        swearingFilter.filter(e);

        //System.out.println(System.getProperty("user.dir"));
        //System.out.println(System.getProperty("user.home"));


        //swearingFilter.writeFile("сука", voc);

//        String voc = "SwearingWords.txt";
//        String dir = System.getProperty("user.dir");
//        String link = dir + System.getProperty("file.separator")+ voc;

//        File newFile = new File(link);
//        if (newFile.createNewFile()) {
//            System.out.println("Новый файл создан");
//            System.out.println("Заполните список плохих слов(через пробел)");
//            Scanner sc = new Scanner(System.in);
//            String badWords = sc.nextLine();
//
//            //Запись в файл
//            try(FileWriter writer = new FileWriter(link, false))
//            {
//                // запись всей строки
//                writer.write(badWords);
//                // запись по символам
////                writer.append('\n');
////                writer.append('E');
//
//                writer.flush();
//            }
//            catch(IOException ex){
//
//                System.out.println(ex.getMessage());
//            }
//        } else {
//            System.out.println("Файл уже существует");

//            StringBuilder badBoxWords = new StringBuilder();
//
//            //Читаем файл
//            try(FileReader reader = new FileReader(link))
//            {
//                // читаем посимвольно
//                int cc;
//                while((cc = reader.read())!=-1){
//
//                    //System.out.print((char)cc);
//                    badBoxWords.append((char)cc);
//                }
//            }
//            catch(IOException ex){
//
//                System.out.println(ex.getMessage());
//            }

//            System.out.println(badBoxWords.toString());
//
//            String rr = badBoxWords.toString().trim() + " ";

//            int count = 0;
//            String wr = "";
//            for (int i = 0; i < rr.length(); i++) {
//                if (rr.charAt(i) == ' ') {
//                   wr = rr.substring(count, i);
//                    //System.out.println(wr);
//                    count = i + 1;
//
//                    //Делаем замену плохих слов
//                    StringBuilder wrep = new StringBuilder();
//                    wrep.append(a);
//                    int inStart = wrep.indexOf(wr);
//                    int inFin = wrep.indexOf(wr) + wr.length();
//
//                    wrep.replace(inStart, inFin, "**");
//                    System.out.println(wrep.toString());
//                    break;

//                }
//            }
//        }
//
//
//
    }
}

class swearingFilter {

//    public static void filter(String enter) {
//
//
//
//    }

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
