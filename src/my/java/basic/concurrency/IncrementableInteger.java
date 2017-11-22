package my.java.basic.concurrency;

/**
 * Created by henry.jonathan on 11/21/2017
 */
public class IncrementableInteger {
  private int number = 0;

  public void increment() {
    number += 1;
  }

  public void printValue() {
    System.out.println(number);
  }
}
