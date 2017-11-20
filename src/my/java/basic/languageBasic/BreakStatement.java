package my.java.basic.languageBasic;

/**
 * Created by henry.jonathan on 11/20/2017
 */
public class BreakStatement {
  public static void main(String[] args) {
    for (int i = 1; i < 5; i++) {
      if (i == 3) {
        break;
      }
      System.out.println("Count is: " + i);
    }
  }
}
