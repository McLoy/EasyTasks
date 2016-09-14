package com.ua.vtkachenko.EasyTask3;

import java.util.*;

public class EasyTask3 {
    public static void main(String[] args) {
//        Cat aCat = new Cat("Murchik");
//        System.out.println(aCat.getName());


        EasyTask3 a = new EasyTask3();
        TreeSet<Cat> allCats = a.createCats("Murchik","Garfield","Royald");
        System.out.println(allCats.toString());
    }

    public static class Cat{

        Cat(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }

        private String name;
    }

    public TreeSet<Cat> createCats(String catName1, String catName2, String catName3){

        TreeSet<Cat> catBox = new TreeSet<>();

        catBox.add(new Cat(catName1));
        catBox.add(new Cat(catName2));
        catBox.add(new Cat(catName3));

        return catBox;

    }


}
