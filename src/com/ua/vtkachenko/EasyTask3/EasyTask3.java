package com.ua.vtkachenko.EasyTask3;

import java.util.*;

public class EasyTask3 {
    public static void main(String[] args) {

        HashSet<Cat> cats = createCats(new Cat("Porter"), new Cat("Garfild"), new Cat("Zorro"));
//        for (Cat f : cats)
//            System.out.println(f.name);
//        System.out.println("Deleting one of cats from Set");

        Iterator<Cat> iter = cats.iterator();
        while(iter.hasNext()){
            Cat s = iter.next();
            if (s.name.equals("Zorro")) iter.remove();
        }
        printCats(cats);
    }

    public static class Cat{

        Cat(String name){
            this.name = name;
        }

        private String name;

    }

    public static HashSet<Cat> createCats(Cat a, Cat b, Cat c){

        HashSet<Cat> catBox = new HashSet<>();

        catBox.add(a);
        catBox.add(b);
        catBox.add(c);

        return catBox;
    }

    public static void printCats(HashSet<Cat> kiski){

        for (Cat f : kiski)
            System.out.println(f.name);

    }

}
