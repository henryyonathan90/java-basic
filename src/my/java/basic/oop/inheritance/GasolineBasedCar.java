package my.java.basic.oop.inheritance;

/**
 * Created by henry.jonathan on 11/20/2017
 */
public class GasolineBasedCar extends Car {

  int fuel = 20;

  void rechargeFuel(int quantity) {
    fuel += quantity;
  }
}
