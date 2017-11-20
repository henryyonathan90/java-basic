package my.java.basic.languageBasic;

/**
 * Created by henry.jonathan on 11/20/2017
 */
public class ReturnStatement {
  public static void main(String[] args) {
    for (int i = 1; i < 5; i++) {
      if (i == 3) {
        return;
      }
      System.out.println("Count is: " + i);
    }

    System.out.println("I am skipped");
  }
}
