package my.java.basic.classesAndObjects.practice;

/**
 * Created by henry.jonathan on 11/22/2017
 */
public enum Day {
  MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

  private int value;

  Day(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }
}
