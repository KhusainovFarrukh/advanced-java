package kh.farrukh.advancedjava.chapter2.equalitycheck;

import java.time.LocalDate;

public class EqualityCheckApp {

  public static void main(String[] args) {
    var date1 = LocalDate.of(2021, 1, 1);
    var date2 = LocalDate.of(2021, 1, 1);

    /*
    date1 == date2: false
    date1.equals(date2): true

    date1 and date2 are two different objects.
    But they have the same year, month, and day.
    So the equals method of LocalDate class is overridden to compare the year, month, and day of the two objects.
    That's why date1.equals(date2) returns true.
    == operator compares the references of the two objects.
    That's why date1 == date2 returns false.
     */
    System.out.println("date1 == date2: " + (date1 == date2));
    System.out.println("date1.equals(date2): " + date1.equals(date2));
  }

}
