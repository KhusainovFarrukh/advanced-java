package kh.farrukh.advancedjava.chapter4.genericinterface;

import java.time.LocalDate;
import java.time.temporal.TemporalAccessor;

public class AgeInformation<T extends TemporalAccessor> implements Informative<T, String> {

  @Override
  public String getInfo(T birthDate) {
    var age = LocalDate.now().getYear() - LocalDate.from(birthDate).getYear();
    return "Age is " + age;
  }

}
