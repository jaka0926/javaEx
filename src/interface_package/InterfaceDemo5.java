package interface_package;

public class InterfaceDemo5 {
  public static void main(String[] args) {
    Animal rex = new Dog();
    Animal coco = new Cuckoo();

    makeSound(rex);
    makeSound(coco);
  }

  public static void makeSound(Animal animal) {
    animal.sound();
    if (animal instanceof Dog) {
      ((Dog) animal).eat();
    }
  }
}

