package kh.farrukh.advancedjava.chapter1.di;

public class Car {

  /*
  The Wheel object is created inside the Car class.
  That means the Car class is responsible for creating the Wheel object.
   */
  private final Wheel wheel = new Wheel("Michelin");

  public Wheel getWheel() {
    return wheel;
  }

  @Override
  public String toString() {
    return "Car{" +
        "wheel=" + wheel +
        '}';
  }

}
