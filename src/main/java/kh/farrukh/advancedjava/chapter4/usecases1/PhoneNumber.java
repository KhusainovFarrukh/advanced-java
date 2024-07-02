package kh.farrukh.advancedjava.chapter4.usecases1;

import java.util.UUID;

public class PhoneNumber implements Updatable {

  private UUID id;
  private final String number;

  public PhoneNumber(UUID id, String number) {
    this.id = id;
    this.number = number;
  }

  public UUID getId() {
    return id;
  }

  public String getNumber() {
    return number;
  }

  @Override
  public void update() {
    this.id = UUID.randomUUID();
  }
}
