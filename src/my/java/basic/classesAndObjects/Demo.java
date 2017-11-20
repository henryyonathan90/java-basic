package my.java.basic.classesAndObjects;


/**
 * Created by henry.jonathan on 11/20/2017
 */
public class Demo {
  public static void main(String[] args) {
    AClass object1 = new AClass(100);
    AClass object2 = new AClass(100);

    methodWithParam(object1, 50);
    methodWithParam(object2.aField, 50);

    System.out.println(object1.aField);
    System.out.println(object2.aField);
  }

  public static void methodWithParam(AClass obj, int newValue) {
    obj.aField = newValue;
  }

  public static void methodWithParam(int fieldValue, int newValue) {
    fieldValue = newValue;
  }

}

