import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadURLContent {

    public String PAGE_CONTENT;

    public void wordsRead(){
        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("C:\\Users\\Chetan\\Desktop\\Ass_1\\word.txt"));
            ArrayList<String> words = new ArrayList<>();

            String line = bufReader.readLine();
            while (line != null) {
                words.add(line);
                line = bufReader.readLine();
            }

            bufReader.close();
            for (String word : words) {
                countWord(PAGE_CONTENT, word);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // read url names from URL.txt and store them in a list then get the content of url through getUrlContents()
    public void readFileNames() {
        try {
            BufferedReader bReader = new BufferedReader(new FileReader("C:\\Users\\Chetan\\Desktop\\Ass_1\\URL.txt"));
            ArrayList<String> objlist = new ArrayList<>();

            String line = bReader.readLine();
            while (line != null)
            {
                objlist.add(line);
                line = bReader.readLine();
            }

            bReader.close();

            for (String fileName : objlist)
            {
                System.out.println(fileName);
                PAGE_CONTENT = getUrlContents(fileName);
                wordsRead();
                System.out.println("--------------------");

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Get the content of the url in a String format
    public static String getUrlContents(String file_URL) {
        StringBuilder content = new StringBuilder();
        try {
            URL u = new URL(file_URL);
            URLConnection urlConnection = u.openConnection();


            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                content.append(line + "\n");
            }
            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    public int countWord(String value, String findWord) {
        int counter = 0;
        while (value.contains(findWord)) {
            int index = value.indexOf(findWord);
            value = value.substring(index + findWord.length());
            counter++;
        }
        System.out.println(findWord + " - " + counter +" times" );
        return counter;
    }
}
