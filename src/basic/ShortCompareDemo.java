package basic;

public class ShortCompareDemo {
  public static void main(String[] args) {
    String s1 = new String("hello");
    String s2 = new String("hello");

//    s1.equals(s2);
//    s1 = s2;

    if (s1 != null && s1.equals(s2)) {
      System.out.println("Two strings are equal");
    }
    else {
      System.out.println(s1.equals(s2));
    }
  }
}
