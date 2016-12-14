package ua.com.vtkachenko.patterns.decorator;

public class BigFarm extends AreadDecorator {

    Building building;

    public BigFarm(Building building) {
        this.building = building;
    }

    @Override
    public int getArea() {
        return building.getArea() + 10000;
    }

    @Override
    String getName() {
        return building.getName() + ", and a big garden";
    }
}
