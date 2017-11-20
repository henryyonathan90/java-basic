package my.java.basic.classesAndObjects;

/**
 * Created by henry.jonathan on 11/20/2017
 */
public class AClass extends ParentClass implements Interface1, Interface2 {
  public int aField = 0;

  public AClass() {
  }

  public AClass(int aField) {
    this.aField = aField;
  }

  public void method1() {
    System.out.println("method1 called");
  }

  public static void method2() {
    System.out.println("method2 called");
  }

  @Override
  public void methodInterface1() {

  }

  @Override
  public void methodInterface2() {

  }
}
