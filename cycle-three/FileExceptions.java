import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileExceptions {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("input.txt");
            FileWriter fileWriter = new FileWriter("output.txt");
            int i;
            while ((i = fileReader.read()) != -1)
                fileWriter.write((char) i);
            fileReader.close();
            fileWriter.close();
            System.out.println("File Handling Sucessfull..");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
