package advancedJava;

public class TestStudent {
  public static void main(String[] args) {
    System.out.println(new Student("Jim"));
    System.out.println(new Student("Casper"));
  }
}

class Student {
  String name;

  public Student(String name) {
    this.name = name;
    toString();
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        '}';
  }
}
