package collection_framework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class HashSetEx {
  public static void main(String[] args) {
    Set<Person> s = new HashSet<>();

    s.add(new Person("Jake", 28));
    s.add(new Person("Kate", 31));
    s.add(new Person("Harry", 18));
    s.add(new Person("Tom", 22));
    s.add(new Person("Tom", 22));

    for (Person e: s) {
      System.out.println(e.name + " : " + e.age);
    }
    System.out.println(s.toString());
  }
}

class Person {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }


  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }
}
