package Model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Serializable {
    private static final long serialVersionUID = -4724957588046435474L;
    private String firstName;
   // private String dateOfBirth;

    Address address;  //Reference Object of Model.Address Class

    Date dateOfBirth=new Date();

    //SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/YYYY");
    //Date d1=sdf1.parse(dateOfBirth);


    //Change String Date to Java.util.Date
    //Constructor


    public Student(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    //Contructor
    public Student(String firstName, String dateOfBirth, Address address) {
        this.firstName = firstName;
        //this.dateOfBirth = dateOfBirth;
        this.address = address;
    }



    //Getters and Setters


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

/*
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

 */

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Model.Address [FirstName=" + firstName + ", DateOfBirth =" + dateOfBirth + ", Model.Address=" + address + "]";
    }
}
