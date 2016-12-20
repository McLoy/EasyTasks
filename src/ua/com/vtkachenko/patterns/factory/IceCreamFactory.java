package ua.com.vtkachenko.patterns.factory;

public class IceCreamFactory {

    public IceCream getIceCream(String  iceCreamType){
        if (iceCreamType == null){
            return null;
        }
        if (iceCreamType.equalsIgnoreCase("STRAWBERRY")){
            return new StrawberryIceCream();
        }
        if (iceCreamType.equalsIgnoreCase("CHOCOLATE")){
            return new ChocolateIceCream();
        }
        return null;
    }

    public static void main(String[] args) {
        IceCreamFactory shapeFactory = new IceCreamFactory();

        IceCream shape1 = shapeFactory.getIceCream("STRAWBERRY");
        shape1.eat();

        IceCream shape2 = shapeFactory.getIceCream("CHOCOLATE");
        shape2.eat();
    }
}
