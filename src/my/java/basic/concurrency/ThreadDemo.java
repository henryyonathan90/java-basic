package my.java.basic.concurrency;

/**
 * Created by henry.jonathan on 11/21/2017
 */
public class ThreadDemo {
  public static void main(String[] args) {
    new Thread(new MyRunnable()).start();

    try {
      Thread.sleep(1000);
    } catch (InterruptedException ex) {
    }

    System.out.println("Main method finished");
  }
}
