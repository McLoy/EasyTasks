package ua.com.vtkachenko.patterns.proxy;

public class AddressImpl implements Address {

    private String type;
    private String description;
    private String street;
    private String city;
    private String state;
    private String zipCode;
    public static final String HOME = "home";
    public static final String WORK = "work";

    public AddressImpl() {
    }

    public AddressImpl(String newDescription, String newStreet, String newCity,
                       String newState, String newZipCode) {
        description = newDescription;
        street = newStreet;
        city = newCity;
        state = newState;
        zipCode = newZipCode;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String getStreet() {
        return street;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public String getZipCode() {
        return zipCode;
    }

    @Override
    public void setType(String newType) {
        type = newType;
    }

    @Override
    public void setDescription(String newDescription) {
        description = newDescription;
    }

    @Override
    public void setStreet(String newStreet) {
        street = newStreet;
    }

    @Override
    public void setCity(String newCity) {
        city = newCity;
    }

    @Override
    public void setState(String newState) {
        state = newState;
    }

    @Override
    public void setZipCode(String newZip) {
        zipCode = newZip;
    }

    @Override
    public String toString() {
        return description;
    }

    public String getAddress(){
        return description + EOL_STRING + street + EOL_STRING +
                city + COMMA + SPACE + state + SPACE + zipCode + EOL_STRING;
    }
}
