package advancedJava2;

import java.sql.*;
import java.util.Scanner;

public class DBDemo4 {
  public static void main(String[] args) throws SQLException {
    Connection conn = makeConnection();
    getPersonInfos(conn);
  }

  public static void getPersonInfos(Connection conn) throws SQLException {
    String sql = "select * from person where phone = ?;";
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter phone number: ");
    String pNum = scanner.nextLine();
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, pNum);
    ResultSet rs = ps.executeQuery();
    while (rs.next()) {
      System.out.println(rs.getString(1) + ", " + rs.getString(2) + ", " + rs.getString(3));
    }
    rs.close();
  }

  public static Connection makeConnection() throws SQLException {
    String url = "jdbc:mysql://localhost/javaex?serverTimezone=Asia/Seoul";
    Connection conn = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("Database connecting...");
      conn = DriverManager.getConnection(url, "root", "1234");
      System.out.println("Database connection successful");
    }
    catch (ClassNotFoundException e) {
      System.out.println("JDBC driver search error");
    }
    catch (SQLException e) {
      System.out.println("Database connection failed");
    }
    return conn;
  }
}
