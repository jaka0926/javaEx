package intermediateJava;

public class Shape {

}

class Circle {
  int radius;

  public Circle(int radius) {
    this.radius = radius;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Circle) {
      return (this.radius == ((Circle) obj).radius) ? true : false;
    }
    return false;
  }
}

class Triangle {
  int height;
  int width;
  double area;

  public Triangle(int height, int width) {
    this.height = height;
    this.width = width;
    this.area = (double) height * width;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Triangle) {
      if (this.area == ((Triangle)obj).area) {
        return true;
      }
    }
    return false;
  }
}
