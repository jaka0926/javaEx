package advancedJava;

public class GenericDemo3 {
  public static void main(String[] args) {
  Entry<String, Integer> e = new Entry<>("Jaka", 20);
  Entry<String, String> e1 = new Entry<>("Rando", "Kraken");
  Entry<Integer, String> e2 = new Entry<>(51, "Kraken");

    System.out.println(e.getName());
    System.out.println(e1.getName());
    System.out.println(e2.getName());
  }
}

class Entry<K, V> {
  private K name;
  private V age;

  public Entry(K name, V age) {
    this.name = name;
    this.age = age;
  }

  public K getName() {
    return name;
  }

  public void setName(K name) {
    this.name = name;
  }

  public V getAge() {
    return age;
  }

  public void setAge(V age) {
    this.age = age;
  }
}
