//1.Define a class Address representing an address with attributes such as street, city, state, and zip code. Provide constructors to initialize these attributes.

package java_programs;

public class Address {
    // Attributes of the Address class
    private String street;
    private String city;
    private String state;
    private String zipCode;

    // Constructor to initialize all attributes
    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Getter methods to retrieve values
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    // Setter methods to modify values
    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    // Method to display the address in a formatted way
    public void displayAddress() {
        System.out.println("Address: " + street + ", " + city + ", " + state + " - " + zipCode);
    }

    public static void main(String[] args) {
        // Creating an Address object using the constructor
        Address address = new Address("789 Morya APT", "Sparklepeeks", "Illinois", "34745");

        // Displaying the address
        address.displayAddress();
    }
}

//Output:-
//Address: 789 Morya APT, Sparklepeeks, Illinois - 34745

