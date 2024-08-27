package advancedJava;

import java.util.ArrayList;

public class GenericDemo4 {
  public static void main(String[] args) {
    ArrayList<Beverage> b = new ArrayList<>();
    b.add(new Beer());
    b.add(new Boricha());

    ArrayList<Beer> b1 = new ArrayList<>();
    b1.add(new Beer());
  }
}
