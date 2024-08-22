package exercise;

public class Ex5 {
  public static void main(String[] args) {

    Phone[] phones = {new Phone("Jaka"),
                      new Telephone("Jaka", "later"),
                      new SmartPhone("Jaka", "Valorant")};

    for (Phone element : phones) {
      if (element instanceof SmartPhone) {
        ((SmartPhone)element).playGame();
      }
      else if (element instanceof Telephone) {
        ((Telephone)element).autoAnswering();
      }
      else element.talk();
    }

  }
}

class Phone {
  protected String owner;

  public Phone(String owner) {
    this.owner = owner;
  }

  void talk() {
    System.out.println(owner + " is in another call");
  }
}

class Telephone extends Phone {
  private String when;

  public Telephone(String owner, String when) {
    super(owner);
    this.when = when;
  }

  void autoAnswering() {
    System.out.println(owner + " is not answering, please dial again " + when);
  }
}

class SmartPhone extends Phone {
  private String game;

  public SmartPhone(String owner, String game) {
    super(owner);
    this.game = game;
  }

  void playGame() {
    System.out.println(owner + " is playing " + game);
  }
}
