package interface_package;

public class AbstractClassPractice {
  public static void main(String[] args) {
    Controller[] c = {new TV2(true), new Radio(false)};

    for (Controller e : c) {
      e.show();
    }
  }
}
