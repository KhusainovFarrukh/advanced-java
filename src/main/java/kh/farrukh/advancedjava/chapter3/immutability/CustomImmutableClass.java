package kh.farrukh.advancedjava.chapter3.immutability;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomImmutableClass {

  private final String fullName;
  private final List<String> emails;
  private final IDCard idCard;

  public CustomImmutableClass(String fullName, List<String> emails, IDCard idCard) {
    this.fullName = fullName;
    this.emails = new ArrayList<>(emails);
    this.idCard = new IDCard(idCard.getIdNumber(), idCard.getBirthDate());
  }

  public String getFullName() {
    return fullName;
  }

  public List<String> getEmails() {
    return Collections.unmodifiableList(emails);
  }

  public IDCard getIdCard() {
    return new IDCard(idCard.getIdNumber(), idCard.getBirthDate());
  }

  @Override
  public String toString() {
    return "CustomImmutableClass{" +
        "fullName='" + fullName + '\'' +
        ", emails=" + emails +
        ", idCard=" + idCard +
        '}';
  }
}
