package objectPackage;

public class PersonDemo {
  public static void main(String[] args) {
    Person user1 = new Person("Jaka", 28);

    // Since each method returns [Class Type] it can be written continuously like below
    user1.setName("BroCode").setNat("Mongolian").setAddress("").sayHello();
    Person user2 = new Person("Zaya", 25);
    user2.setName("Rando").setNat("").setAddress("").sayHello();
  }
}

class Person {
  private String name;
  private int age;
  private String nationality;
  private String address;

  Person(String name, int age) { // Class initializer
    this.name = name;
    this.age = age;
    setNat(null);
    setAddress(null);
  }
  public void sayHello() {
    System.out.printf("Name: %s\nAge: %d\nNationality: %s\nAddress: %s\n\n", name, age, nationality, address);
  }
  public Person setNat(String nat) {
    if (nat == null || nat.isEmpty()) {
      this.nationality = "Korean";
    }
    else this.nationality = nat;
    return this;
  }
  public Person setAddress(String address) {
    if (address == null || address.isEmpty()) {
      this.address = "Seoul";
    }
    else this.address = address;
    return this;
  }

  public String getName() {
    return name;
  }
  public Person setName(String name) {
    this.name = name;
    return this;
  }
  public int getAge() {
    return age;
  }
  public Person setAge(int age) {
    this.age = age;
    return  this;
  }
}
