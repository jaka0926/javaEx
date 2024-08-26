package advancedJava;

import java.util.StringTokenizer;

public class UncheckedDemo1 {
  public static void main(String[] args) {
    String s = "Time is money";
    StringTokenizer st = new StringTokenizer(s);

    while(st.hasMoreElements()) {
      System.out.println(st.nextElement());
    }
  }
}
