package kh.farrukh.advancedjava.chapter4.genericinterfaceclass;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GenericInterfaceClassApp {

  public static void main(String[] args) {
    Informative<LocalDate, String> ageInformation1 = new AgeInformation<>();
    var birthDate1 = LocalDate.of(1990, 1, 1);
    var info1 = ageInformation1.getInfo(birthDate1);
    System.out.println(info1);

    Informative<LocalDateTime, String> ageInformation2 = new AgeInformation<>();
    var birthDate2 = LocalDateTime.of(1990, 1, 1, 9, 10);
    var info2 = ageInformation2.getInfo(birthDate2);
    System.out.println(info2);
  }

}
