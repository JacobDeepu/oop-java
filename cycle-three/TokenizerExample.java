import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenizerExample {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integers seperated by space");
        String integers = scanner.nextLine();
        scanner.close();
        StringTokenizer number = new StringTokenizer(integers, " ");
        System.out.print("Integers are: ");
        while(number.hasMoreTokens()){
            int num = Integer.parseInt(number.nextToken());
            sum += num;
            System.out.print(num + " ");
        }
        System.out.println("Sum: " + sum);
    }
}
