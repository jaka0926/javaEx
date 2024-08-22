package intermediateJava;

import org.w3c.dom.TypeInfo;

import java.lang.invoke.SwitchPoint;

public class TypeCastingDemo {
  public static void main(String[] args) {

    Vehicle myCar = new Car();
    System.out.println(myCar.name);
    myCar.whoami();
    myCar.move();

    System.out.println();
    Car c = new Car();
    System.out.println(c.name);
    c.whoami();
    c.move();

    System.out.println();
    SportsCar s = new SportsCar();
    System.out.println(s.name);
    s.whoami();
    s.equal();
    s.move();
  }
}

class Vehicle {
  String name = "차량";
  void whoami() {
    System.out.println("나는 차량이다");
  }
  static void move() {
    System.out.println("차량 이동");
  }
}

class Car extends Vehicle {
  String name = "자동차";

  @Override
  void whoami() {
    System.out.println("나는 자동차다");
  }

  static void move() {
    System.out.println("자동차 이동");
  }
}

class SportsCar extends Vehicle {
  String name = "스포츠카";

  @Override
  void whoami() {
    System.out.println("나는 스포츠카다");
  }
  static void move() {
    System.out.println("스포츠카 달림");
  }

  void equal() {
    System.out.println("나의 이름: " + this.name);
    System.out.println("부모의 이름: " + super.name);
  }
}