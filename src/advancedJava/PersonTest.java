package advancedJava;

public class PersonTest {
  public static void main(String[] args) {
    Person p1 = new Person(123456, "Mike");
    Person p2 = new Person(123456, "John");
    Person p3 = new Person(164655, "Mike");

    if (p1.equals(p3)) {
      System.out.println("Same person");
    }
    else {
      System.out.println("Different people");
    }
  }
}

class Person {
  int id;
  String name;

  public Person(int id, String name) {
    this.id = id;
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      System.out.println("Same class");
      return true;
    }
    if (o == null || getClass() != o.getClass()) return false;

    Person person = (Person) o;
    if (id == person.id && name.equals(person.name)) {
      System.out.println("Same values");
      return true;
    }
    return false;
  }
}
