package miniproject;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;

public class DataBase {

  public static void addNewMember(Connection conn, String name, String pNumber) {
    String sql = "INSERT INTO `cafe`.`member` (`name`, `p_number`) VALUES (?, ?);";
    try {
      PreparedStatement ps = conn.prepareStatement(sql);
      ps.setString(1, name);
      ps.setString(2, pNumber);
      ps.executeUpdate();
    }
    catch (SQLException e) {
      System.out.println("SQL error while running");
    }
  }

  public static ArrayList<String> getMemberInfo(Connection conn, String pNumber) {
    String sql = "select name, point from member where p_number = ?;";
    ArrayList<String> result = new ArrayList<>();
    try {
      PreparedStatement ps = conn.prepareStatement(sql);
      ps.setString(1, pNumber);
      ResultSet rs = ps.executeQuery();

      if (!rs.next()) {
        return null;
      }

      else {  // Move cursor to the first row
        result.add(rs.getString(1));// Get the value of the first column (point)
        result.add(rs.getString(2));
      }
      return result;
    }
    catch (SQLException e) {
      System.out.println("SQL error while running");
      return null;
    }
  }

  public static Connection makeConnection() throws SQLException {
    String url = "jdbc:mysql://localhost/cafe?serverTimezone=Asia/Seoul";
    Connection conn = null;
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      System.out.println("Database connecting...");
      conn = DriverManager.getConnection(url, "root", "1111");
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
