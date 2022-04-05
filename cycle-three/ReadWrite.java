import java.io.FileReader;
import java.io.FileWriter;

public class ReadWrite {
    public static void main(String[] args) {
        try {
            String str = "File Handling in Java example ";
            FileWriter fileWriter = new FileWriter("output.txt");
            fileWriter.write(str);
            fileWriter.close();
            FileReader fileReader = new FileReader("output.txt");
            int i;
            while ((i = fileReader.read()) != -1)
                System.out.print((char) i);
            fileReader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}