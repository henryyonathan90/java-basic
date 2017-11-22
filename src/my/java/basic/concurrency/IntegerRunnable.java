package my.java.basic.concurrency;

/**
 * Created by henry.jonathan on 11/21/2017
 */
public class IntegerRunnable implements Runnable {

  private IncrementableInteger integer;

  public IntegerRunnable(IncrementableInteger integer) {
    this.integer = integer;
  }

  @Override
  public void run() {
    for (int i = 0; i < 100000; i++) {
      integer.increment();
    }
  }
}
