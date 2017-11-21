package my.java.basic.numbersStringsCollections;

/**
 * Created by henry.jonathan on 11/21/2017
 */
public class Strings {

  public static void main(String[] args) {
    String firstString = "FIRST";
    char[] chars = {'s', 'e', 'c', 'o', 'n', 'd'};
    String secondString = String.valueOf(chars);

    String concatString1 = firstString + secondString;
    String concatString2 = firstString.toLowerCase().concat(secondString);

    System.out.println(concatString1);
    System.out.println(concatString2);
  }
}
