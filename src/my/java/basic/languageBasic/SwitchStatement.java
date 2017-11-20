package my.java.basic.languageBasic;

/**
 * Created by henry.jonathan on 11/20/2017
 */
public class SwitchStatement {

  public static void main(String[] args) {
    String weekDay = "wednesday";
    int weekDayNumber = 0;

    switch (weekDay.toLowerCase()) {
      case "monday":
        weekDayNumber = 1;
        break;
      case "tuesday":
        weekDayNumber = 2;
        break;
      case "wednesday":
        weekDayNumber = 3;
        break;
      case "thursday":
        weekDayNumber = 4;
        break;
      case "friday":
        weekDayNumber = 5;
        break;
      case "saturday":
        weekDayNumber = 6;
        break;
      case "sunday":
        weekDayNumber = 7;
        break;
      default:
        weekDayNumber = 0;
    }

    System.out.println(weekDayNumber);
  }
}
