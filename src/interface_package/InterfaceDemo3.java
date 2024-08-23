package interface_package;

public class InterfaceDemo3 {
  public static void main(String[] args) {
    TV tv = new TV();
    tv.turnOn();
    tv.turnOff();
    tv.repair();
    Controllable.reset();

    System.out.println();
    Computer com = new Computer();
    com.turnOn();
    com.turnOff();
    com.repair();

  }
}