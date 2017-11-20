package my.java.basic.languageBasic;

/**
 * Created by henry.jonathan on 11/20/2017
 */
public class IfElseStatement {
  public static void main(String[] args) {

    boolean condition = true;

    if (condition) {
      System.out.println("Condition=true");
    } else {
      System.out.println("Condition=false");
    }

    int numberBasedOnCondition = condition ? 1 : 0;
    System.out.println(numberBasedOnCondition);
  }
}
