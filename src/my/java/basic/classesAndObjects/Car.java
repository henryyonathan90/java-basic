package my.java.basic.classesAndObjects;

/**
 * Created by henry.jonathan on 11/20/2017
 */
public class Car extends Vehicle implements Brakeable, Accelerateable {

  public int tankCapacity = 50;

  public Car() {
  }

  public Car(int tankCapacity) {
    this.tankCapacity = tankCapacity;
  }

  public void turnRight() {
    System.out.println("turnRight called");
  }

  public static void turnLeft() {
    System.out.println("turnLeft called");
  }

  @Override
  public void brake() {
    speed--;
  }

  @Override
  public void accelerate() {
    speed++;
  }
}
