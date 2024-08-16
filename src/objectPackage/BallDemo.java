package objectPackage;

public class BallDemo {
  public static void main(String[] args) {
    Ball myBall = new Ball();
    myBall.setRadius(1);
    System.out.println("공의 반지름은 " + myBall.getRadius());
    System.out.println("공의 부피는 " + myBall.getVolume());
  }
}

class Ball {
  private int radius = 1;


  public int getRadius() {
    return radius;
  }
  public void setRadius(int radius) {
    this.radius = radius;
  }
  public long getVolume() {
    return Math.round(4/(double)3 * Math.PI * radius * radius * radius);
  }
}

class Cylinder {

}
