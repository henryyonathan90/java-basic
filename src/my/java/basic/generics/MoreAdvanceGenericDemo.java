package my.java.basic.generics;

/**
 * Created by henry.jonathan on 11/22/2017
 */
public class MoreAdvanceGenericDemo {
  public static void main(String[] args) {
    MoreAdvanceGeneric obj = new MoreAdvanceGeneric();
    String result = obj.method(Integer.valueOf(1), "ASD", Double.valueOf(10.15));
    System.out.println(result);
  }
}
