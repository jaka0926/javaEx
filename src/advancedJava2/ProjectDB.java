package advancedJava2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProjectDB {

  public static void main(String[] args) throws SQLException {
    Connection conn = makeConnection();
    createNewMember(conn);
  }

  public static Connection makeConnection() {
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
      System.out.println(e.getMessage());
      System.out.println("Database connection failed");
    }
    return conn;
  }

  private static void createNewMember(Connection conn) throws SQLException {
    String sql = "insert into member (name, p_number) values (?, ?);";
    PreparedStatement ps = conn.prepareStatement(sql);
    ps.setString(1, "Jackie Chan");
    ps.setString(2, "010-1111-1111");
    int result = ps.executeUpdate();
    if (result == 0) {
      System.out.println("Data was not added");
    }
    else {
      System.out.println(result + " number of data added");
    }
  }
}

