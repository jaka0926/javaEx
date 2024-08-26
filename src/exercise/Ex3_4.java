package exercise;

import java.util.Arrays;
import java.util.Collections;

public class Ex3_4 {
  public static void main(String[] args) {
    PersonClass[] people = {
      new PersonClass("Jaka", 31,188,75),
      new PersonClass("Shroud", 18,168,71),
      new PersonClass("Frank", 22,188,65)
    };

    for (PersonClass person: people) {
      System.out.println(person.toString());
    }
  }
}

class PersonClass implements Comparable {
  String name;
  int age, height, weight;

  public PersonClass(String name, int age, int height, int weight) {
    this.name = name;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  @Override
  public String toString() {
    return "PersonClass{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", height=" + height +
        ", weight=" + weight +
        '}';
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof PersonClass) {
      PersonClass p = (PersonClass) o;
      return p.age - this.age;
    }
    return 0;
  }
}