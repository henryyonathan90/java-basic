package my.java.basic.concurrency;

/**
 * Created by henry.jonathan on 11/21/2017
 */
public class ThreadDemoInterrupted {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName() + ": start");

    Thread t = new Thread(new InterruptedRunnable());
    t.start();

    try {
      System.out.println(
          Thread.currentThread().getName() + ": I'll sleep 5 sec then interrupt " + t.getName());
      Thread.sleep(5000);
      t.interrupt();
      t.join();
    } catch (InterruptedException ex) {
    }

    System.out.println(Thread.currentThread().getName() + ": finished");
  }
}
