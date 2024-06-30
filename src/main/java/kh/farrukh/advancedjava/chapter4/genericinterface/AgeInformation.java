package kh.farrukh.advancedjava.chapter4.genericinterface;

import java.time.LocalDate;

public class AgeInformation implements Informative<LocalDate, String> {

  @Override
  public String getInfo(LocalDate birthDate) {
    var age = LocalDate.now().getYear() - birthDate.getYear();
    return "Age is " + age;
  }

}
