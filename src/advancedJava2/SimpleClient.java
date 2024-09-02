package advancedJava2;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class SimpleClient {
  public static void main(String[] args) {
    try {
      Socket client = new Socket("localHost", 5000);
      OutputStream os = client.getOutputStream();
      ObjectOutputStream oos = new ObjectOutputStream(os);
      for (int i = 0; i < 3; i++) {
        oos.writeObject("Hi server!!");
      }
      oos.flush();
    }
    catch (IOException e) {
      throw new RuntimeException(e);
    }
  }
}
