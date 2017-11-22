package my.java.basic.concurrency;

/**
 * Created by henry.jonathan on 11/21/2017
 */
public class ThreadDemoSharedInstance {
  public static void main(String[] args) {
    Counter counter = new Counter();

    new Thread(new IncrementCounter(counter)).start();
    new Thread(new IncrementCounter(counter)).start();

    try {
      Thread.sleep(1000);
    } catch (InterruptedException ex) {
    }

    counter.printValue();
  }
}
