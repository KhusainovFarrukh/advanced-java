package kh.farrukh.advancedjava.chapter3.immutability;

import java.time.LocalDate;

public class IDCard {

  private String idNumber;
  private LocalDate birthDate;

  public IDCard(String idNumber, LocalDate birthDate) {
    this.idNumber = idNumber;
    this.birthDate = birthDate;
  }

  public String getIdNumber() {
    return idNumber;
  }

  public void setIdNumber(String idNumber) {
    this.idNumber = idNumber;
  }

  public LocalDate getBirthDate() {
    return LocalDate.from(birthDate);
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  @Override
  public String toString() {
    return "IDCard{" +
        "idNumber='" + idNumber + '\'' +
        ", birthDate=" + birthDate +
        '}';
  }
}
