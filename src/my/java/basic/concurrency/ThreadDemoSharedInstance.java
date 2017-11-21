package my.java.basic.concurrency;

/**
 * Created by henry.jonathan on 11/21/2017
 */
public class ThreadDemoSharedInstance {
  public static void main(String[] args) {
    IncrementableInteger integer = new IncrementableInteger();
    new Thread(new IntegerRunnable(integer)).start();
    new Thread(new IntegerRunnable(integer)).start();

    try {
      Thread.sleep(1000);
    } catch (InterruptedException ex) {
    }

    integer.printValue();
  }
}
