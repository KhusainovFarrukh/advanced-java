package kh.farrukh.advancedjava.chapter1.factory.model;

public class AppleAirPods implements Headphone {

  private final String name;

  public AppleAirPods(String name) {
    this.name = name;
  }

  @Override
  public String getBrand() {
    return "Apple";
  }

  @Override
  public String getName() {
    return name;
  }
}
