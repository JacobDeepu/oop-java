import java.util.*;

public class MatrixAddition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements of 1st matrix");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }

        }
        System.out.println("Enter number of elements of 2nd matrix");
        n = sc.nextInt();
        m = sc.nextInt();
        int b[][] = new int[n][m];
        System.out.println("Enter elemets");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = sc.nextInt();

            }
        }
        sc.close();
        System.out.println("Matrix A:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix B:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        int c[][] = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Matrix C:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}