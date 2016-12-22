package ua.com.vtkachenko.patterns.proxy;

import java.io.Serializable;

public interface Address extends Serializable{
    public static final String EOL_STRING = System.getProperty("line.separator");
    public static final String SPACE = " ";
    public static final String COMMA = ",";

    public String getAddress();
    public String getType();
    public String getDescription();
    public String getStreet();
    public String getCity();
    public String getState();
    public String getZipCode();

    public String setType(String newType);
    public String setDescription(String newDescription);
    public String setStreet(String newStreet);
    public String setCity(String newCity);
    public String setState(String newState);
    public String setZipCode(String newZip);

}
