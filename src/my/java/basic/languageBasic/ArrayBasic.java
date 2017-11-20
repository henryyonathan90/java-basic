package my.java.basic.languageBasic;

/**
 * Created by henry.jonathan on 11/20/2017
 */
public class ArrayBasic {
  public static void main(String[] args) {
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = 1;
    arrayOfInt[1] = 10;
    System.out.println(arrayOfInt[1]);

    String[] arrayOfString = new String[] {"abc", "def", "ghi"};
    System.out.println(arrayOfString[0]);

    int[][] arrayInt2d = new int[][] {{1, 2, 3}, {4, 5, 6}};
    System.out.println(arrayInt2d[1][2]);
  }
}
