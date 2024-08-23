package interface_package;

public class InterfaceDemo2 {
  public static void main(String[] args) {
    Class2 c2 = new Class2();
    c2.sayHello();
    c2.sayGoodbye();
    MyInterface.method();
  }
}

class Class2 implements MyInterface {
  @Override
  public void sayHello() {
    System.out.println("Hola!");
  }
}
