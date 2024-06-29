package kh.farrukh.advancedjava.chapter3.immutability;

import java.util.List;

public class SimpleMutableClass {

  private final String fullName;
  private final List<String> emails;
  private final IDCard idCard;

  public SimpleMutableClass(String fullName, List<String> emails, IDCard idCard) {
    this.fullName = fullName;
    this.emails = emails;
    this.idCard = idCard;
  }

  public String getFullName() {
    return fullName;
  }

  public List<String> getEmails() {
    return emails;
  }

  public IDCard getIdCard() {
    return idCard;
  }

  @Override
  public String toString() {
    return "SimpleMutableClass{" +
        "fullName='" + fullName + '\'' +
        ", emails=" + emails +
        ", idCard=" + idCard +
        '}';
  }
}
