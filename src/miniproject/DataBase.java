package miniproject;

import java.sql.*;

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

  public static String getMemberInfo(Connection conn, String pNumber) {
    String sql = "select point from member where p_number = ?;";

    try {
      PreparedStatement ps = conn.prepareStatement(sql);
      ps.setString(1, pNumber);
      ResultSet rs = ps.executeQuery();

      if (rs.next()) {  // Move cursor to the first row
        return rs.getString(1);  // Get the value of the first column (point)
      } else return null;

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
