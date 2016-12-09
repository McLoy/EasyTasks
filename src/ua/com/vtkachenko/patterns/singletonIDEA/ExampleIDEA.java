package ua.com.vtkachenko.patterns.singletonIDEA;

public class ExampleIDEA {

    private static ExampleIDEA ourInstance = new ExampleIDEA();

    private ExampleIDEA() {
    }

    public static ExampleIDEA getInstance() {
        return ourInstance;
    }
}
