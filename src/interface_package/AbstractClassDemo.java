package interface_package;

public class AbstractClassDemo {
  public static void main(String[] args) {
    Circle c = new Circle();
  }
}

abstract class Shape {
  abstract void method1();
  abstract void getArea();
}

class Circle extends Shape {

  @Override
  void method1() {

  }
  @Override
  void getArea() {

  }
}
