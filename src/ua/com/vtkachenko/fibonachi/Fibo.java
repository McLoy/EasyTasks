package ua.com.vtkachenko.fibonachi;

public class Fibo {

    //function that outputs values that forms number fibonachi
    public static void main(String[] args) {
        fib(21);
    }

    public static void fib(int c){
        int curr = 0;
        int next = 1;
        int f = 0;
        do{
            f = curr + next;
            if (f != c){
            curr = next;
            next = f;
            }
        }   while (f != c);
        System.out.println("Values that formed summ fib - " + c + " is " + (curr) + " and " + (next));
    }
}
