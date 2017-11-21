package my.java.basic.exceptionHandling;

/**
 * Created by henry.jonathan on 11/21/2017
 */
public class TryCatchDemoCheckedException {
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

  public static void methodB() throws Exception {
    methodC();
  }

  public static void methodC() throws Exception {
    throw new Exception();
  }
}
