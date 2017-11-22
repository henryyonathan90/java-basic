package my.java.basic.concurrency;

/**
 * Created by henry.jonathan on 11/21/2017
 */
public class IncrementCounter implements Runnable {

  private Counter counter;

  public IncrementCounter(Counter counter) {
    this.counter = counter;
  }

  @Override
  public void run() {
    for (int i = 0; i < 1000; i++) {
      counter.increment();
    }
  }
}
