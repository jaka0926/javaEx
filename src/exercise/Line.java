package exercise;

public class Line implements Comparable{
  int length;
  public Line(int length) {
    this.length = length;
  }

  @Override
  public int compareTo(Object o) {
    if (!(o instanceof Line)) {
      return 99;
    }
    else if (this.length > ((Line) o).length) {
      return 1;
    }
    else if (this.length < ((Line) o).length) {
      return -1;
    }
    else if (this.length == this.length) {
      return 0;
    }
    else { return 99; }
  }

  @Override
  public String toString() {
    return "Line{" +
        "length=" + length +
        '}';
  }
}


