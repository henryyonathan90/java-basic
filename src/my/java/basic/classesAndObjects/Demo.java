package my.java.basic.classesAndObjects;


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

    //    assignNewValue(object1, 10);
    //    assignNewValue(object2, 10);
    //    System.out.println(object1 == object2);
    //    System.out.println(object1.equals(object2));
  }

  public static void assignNewValue(Car obj, int newValue) {
    obj.tankCapacity = newValue;
  }

  public static void assignNewValue(int fieldValue, int newValue) {
    fieldValue = newValue;
  }

}

