import java.io.Serializable;

public class Address implements Serializable {

    private static final long serialVersionUID = -7800233291437691948L;
    private String city;
    private String State;
    private long pincode;
    private String country;

    //  Parametrised Constructor
    public Address(String city, String state, long pincode, String country) {
        this.city = city;
        State = state;
        this.pincode = pincode;
        this.country = country;
    }

    // Getters and Setters

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public long getPincode() {
        return pincode;
    }

    public void setPincode(long pincode) {
        this.pincode = pincode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address [City=" + city + ", State =" + State + ", pincode=" + pincode + ", Country="
                + country + "]";
    }
}
