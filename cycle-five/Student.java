import java.sql.*;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "root");
            PreparedStatement preparedStatement = con
                    .prepareStatement("INSERT INTO data (rollno, name, cgpa) VALUES (?,?,?)");
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Enter Roll No: ");
                int roll = scanner.nextInt();
                preparedStatement.setInt(1, roll);

                System.out.println("Enter Name: ");
                String name = scanner.next();
                preparedStatement.setString(2, name);

                System.out.println("Enter CGPA: ");
                double cgpa = scanner.nextDouble();
                preparedStatement.setDouble(3, cgpa);

                int result = preparedStatement.executeUpdate();
                if (result > 0)
                    System.out.println("Records inserted successfully.");

                System.out.println("Do you want to continue ?(y/n)");
                if (scanner.next().equals("n"))
                    break;
            } while (true);
            scanner.close();

            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM data WHERE cgpa > 7");
            while (resultSet.next())
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getDouble(3));
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
