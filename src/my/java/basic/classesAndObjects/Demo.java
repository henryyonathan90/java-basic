package my.java.basic.classesAndObjects;


import my.java.basic.classesAndObjects.practice.Day;
import my.java.basic.classesAndObjects.practice.Month;

/**
 * Created by henry.jonathan on 11/20/2017
 */
public class Demo {
  public static void main(String[] args) {
    Car object1 = new Car(100);
    Car object2 = new Car(100);

    assignNewValue(object1, 50);
    assignNewValue(object2.tankCapacity, 50);

    System.out.println(object1.tankCapacity);
    System.out.println(object2.tankCapacity);

    Month month = Month.DECEMBER;
    System.out.println(month.name());
  }

  public static void assignNewValue(Car obj, int newValue) {
    obj.tankCapacity = newValue;
  }

  public static void assignNewValue(int fieldValue, int newValue) {
    fieldValue = newValue;
  }

}

