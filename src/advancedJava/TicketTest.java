package advancedJava;

public class TicketTest {
  public static void main(String[] args) {
    Ticket[] a = {
      new Ticket(1000),
      new Ticket(2000),
      new Ticket(3000),
    };
    System.out.println(countGT(a, a[0]));
  }

  public static <T extends Comparable> int countGT(T[] arr, T e) {

    int count = 0;
    for (T element: arr) {
      if (element.compareTo(e) > 0) {
        count++;
      }
    }
    return count;
  }
}

class Ticket implements Comparable {
  int price;

  public Ticket(int price) {
    this.price = price;
  }

  @Override
  public int compareTo(Object o) {
    if (o instanceof Ticket) {
      Ticket t = (Ticket) o;
      return this.price - t.price;
    }
    return -999;
  }
}
