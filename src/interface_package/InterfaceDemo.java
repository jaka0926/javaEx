package interface_package;

public class InterfaceDemo {
  public static void main(String[] args) {
    Class1 c1 = new Class1();
    c1.sayHello();
    c1.sayGoodbye();
  }
}

class Class1 implements MyInterface {
  @Override
  public void sayHello() {
    System.out.println("Hello!");
  }
}
