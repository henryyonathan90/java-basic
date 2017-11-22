package my.java.basic.numbersStringsCollections.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by henry.jonathan on 11/21/2017
 */
public class Practice {
  public static void main(String[] args) {
    //Create a map containing key-value
    // Integer-String of month (ex: 1-January, 2-February)

    //Take each even month and add it to List of string

    Map<Integer, String> months = new HashMap<>();
    months.put(1, "January");
    months.put(2, "February");
    months.put(3, "March");
    months.put(4, "April");
    months.put(5, "May");
    months.put(6, "June");
    months.put(7, "July");
    months.put(8, "August");
    months.put(9, "September");
    months.put(10, "October");
    months.put(11, "November");
    months.put(12, "December");

    List<String> newMonths = new ArrayList<>();

    for (int a = 1; a <= months.size(); a++) {
      if (a % 2 == 0) {
        newMonths.add(months.get(a));
      }
    }
  }
}
