import java.io.FileReader;

public class FileWriter {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("output.txt");
            int i, line = 0;
            System.out.print(++line + ". ");
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);
                if ((char) i == '\n')
                    System.out.print(++line + ". ");
            }
            fileReader.close();
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
