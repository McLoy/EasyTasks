package ua.com.vtkachenko.patterns.proxy;

import java.util.ArrayList;

public interface AddressBook {

    public void add(Address address);
    public ArrayList getAllAddresses();
    public Address getAddress(String description);

    public void open();
    public void save();
}
