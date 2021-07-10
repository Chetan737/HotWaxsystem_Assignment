import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Append_link_on_Exisitng_File {

    public static void appendStrToFile(String fileName,
                                       String str)
    {
        try {
            // Open given file in append mode.
            BufferedWriter out = new BufferedWriter(
                    new FileWriter(fileName, true));
            out.write(str);
            out.close();
        }
        catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
    }
}
