import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = -4724957588046435474L;
    private String firstName;
    private String dateOfBirth;
    Address address;  //Reference Object of Address Class

    //Contructor
    public Student(String firstName, String dateOfBirth, Address address) {
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }


    //Getters and Setters


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address [FirstName=" + firstName + ", DateOfBirth =" + dateOfBirth + ", Address=" + address + "]";
    }
}
