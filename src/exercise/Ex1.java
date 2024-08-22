package exercise;

public class Ex1 {
  public static void main(String[] args) {
    Circle c = new Circle(5);
    ColoredCircle cc = new ColoredCircle(10, "Red");

    c.show();
    cc.show();
  }
}

class Circle {
  int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  void show() {
    System.out.println("반지름이 " + radius + "인 원인다");
  }
}

class ColoredCircle extends Circle {
  String color;

  public ColoredCircle(int radius, String color) {
    super(radius);
    this.color = color;
  }

  @Override
  void show() {
    System.out.println("반지름이 " + radius + "인 " + color + " 원이다");
  }
}
