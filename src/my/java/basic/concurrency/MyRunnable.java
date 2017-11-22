package my.java.basic.concurrency;

/**
 * Created by henry.jonathan on 11/21/2017
 */
public class MyRunnable implements Runnable {
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + ": start");
    try {
      Thread.sleep(5000);
      System.out.println(Thread.currentThread().getName() + ": Hello from thread");
    } catch (InterruptedException ex) {
    }

    System.out.println(Thread.currentThread().getName() + ": finished");
  }
}
