import java.io.FileReader;

public class Count {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("output.txt");
            int i, c = 0, line = 1, word = 0;
            while ((i = fileReader.read()) != -1) {
                c++;
                if ((char) i == '\n')
                    line++;
                if ((char) i == ' ')
                    word++;
            }
            fileReader.close();
            System.out.println("Number of Characters: " + c);
            System.out.println("Number of Lines: " + line);
            System.out.println("Number of Words: " + word);
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}
