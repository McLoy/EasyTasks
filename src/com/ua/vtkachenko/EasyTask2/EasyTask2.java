package com.ua.vtkachenko.EasyTask2;

import java.io.*;
import java.util.*;

import static com.ua.vtkachenko.easyTask1.EasyTask1.putStringInArrayList;

//Make a function that read some *.txt file and calculate how much doublicates of words are there, result sort by name
public class EasyTask2 {

    public static void main(String[] args) throws IOException {

        String fileWay = "/home/grisha/Desktop/JavaV/EasyTasks/src/com/ua/vtkachenko/EasyTask2/input";
        String strFromTXT = giveStringFromTXTFile(fileWay);
        //System.out.println(strFromTXT);
        ArrayList mass = putStringInArrayList(strFromTXT);
//        for (int i = 0; i < mass.size(); i++) {
//            System.out.println(mass.get(i));
//        }
        Map<String,Integer> map = mapFromList(mass);

        for(Map.Entry e : map.entrySet()){
            System.out.println(e.getKey()+" "+ e.getValue());
        }
    }

    public static Map<String, Integer> mapFromList(ArrayList<String> enter) {

        Map<String, Integer> res = new TreeMap<>();

        for (String s : enter) {
            String word = s.toUpperCase();
            Integer count = res.get(word);
            if (count == null) {
                res.put(word, 1);
            } else {
                res.put(word, count + 1);
            }
        }
        return res;
    }

    public static String giveStringFromTXTFile(String way) throws IOException{

        File file = new File(way);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        StringBuilder sb = new StringBuilder();
        while((line = br.readLine()) != null) {
            sb.append(line)
                    .append('\n');
        }

        return sb.toString();
    }


}



