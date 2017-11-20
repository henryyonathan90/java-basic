package my.java.basic.languageBasic;

/**
 * Created by henry.jonathan on 11/20/2017
 */
public class ContinueStatement {
  public static void main(String[] args) {
    for (int i = 1; i < 5; i++) {
      if (i == 3) {
        continue;
      }
      System.out.println("Count is: " + i);
    }
  }
}
