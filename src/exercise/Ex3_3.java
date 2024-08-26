package exercise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex3_3 {
  public static void main(String[] args) {
    Book[] books = {new Book(15000),
                    new Book(9800),
                    new Book(25100)
    };
    Arrays.sort(books);

    for (Book book: books) {
      System.out.println(book.toString());
    }
  }
}

class Book implements Comparable {
  int price;

  public Book(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Book[" +
        "price=" + price +
        ']';
  }

  public int compareTo(Object o) {
    if (o instanceof Book) {
      Book b = (Book) o;
      return this.price - b.price;
    }
    return -99999;
  }
}