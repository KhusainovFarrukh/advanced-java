package kh.farrukh.advancedjava.chapter1.factory.model;

public interface Headphone {

  String getBrand();

  String getName();

  default String getInfo() {
    return getBrand() + " " + getName();
  }

}
