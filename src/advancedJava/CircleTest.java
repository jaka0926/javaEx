package advancedJava;

import java.util.Objects;

public class CircleTest {
  public static void main(String[] args) {
    Circle c1 = new Circle(4);
    Circle c2 = new Circle(-1);

    if (c1.equals(c2)) {
      System.out.println("Circles are the same");
    }
    else {
      System.out.println("Circles are different");
    }
  }
}

class Circle {
  int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Circle) {
      return (this.radius == ((Circle) obj).radius);
    }
    return false;
  }
}


