import java.sql.*;

public class Record {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/posty", "root", "root");
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM posts");
            while(resultSet.next()){
                System.out.println(resultSet.getInt(1) + " " + resultSet.getInt(2) + " " + resultSet.getString(3));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
