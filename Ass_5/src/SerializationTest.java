

import Model.Address;
import Model.Student;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializationTest {
    public static void main(String[] args) {

        String fileName = "C:\\Users\\Chetan\\Desktop\\Ass_5\\src\\SerializationTestFile\\output2.ser";
        serializeObject(fileName);

    }

    private static void serializeObject(String fileName) {
        String city,country,state;
        int pincode;

        //Getting User input for Model.Address here :
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter City here: ");
        city=sc.next();
        System.out.println("Enter State here: ");
        state=sc.next();
        System.out.println("Enter pincode here: ");
        pincode=sc.nextInt();
        System.out.println("Enter Country here: ");
        country=sc.next();

        //Getting user Input for Model.Student here :
        System.out.println("Enter Model.Student Name : ");
        String n=sc.next();
        System.out.println("Enter Date of Birth : ");
        String dob=sc.next();

        Address address = new Address(city,state,pincode,country);
        Student student = new Student(n,dob,address);

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File(fileName)))) {
            objectOutputStream.writeObject(student);
            System.out.println("\nObject is Serialized..");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




}
