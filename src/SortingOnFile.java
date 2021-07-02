import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class SortingOnFile {
    void sortElement(String filename, String tofilename) throws Exception{
        Path path= Paths.get(filename);
        Charset charset=Charset.forName("UTF-8");

        List<String> lines= Files.readAllLines(path,charset);
        Collections.sort(lines);

        Path topath=Paths.get(tofilename);
        Files.write(topath,lines,charset);
    }

    public static void main(String[] args) throws Exception
    {
        new SortingOnFile().sortElement("C:\\Users\\Chetan\\IdeaProjects\\Assi_3\\text1.txt",
                "C:\\Users\\Chetan\\IdeaProjects\\Assi_3\\Sorted_text_file");
    }
}
