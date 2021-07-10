import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main_Class {
    public static void main(String[] args) {

        int choice=0;
        Scanner sc=new Scanner(System.in);
        do
        {
            try {
                System.out.println("*** Read The Url from file and Check the Occurence of each Word ***");
                System.out.println("Enter 1 for Read URL link from URL.txt file : ");
                System.out.println("Enter 2 for append the new link on that file :  ");

                System.out.println("Enter the Choice here");
                choice=sc.nextInt();
                switch(choice)
                {
                    case 1:
                        ReadURLContent r=new ReadURLContent();
                        r.readFileNames();
                        break;
                    case 2:
                        // Let us append given new_URL to URL.txt file
                        String fileName="URL.txt";

                        System.out.println("Enter the New URL link here : ");
                        Scanner s=new Scanner(System.in);
                        String new_url=s.next();

                        Append_link_on_Exisitng_File.appendStrToFile(fileName, new_url);
                        break;

                    default:
                        System.out.println("!! Wrong Choice Entered!");
                }
            }catch(NumberFormatException ex) {
                System.out.println("Please input a valid number....");
                ex.printStackTrace();
            }

        }while (choice!=3);
    }
}
