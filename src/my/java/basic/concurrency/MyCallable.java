package my.java.basic.concurrency;

import java.util.concurrent.Callable;

/**
 * Created by henry.jonathan on 11/22/2017
 */
public class MyCallable implements Callable<String> {

  @Override
  public String call() throws Exception {
    System.out.println(Thread.currentThread().getName() + ": start");

    try {
      Thread.sleep(5000);
    } catch (Exception ex) {
    }

    System.out.println(Thread.currentThread().getName() + ": finished");
    return "String from callable";
  }
}
