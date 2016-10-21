package ua.com.vtkachenko.hashcode;

public class HashCode {

    public static void main(String[] args) {
        Object object = new Object();
        int hCode;
        hCode = object.hashCode();
        System.out.println(hCode);
    }
}
