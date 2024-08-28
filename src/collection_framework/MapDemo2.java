package collection_framework;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapDemo2 {
  public static void main(String[] args) {
    Map<Fruit, Integer> fruits = new HashMap<>();
    fruits.put(new Fruit("Apple"), 5);
    fruits.put(new Fruit("Banana"), 5);
    fruits.put(new Fruit("Apple"), 5);
    System.out.println(fruits.size());
  }
}

class Fruit {
  String name;

  public Fruit(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }

  @Override
  public final boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Fruit fruit)) return false;

    return Objects.equals(name, fruit.name);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name);
  }
}