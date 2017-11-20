package my.java.basic.oop.itf;

import my.java.basic.oop.CarInterface;

/**
 * Created by henry.jonathan on 11/20/2017
 */
public class BrokenCar implements CarInterface {
  String color = "black";

  @Override
  public void accelerate(int increment) {
    //doNothing
  }
  @Override
  public void applyBrake(int decrement) {
    //doNothing
  }
  @Override
  public void changeGear(int gear) {
    //doNothing
  }
  @Override
  public void dye(String newColor) {
    this.color = newColor;
  }
  @Override
  public String returnState() {
    return "BrokenCar{" + "color='" + color + '\'' + '}';
  }
}
