package kh.farrukh.advancedjava.chapter1.factory.model;

public class AppleIphone implements Phone {

  private final String model;

  public AppleIphone(String model) {
    this.model = model;
  }

  @Override
  public String getBrand() {
    return "Apple";
  }

  @Override
  public String getModel() {
    return model;
  }
}
