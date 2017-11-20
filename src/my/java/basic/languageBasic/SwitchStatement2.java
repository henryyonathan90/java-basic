package my.java.basic.languageBasic;

/**
 * Created by henry.jonathan on 11/20/2017
 */
public class SwitchStatement2 {

  public static void main(String[] args) {
    int number = 5;
    int result = 0;

    switch (number) {
      case 5:
        result += 5;
      case 4:
        result += 4;
      case 3:
        result += 3;
      case 2:
        result += 2;
      case 1:
        result += 1;
      default:
        result += 0;
    }

    System.out.println(result);
  }
}
