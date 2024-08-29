package advancedJava2;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class CarDemo {
  public static void main(String[] args) {
    Car car = new Car("Tesla", false, 2, 31_000);
    System.out.println(car);
    System.out.println(Car.cars.get(0));
    int cnt = 0;
    for (Car el : Car.cars) {

      if (el.getModel().equals("소나타")) {
        cnt++;
      }
    }
    System.out.println(cnt + " sonatas");

    Collections.sort(Car.cars, (car1, car2) -> car1.getAge() - car2.getAge());
//        new Comparator<Car>() {
//      @Override
//      public int compare(Car o1, Car o2) {
//        return o1.getAge() - o2.getAge();
//      }
//    });

    Collections.sort(Car.cars, (car1, car2) -> car1.getMileage() - car2.getMileage());
    Comparator<Car> modelComparator = Comparator.comparing(Car::getModel);
    Collections.sort(Car.cars, modelComparator);

    for (Car el : Car.cars) {
      System.out.println(el);
    }
  }
}
