package my.java.basic.numbersStringsCollections;

import java.util.*;

/**
 * Created by henry.jonathan on 11/21/2017
 */
public class Collections {
  public static void main(String[] args) {
    List<Integer> integers = new ArrayList<>(10);
    for (int i = 0; i < 5; i++) {
      integers.add(Integer.valueOf(i));
    }
    System.out.println(integers.get(3));
    System.out.println(integers.size());

    Set<String> sets = new HashSet<>();
    sets.add("asd");
    sets.add("asd");
    System.out.println(sets.size());

    Map<Integer, String> maps = new HashMap<>();
    maps.put(Integer.valueOf(1), "one");
    maps.put(Integer.valueOf(2), "two");
    maps.put(Integer.valueOf(3), "three");
    System.out.println(maps.get(Integer.valueOf(2)));
  }
}
