package ua.com.vtkachenko.patterns;

public final class Singleton {
    private static Singleton _instance = null;

    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (_instance == null)
            _instance = new Singleton();
        return _instance;
    }
}
