package interface_package;

public class InterfacePractice1 {
  public static void main(String[] args) {
    Talkable[] languages = {new Korean(), new American()};

    for (Talkable e : languages) {
      e.talk();
    }
  }
}
