package intermediateJava;

public class TypeCastingDemo2 {
  public static void main(String[] args) {
    Animal[] animals = new Animal[2];
    animals[0] = new Cat();
    animals[1] = new Dog();

    for (Animal e: animals)
      e.whoami();
  }
}

class Animal {
  void whoami() {
    System.out.println("I am an Animal");
  }
}

class Cat extends Animal {

}

class Dog extends Animal {
  void whoami() {
    System.out.println("I am a Dog!");
  }
}
