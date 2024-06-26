package kh.farrukh.advancedjava.chapter1.factory.model;

public class SamsungGalaxy implements Phone {

  private final String model;

  public SamsungGalaxy(String model) {
    this.model = model;
  }

  @Override
  public String getBrand() {
    return "Samsung";
  }

  @Override
  public String getModel() {
    return model;
  }
}
