package advancedJava2;

import java.sql.*;

public class DBDemo {
  public static void main(String[] args) throws SQLException {
    Connection conn = makeConnection();
//    createNewPerson(conn);
//    changeEmail(conn);
    removePersonInfo(conn);
  }

  public static Connection makeConnection() {
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

  private static void createNewPerson(Connection conn) throws SQLException {
    String sql = "insert into person (name, phone, email) values (?, ?, ?);";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, "Kim");
    ps.setString(2, "010-4444-5555");
    ps.setString(3, "Kim@naver.com");
    int result = ps.executeUpdate();
    if (result == 0) {
      System.out.println("Data was not added");
    }
    else {
      System.out.println(result + " number of data added");
    }
  }

  private static void changeEmail(Connection conn) throws SQLException {
    String sql = "update person set email = ? where phone = ?";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, "changed@c.com");
    ps.setString(2, "010-4444-5555");
    int result = ps.executeUpdate();
    if (result == 0) {
      System.out.println("Data was not updated");
    }
    else {
      System.out.println(result + " number of data updated");
    }
  }

  private static void removePersonInfo(Connection conn) throws SQLException {
    String sql = "delete from person where phone = ?";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, "010-4444-5555");
    int result = ps.executeUpdate();
    if (result == 0) {
      System.out.println("Data was not deleted");
    }
    else {
      System.out.println(result + " number of data deleted");
    }
  }
}
