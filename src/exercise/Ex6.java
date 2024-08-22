package exercise;

import javax.swing.*;

public class Ex6 {
  public static void main(String[] args) {
    Car c = new Car("Black", 200, 1000, 5);
    System.out.println(c.show());

    Vehicle v = c;
    System.out.println(v.show());
  }
}

class Vehicle {
  String color;
  int speed;

  public Vehicle(String color, int speed) {
    this.color = color;
    this.speed = speed;
  }

  public String show() {
    return "Color: " + color + ", Speed: " + speed;
  }
}

class Car extends Vehicle{
  int displacement, gears;

  public Car(String color, int speed, int displacement, int gears) {
    super(color, speed);
    this.displacement = displacement;
    this.gears = gears;
  }

  @Override
  public String show() {
    return super.show() + ", Displacement: " + displacement + ", Gears: " + gears;
  }
}