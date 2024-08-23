package exercise;

public class Ex3_2 {
  public static void main(String[] args) {

    Triangle t1 = new Triangle(10,2);
    Triangle t2 = new Triangle(5,4);

    int comparison = t1.compareTo(t2);
    System.out.println(t1.area);
    System.out.println(t2.area);
    String result;

    switch (comparison) {
      case 1: result = t1.toString() + " is bigger"; break;
      case -1: result = t2.toString() + " is bigger"; break;
      case 0: result = "Triangle areas are equal"; break;
      default: result = "Can't compare triangles"; break;
    }
    System.out.println(result);
  }
}
