import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.util.Scanner;

public class Employee_Data {
    private static String File = "C:\\Users\\Chetan\\IdeaProjects\\Assi_3\\text1.txt";
    private static Gson gson = new Gson();

    private static class Employee{

        private String employee_name;
        private int age;
        private String email;
        private String DOB;

        //getters and setters

        public String getEmployee_name() {
            return employee_name;
        }

        public void setEmployee_name(String employee_name) {
            this.employee_name = employee_name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getDOB() {
            return DOB;
        }

        public void setDOB(String DOB) {
            this.DOB = DOB;
        }
    }


    // Save to file
    private static void WriteToFile(String myData) {
        java.io.File dfile = new File(File); //here d file is a default file
        if (!dfile.exists()) {
            try {
                File directory = new File(dfile.getParent());
                if (!directory.exists()) {
                    directory.mkdirs();
                }
                dfile.createNewFile();
            } catch (IOException ex) {
                System.out.println("Excepton Occured: " + ex.toString());
            }
        }
        try {
            FileWriter fw;
            fw = new FileWriter(dfile.getAbsoluteFile(), true);

            // Writes text to a character-output stream
            BufferedWriter bufferWriter = new BufferedWriter(fw);
            bufferWriter.write(myData.toString());
            bufferWriter.close();

            System.out.println("Employee data saved at file location: " + File + " Data: " + myData + "\n");
        } catch (IOException ex) {
            System.out.println("Got an error while saving Company data to file " + ex.toString());
        }
    }

    // Read From File
    public static void ReadFromFile() {
        File dfile = new File(File);
        if (!dfile.exists())
            System.out.println("File doesn't exist");

        InputStreamReader isReader;
        try {
            isReader = new InputStreamReader(new FileInputStream(dfile), "UTF-8");

            JsonReader myReader = new JsonReader(isReader);
            Employee e = gson.fromJson(myReader, Employee.class);

            System.out.println("Employee Name: " + e.employee_name);
            System.out.println("Age of Employee: " + e.age);
            System.out.println("Employee Email: " + e.email);
            System.out.println("Employee DOB: " + e.DOB);



        } catch (Exception ex) {
            System.out.println("Error load cache from file " + ex.toString());
        }

        System.out.println("\nCompany Data loaded successfully from file " + File);

    }


    public static void insertRecord() {

        String n,em,dob;
        int a;

        Scanner sc=new Scanner(System.in);

        System.out.println("\n\n*** Enter Employee Details Here***\n");

        System.out.println("Enter the Employee name here: ");
        n=sc.next();

        System.out.println("Enter Empployee Age here: ");
        a=sc.nextInt();

        System.out.println("Enter Employee email ID here: ");
        em=sc.next();

        System.out.println("Enter The Employee DAte of Birth : ");
        dob= sc.next();

        Employee e=new Employee();
        e.setEmployee_name(n);
        e.setAge(a);
        e.setEmail(em);
        e.setDOB(dob);

        //Save data to the file
        WriteToFile(gson.toJson(e));
    }

    public static void readFile() {
        //Read the file
        ReadFromFile();
    }


    /*
    public static void sortRecord()
    {
        Employee e=new Employee();
        e.setEmployee_name(n);
        e.setAge(a);
        e.setEmail(em);
        e.setDOB(dob);
    }
    */

    // Main Method
    public static void main(String[] args) {
        int choice=0;
        do
        {
            System.out.println("-------------Employee Menu------------");
            System.out.println("-------------1.Insert Record------------");
            System.out.println("-------------2.Read the File Data------------");
            System.out.println("-------------3.Search by Roll No------------");
            System.out.println("-------------4.Search All Record------------");
            System.out.println("-------------5.Update Record------------");
            System.out.println("-------------6.Exit------------");
            System.out.println("-------------------------------------------");
            System.out.println("Enter Your Choice : ");
            Scanner scan=new Scanner(System.in);

            choice=scan.nextInt();

            switch(choice)
            {
                case 1:insertRecord();break;
                case 2:readFile();break;
                //case 3:searchRecord();break;
                //case 4:searchAll();break;
                //case 5:updateRecord();break;
            }
        }while(choice!=6);
    }

}






