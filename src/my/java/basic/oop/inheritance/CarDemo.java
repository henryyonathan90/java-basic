package my.java.basic.oop.inheritance;

/**
 * Created by henry.jonathan on 11/20/2017
 */
public class CarDemo {
  public static void main(String[] args) {
    Car hisCar = new Car();
    Car herCar = new Car();

    hisCar.dye("red");
    hisCar.accelerate(20);
    hisCar.changeGear(2);
    hisCar.accelerate(40);
    hisCar.changeGear(3);
    hisCar.accelerate(60);

    herCar.dye("pink");
    herCar.accelerate(20);
    herCar.changeGear(2);
    herCar.accelerate(40);

    System.out.println("hisCar: " + hisCar.returnState());
    System.out.println("herCar: " + herCar.returnState());
  }
}

