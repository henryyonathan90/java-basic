package my.java.basic.exceptionHandling;

/**
 * Created by henry.jonathan on 11/21/2017
 */
public class ExceptionDemo {
  public static void main(String[] args) {
    methodA();
  }

  public static void methodA() {
    methodB();
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
