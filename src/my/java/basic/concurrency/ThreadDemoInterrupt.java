package my.java.basic.concurrency;

/**
 * Created by henry.jonathan on 11/21/2017
 */
public class ThreadDemoInterrupt {
  public static void main(String[] args) {
    Thread thread = new Thread(new InterruptedRunnable());
    thread.start();

    try {
      Thread.sleep(5000);
      thread.interrupt();
      Thread.sleep(5000);
    } catch (InterruptedException ex) {
    }

    System.out.println("Main thread finished");
  }
}
