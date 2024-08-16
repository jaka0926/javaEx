package objectPackage;

public class CopyDemo {
  public static void main(String[] args) {
    Circle c1 = new Circle(2);
    Circle c2 = new Circle(3);

    System.out.println(c1.getRadius()); // 5
    System.out.println(c2.getRadius()); // 8

    c2 = c1;
    System.out.println(c1.getRadius()); // 5
    System.out.println(c2.getRadius()); // 5 since c2 is referencing c1


  }
}
