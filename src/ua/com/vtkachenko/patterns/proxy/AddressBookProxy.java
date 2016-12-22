package ua.com.vtkachenko.patterns.proxy;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class AddressBookProxy implements AddressBook {

    private File file;
    private AddressBookImpl addressBook;
    private ArrayList localAddresses = new ArrayList();

    public AddressBookProxy(String filename) {
        file = new File(filename);
    }

    @Override
    public void open() {
        addressBook = new AddressBookImpl(file);
        Iterator addressIterator = localAddresses.iterator();
        while (addressIterator.hasNext()){
            addressBook.add((Address) addressIterator.next());
        }
    }

    @Override
    public void close() {

    }
}
