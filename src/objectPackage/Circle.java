package objectPackage;

class Circle {
  // field - encapsulation
  private int radius;
  final double PI = 3.14;
  // method
  public Circle(int radius) {
    this.radius = radius;
  }
  public int getRadius() {
    return radius;
  }
  public void setRadius(int radius) {
    if (radius <= 0) {
      System.out.println("원의 반지름이 0보다 커야한다");
    }
    else {
      this.radius = radius;
    }
  }
  public void printRadius() {
    if (radius <= 0) {
      System.out.println("원의 반지름이 0보다 커야한다");
      return;
    }
    System.out.println("원의 반지름 " + radius);
  }
  public void printArea() {
    if (radius <= 0) {
      System.out.println("원의 반지름이 0보다 커야한다");
      return;
    }
      double area = PI * radius * radius;
      System.out.println("원의 넓이 " + area);
  }
}
