package interface_package;

abstract public class Controller {
  boolean power;
  abstract void show();
  abstract String getName();
}

class TV2 extends Controller {
  public TV2(boolean status) {
    power = status;
  }

  @Override
  public void show() {
    String status = power ? "ON" : "OFF";
    System.out.println(getName() + " is " + status);
  }

  @Override
  public String getName() {
    return "TV";
  }
}

class Radio extends Controller {
  public Radio(boolean status) {
    power = status;
  }

  @Override
  void show() {
    String status = power ? "ON" : "OFF";
    System.out.println(getName() + " is " + status);
  }

  @Override
  String getName() {
    return "Radio";
  }
}

