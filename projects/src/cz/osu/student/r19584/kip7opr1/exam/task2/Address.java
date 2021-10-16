package cz.osu.student.r19584.kip7opr1.exam.task2;

public class Address {
    private String state;
    private String city;
    private String street;
    private int ZIP;

    public Address(String state, String city, String street, int ZIP) {
        setState(state);
        setCity(city);
        setStreet(street);
        setZIP(ZIP);
    }

    public Address(Address address) {
        setState(address.getState());
        setCity(address.getCity());
        setStreet(address.getStreet());
        setZIP(address.getZIP());
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getZIP() {
        return ZIP;
    }

    public void setZIP(int ZIP) {
        this.ZIP = ZIP;
    }

    @Override
    public String toString() {
        return "Address: " + getStreet() + ", " + getCity() + ", " + getState() + " " + getZIP();
    }

    public void print() {
        System.out.println(toString());
    }
}
