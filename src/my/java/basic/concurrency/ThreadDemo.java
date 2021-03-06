package my.java.basic.concurrency;

/**
 * Created by henry.jonathan on 11/21/2017
 */
public class ThreadDemo {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName() + ": start");

    Thread t = new Thread(new MyRunnable());
    t.start();

    try {
      System.out.println(
          Thread.currentThread().getName() + ": Wait until " + t.getName() + " finished");
      t.join();
    } catch (InterruptedException ex) {
    }

    System.out.println(Thread.currentThread().getName() + ": finished");
  }
}
