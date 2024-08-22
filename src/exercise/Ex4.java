package exercise;

public class Ex4 {
  public static void main(String[] args) {
    Parent p = new Child();
    System.out.println(p.name);
    p.print();
  }
}

class Parent {
  String name = "Parent";

  void print() {
    System.out.println("I am " + name);
  }
}

class Child extends Parent {
  String name = "Child";

  @Override
  void print() {
    System.out.println("I am " + name);
  }
}