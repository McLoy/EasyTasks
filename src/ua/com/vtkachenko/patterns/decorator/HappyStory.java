package ua.com.vtkachenko.patterns.decorator;

public class HappyStory {

    public static void main(String[] args) {

        Building hovel = new Hovel();
        System.out.println(hovel.getName() + " with area: " + hovel.getArea());

        Building smallFarm = new SmallFarm(hovel);
        System.out.println(smallFarm.getName() + " with area: " + smallFarm.getArea());

        Building bigFarm = new BigFarm(smallFarm);
        System.out.println(bigFarm.getName() + " with area: " + bigFarm.getArea());
    }
}
