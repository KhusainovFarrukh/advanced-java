package kh.farrukh.advancedjava.chapter1.di;

public class Wheel {

  private final String brand;

  public Wheel(String brand) {
    this.brand = brand;
  }

  public String getBrand() {
    return brand;
  }

  @Override
  public String toString() {
    return "Wheel{" +
        "brand='" + brand + '\'' +
        '}';
  }

}
