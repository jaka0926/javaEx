package exercise;

public class Ex3_1 {
  public static void main(String[] args) {
    Line l1 = new Line(18);
    Line l2 = new Line(14);

    int comparison = l1.compareTo(l2);
    String result;

    switch (comparison) {
      case 1: result = l1.toString() + " is longer"; break;
      case -1: result = l2.toString() + " is longer"; break;
      case 0: result = "Lines are equal"; break;
      default: result = "Can't compare lines"; break;
    }
    System.out.println(result);
  }
}
