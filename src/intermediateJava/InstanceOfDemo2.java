package intermediateJava;

public class InstanceOfDemo2 {
  public static void main(String[] args) {
//    Circle c1 = new Circle(4);
//    Circle c2 = new Circle(4);
//    Circle c3 = new Circle(6);
//    System.out.println(c1 instanceof Circle);
//    System.out.println(c1.equals(c2));
//    System.out.println(c2.equals(c3));

    Triangle t1 = new Triangle(2, 5);
    Triangle t2 = new Triangle(5, 2);
    Triangle t3 = new Triangle(1, 10);

    System.out.println(t1.equals(t2));
    System.out.println(t1.equals(t3));
  }
}

