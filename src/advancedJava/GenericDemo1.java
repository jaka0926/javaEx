package advancedJava;

public class GenericDemo1 {
  public static void main(String[] args) {
    BorichaCup cupBoricha = new BorichaCup();
    cupBoricha.setBeverage(new Boricha());
    Object beverage = cupBoricha.getBeverage();

    BeerCup beerCup = new BeerCup();
    beerCup.setBeverage(new Beer());
    Object beverage2 = beerCup.getBeverage();
    System.out.println(((Boricha) beverage).name);
  }
}

class Beverage {}

class Boricha extends Beverage {
  public String name = "보리차";
}
class Beer extends Beverage {
  public String name = "맥주";
}

class BeerCup {
  private Object beverage;

  public Object getBeverage() {
    return beverage;
  }

  public void setBeverage(Object beverage) {
    this.beverage = beverage;
  }
}

class BorichaCup {

  private Object beverage;

  public Object getBeverage() {
    return beverage;
  }

  public void setBeverage(Object beverage) {
    this.beverage = beverage;
  }
}
