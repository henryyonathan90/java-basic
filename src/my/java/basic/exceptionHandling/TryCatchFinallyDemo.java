package my.java.basic.exceptionHandling;

/**
 * Created by henry.jonathan on 11/21/2017
 */
public class TryCatchFinallyDemo {
  public static void main(String[] args) {
    methodA();
  }

  public static void methodA() {
    try {
      methodB();
    } catch (ArithmeticException e) {
      System.out.println("ArithmeticException caught");
    } catch (RuntimeException ex) {
      System.out.println("RuntimeException caught");
    } finally {
      System.out.println("I will run no matter what");
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
