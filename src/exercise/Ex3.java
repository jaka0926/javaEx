package exercise;

public class Ex3 {
  public static void main(String[] args) {
    Person[] list = new Person[3];
    list[0] = new Person("자카", 18);
    list[1] = new Student("가나", 20, 20432450);
    list[2] = new ForeignStudent("Joker", 28, 1231354, "Spanish");

    for (Person e : list) {
      System.out.println("사람[" + e.show() + "]");
    }
  }
}

class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {return name;}
  public void setName(String name) {this.name = name;}
  public int getAge() {return age;}
  public void setAge(int age) {this.age = age;}

  public String show() {
    return "이름: " + name + ", 나이: " + age;
  }
}

class Student extends Person {
  long studentId;

  public Student(String name, int age, long studentId) {
    super(name, age);
    this.studentId = studentId;
  }

  @Override
  public String show() {
    return super.show() + " 학번: " + studentId;
  }
}

class ForeignStudent extends Student {
  String nationality;

  public ForeignStudent(String name, int age, long studentId, String nationality) {
    super(name, age, studentId);
    this.nationality = nationality;
  }

  @Override
  public String show() {
    return super.show() + " 국적: " + nationality;
  }
}
