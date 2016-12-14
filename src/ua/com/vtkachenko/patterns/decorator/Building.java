package ua.com.vtkachenko.patterns.decorator;

public abstract class Building {

    protected int area;

    public int getArea(){
        return area;
    }

    abstract String getName();
}
