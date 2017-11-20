package my.java.basic.oop.inheritance;

/**
 * Created by henry.jonathan on 11/20/2017
 */
public class Car {
  int speed = 0;
  int gear = 1;
  String color = "black";

  void accelerate(int increment) {
    speed += increment;
  }

  void applyBrake(int decrement) {
    speed -= decrement;
    if (speed < 0) {
      speed = 0;
    }
  }

  void changeGear(int gear) {
    this.gear = gear;
  }

  void dye(String newColor) {
    this.color = newColor;
  }

  public String returnState() {
    return "BrokenCar{" + "speed=" + speed + ", gear="
        + gear + ", color='" + color + '\'' + '}';
  }
}
