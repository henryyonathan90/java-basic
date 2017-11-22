package my.java.basic.classesAndObjects.practice;

/**
 * Created by henry.jonathan on 11/22/2017
 */
public class Rectangle {
  private int width;
  private int height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int area() {
    return width * height;
  }

  public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(10, 50);
    System.out.println(rectangle.area());
  }
}
