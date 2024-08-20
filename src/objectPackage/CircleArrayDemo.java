package objectPackage;

import java.util.Arrays;

public class CircleArrayDemo {
  public static void main(String[] args) {
    Circle[] circles = new Circle[5];
    System.out.println(circles.length);

    circles[0] = new Circle(3);
    circles[1] = new Circle(4);
    System.out.println(Arrays.toString(circles));

    for (Circle circle : circles) {
      if (circle == null) {
      }
      else {
        circle.printRadius();
//        circle.toString();
      }
    }
  }
}
