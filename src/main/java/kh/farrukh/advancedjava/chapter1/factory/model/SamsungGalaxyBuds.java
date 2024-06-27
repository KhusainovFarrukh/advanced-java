package kh.farrukh.advancedjava.chapter1.factory.model;

public class SamsungGalaxyBuds implements Headphone {

  private final String name;

  public SamsungGalaxyBuds(String name) {
    this.name = name;
  }

  @Override
  public String getBrand() {
    return "Samsung";
  }

  @Override
  public String getName() {
    return name;
  }
}
