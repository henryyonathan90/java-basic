package my.java.basic.concurrency;

import java.util.concurrent.*;

/**
 * Created by henry.jonathan on 11/22/2017
 */
public class ExecutorDemo {
  public static void main(String[] args) throws Exception {
    System.out.println(Thread.currentThread().getName() + ": start");

    ExecutorService executorService = Executors.newSingleThreadExecutor();
    Future<String> future = executorService.submit(new MyCallable());

    System.out.println(Thread.currentThread().getName() + ": Waiting for result");
    System.out.println(Thread.currentThread().getName() + ": " + future.get());

    executorService.shutdown();
    System.out.println(Thread.currentThread().getName() + ": finished");
  }
}
