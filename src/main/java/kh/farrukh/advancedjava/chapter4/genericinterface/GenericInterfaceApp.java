package kh.farrukh.advancedjava.chapter4.genericinterface;

import java.time.LocalDate;

public class GenericInterfaceApp {

  public static void main(String[] args) {
    Informative<LocalDate, String> ageInformation = new AgeInformation();
    var birthDate = LocalDate.of(1990, 1, 1);
    var info = ageInformation.getInfo(birthDate);
    System.out.println(info);
  }

}
