package ua.com.vtkachenko.patterns.decorator;

public class SmallFarm extends AreadDecorator {

    Building building;

    public SmallFarm(Building building) {
        this.building = building;
    }

    @Override
    public int getArea() {
        return building.getArea() + 20;
    }

    @Override
    String getName() {
        return building.getName() + ", and a Garage";
    }
}
