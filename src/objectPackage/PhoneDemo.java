package objectPackage;

public class PhoneDemo {
  public static void main(String[] args) {
    Phone p1 = new Phone();
    p1.setModel("iPhone 16");
    p1.setPrice(2_586_000);
    p1.print();
    Phone p2 = new Phone();
    p2.setModel("Galaxy Z Fold 6");
    p2.setPrice(2_320_000);
    p2.print();
  }
}
