package my.java.basic.exceptionHandling;

/**
 * Created by henry.jonathan on 11/21/2017
 */
public class TryCatchDemoUncheckedException {
  public static void main(String[] args) {
    methodA();
  }

  public static void methodA() {
    try {
      methodB();
    } catch (Exception ex) {
      System.out.println("Exception catched");
    }
  }

  public static void methodB() {
    methodC();
  }

  public static void methodC() {
    int a = 1;
    int b = 0;
    int c = a / b;
  }
}
