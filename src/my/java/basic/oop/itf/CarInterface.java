package my.java.basic.oop;

/**
 * Created by henry.jonathan on 11/20/2017
 */
public interface CarInterface {

  void accelerate(int increment);

  void applyBrake(int decrement);

  void changeGear(int gear);

  void dye(String newColor);

  String returnState();
}
