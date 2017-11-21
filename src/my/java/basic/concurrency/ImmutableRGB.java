package my.java.basic.concurrency;

/**
 * Created by henry.jonathan on 11/21/2017
 */
public class ImmutableRGB {
  final private int red;
  final private int green;
  final private int blue;
  final private String name;

  private void check(int red, int green, int blue) {
    if (red < 0 || red > 255 || green < 0 || green > 255 || blue < 0 || blue > 255) {
      throw new IllegalArgumentException();
    }
  }

  public ImmutableRGB(int red, int green, int blue, String name) {
    check(red, green, blue);
    this.red = red;
    this.green = green;
    this.blue = blue;
    this.name = name;
  }

  @Override
  public String toString() {
    return "ImmutableRGB{" + "red=" + red + ", green=" + green + ", blue=" + blue + ", name='"
        + name + '\'' + '}';
  }
}