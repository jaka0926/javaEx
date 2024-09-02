package advancedJava2;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {
  public static void main(String[] args) {
    try {
      ServerSocket server = new ServerSocket(5000);
      Socket conn = server.accept();
      InputStream is = conn.getInputStream();
      ObjectInputStream ois = new ObjectInputStream(is);
      String msg = (String) ois.readObject();
      System.out.println("Received msg: " + msg);
    }
    catch (Exception e) {
    }
  }
}
