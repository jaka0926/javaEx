package interface_package;

public interface Human {
  void eat();
  static void echo() {
    System.out.println("YAHOO!");
  }
  default void print() {
    System.out.println("I am a HUMAN!");
  }
}

class Worker implements Human {
  @Override
  public void eat() {
    System.out.println("Worker eats lunch");
  }
}

class Student implements Human {
  private int age;
  public Student(int age) {
    this.age = age;
  }

  @Override
  public void print() {
    System.out.println("Im a " + age + " year old STUDENT");
  }

  @Override
  public void eat() {
    System.out.println("Student eats hotdog");
  }
}
