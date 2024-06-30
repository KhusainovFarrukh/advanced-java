package kh.farrukh.advancedjava.chapter4.simplegeneric;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class SimpleGenericApp {

  public static void main(String[] args) {
    AgeInformation<LocalDate> ageInformation1 = new AgeInformation<>();
    var birthDate1 = LocalDate.of(1990, 1, 1);
    var info1 = ageInformation1.getInfo(birthDate1);
    System.out.println(info1);

    AgeInformation<LocalDateTime> ageInformation2 = new AgeInformation<>();
    var birthDate2 = LocalDateTime.of(1990, 1, 1, 9, 10);
    var info2 = ageInformation2.getInfo(birthDate2);
    System.out.println(info2);

    var isLeapYear1 = ageInformation1.map(birthDate1, LocalDate::isLeapYear);
    System.out.println(isLeapYear1);
    var isLeapYear1Static = AgeInformation.mapStatic(birthDate1, LocalDate::isLeapYear);
    System.out.println(isLeapYear1Static);

    var birthDate2LocalDate = ageInformation2.map(birthDate2, LocalDateTime::toLocalDate);
    System.out.println(birthDate2LocalDate);
    var birthDate2LocalDateStatic = AgeInformation.mapStatic(birthDate2, LocalDateTime::toLocalDate);
    System.out.println(birthDate2LocalDateStatic);
  }

}
