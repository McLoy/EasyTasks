package ua.com.vtkachenko.easytask21;

public /*final */ class Example extends Foo implements ExampleOfInterface{

    private final int digit = 888;
    protected int value;

    public int getDigit() {
        return digit;
    }

    public /* final */ void increaseValue(){
        value++;
    }

    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Example fe = new Example();
        System.out.println(fe.getDigit());
        fe.increaseValue();
        NewExample ne = new NewExample();
        ne.increaseValue();
        System.out.println(fe.getValue());
        System.out.println(ne.getValue());
    }

    @Override
    public void methodExample() {

    }

    @Override
    public void methodExample2() {

    }
}

class NewExample extends Example{
    public void increaseValue(){
        value = value + 2;
    }
}

