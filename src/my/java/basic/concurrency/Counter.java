package my.java.basic.concurrency;

/**
 * Created by henry.jonathan on 11/21/2017
 */
public class Counter {
  private int counter = 0;

  public void increment() {
    counter++;
  }

  public void printValue() {
    System.out.println(counter);
  }
}
