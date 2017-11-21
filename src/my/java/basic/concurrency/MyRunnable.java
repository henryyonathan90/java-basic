package my.java.basic.concurrency;

/**
 * Created by henry.jonathan on 11/21/2017
 */
public class MyRunnable implements Runnable {
  @Override
  public void run() {
    System.out.println("Hello from thread");
  }
}
