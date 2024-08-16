package objectPackage;

public class ColoredCircleDemo {
  public static void main(String[] args) {

    ColoredCircle cc1 = new ColoredCircle();
    System.out.printf("Circle1 is %s and its radius is %d\n", cc1.color, cc1.radius);

    ColoredCircle cc2 = new ColoredCircle(null);
    System.out.printf("Circle2 is %s and its radius is %d\n", cc2.color, cc2.radius);

    System.out.println("Number of Circles " + ColoredCircle.numOfCircles);

    ColoredCircle cc3 = new ColoredCircle(0);
    System.out.printf("Circle3 is %s and its radius is %d\n", cc3.color, cc3.radius);

    ColoredCircle cc4 = new ColoredCircle(5, null);
    System.out.printf("Circle4 is %s and its radius is %d\n", cc4.color, cc4.radius);

    System.out.println("Number of Circles " + ColoredCircle.numOfCircles);
    System.out.println(ColoredCircle.numOfCircles);
    System.out.println(cc1.numOfCircles); // Can also be accessed through instances
  }
}

class ColoredCircle {
  int radius = 1;
  String color;
  static int numOfCircles = 0;

  public ColoredCircle() {
    color = "White";
    numOfCircles++;
  }
  public ColoredCircle(String color) {
    this(1, color);
  }
  public ColoredCircle(int r) {
    this(r, "White");
  }
  public ColoredCircle(int r, String color) {
    this.radius = r > 0 ? r : 1;
    this.color = ((color == null) || color.isEmpty()) ? "White" : color;
    numOfCircles++;
  }
  public void setColor(String color) { //instance method
    this.color = color;
  }
}