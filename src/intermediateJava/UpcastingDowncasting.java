package intermediateJava;

public class UpcastingDowncasting {
  public static void main(String[] args) {

    PersonClass s = (PersonClass) new Student();

  }
}

class PersonClass {
  String name = "사람";
  void whoAmI() {
    System.out.println("나는 사람이다");
  }
}

class Student extends PersonClass {
  int number = 7;
  void study() {
    System.out.println("나는 공부한다");
  }
}