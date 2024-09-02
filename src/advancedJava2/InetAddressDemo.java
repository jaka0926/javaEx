package advancedJava2;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressDemo {
  public static void main(String[] args) throws UnknownHostException {
    InetAddress add1 = null, add2 = null;
    Scanner in = new Scanner(System.in);

    System.out.println("Enter host name");
    String url = in.nextLine();

    add1 = InetAddress.getByName(url);
    add2 = InetAddress.getLocalHost();

    System.out.println(add1.getHostAddress());
    System.out.println(add2.getHostAddress());
  }
}
