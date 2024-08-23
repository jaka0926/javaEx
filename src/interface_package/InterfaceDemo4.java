package interface_package;

public class InterfaceDemo4 {
  public static void main(String[] args) {

    Controllable[] controllables = {new TV(), new Computer()};

    for (Controllable e : controllables) {
      e.turnOn();
      e.turnOff();
      e.repair();
      System.out.println();
    }
    Controllable.reset();
  }
}
