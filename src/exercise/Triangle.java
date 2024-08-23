package exercise;

public class Triangle implements Comparable {
  int length, width, area;

  public Triangle(int length, int width) {
    this.length = length;
    this.width = width;
    this.area = length * width;
  }

  @Override
  public int compareTo(Object o) {
    if (!(o instanceof Triangle)) {
      return 99;
    }
    else if (this.area > ((Triangle) o).area) {
      return 1;
    }
    else if (this.area < ((Triangle) o).area) {
      return -1;
    }
    else if (this.area == ((Triangle) o).area) {
      return 0;
    }
    else {
      return 99;
    }
  }

  @Override
  public String toString() {
    return "Triangle{" +
        "length=" + length +
        ", width=" + width +
        ", area=" + area +
        '}';
  }
}
