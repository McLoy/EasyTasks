package ua.com.vtkachenko.patterns.singletonGolovach;

public class Singleton {

    public static final Singleton instance = new Singleton();

    private Singleton() {}

    public static void main(String[] args) {
        Singleton singleton = new Singleton();
//        Singleton singleton = new Singleton();
//        Singleton singleton = new Singleton();
//        Singleton singleton = new Singleton();
        Singleton ref = Singleton.instance;
    }
}
