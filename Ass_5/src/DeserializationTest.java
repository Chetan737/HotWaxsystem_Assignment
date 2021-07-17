import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationTest {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Chetan\\Desktop\\Ass_5\\output.ser";
        deserializeObject(fileName);
    }

    private static void deserializeObject(String fileName) {
        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File(fileName)))) {
            Object object = objectInputStream.readObject();
            Student student=(Student) object;
            System.out.println(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
