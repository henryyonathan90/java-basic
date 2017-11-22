package my.java.basic.concurrency;

/**
 * Created by henry.jonathan on 11/21/2017
 */
public class MyRunnable implements Runnable {
  @Override
  public void run() {
    try {
      Thread.sleep(2000);
      System.out.println("Hello from thread");
    } catch (InterruptedException ex) {
    }

  }
}
