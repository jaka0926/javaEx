package advancedJava;

public class StringBuilderDemo {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    System.out.println(sb.capacity());
    for (int i = 0; i < 9; i++) {
      sb.append("A");
    }
    System.out.println(sb.toString());
    System.out.println(sb.length());
    System.out.println(sb.capacity());
  }
}
