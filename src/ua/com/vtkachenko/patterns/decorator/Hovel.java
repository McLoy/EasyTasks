package ua.com.vtkachenko.patterns.decorator;

public class Hovel extends Building {

    public Hovel() {
        area = 60;
    }

    @Override
    String getName() {
        return "Just a Hovel";
    }
}
