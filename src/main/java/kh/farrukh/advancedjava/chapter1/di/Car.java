package kh.farrukh.advancedjava.chapter1.di;

public class Car {

  /*
  The Wheel object is created inside the Car class.
  That means the Car class is responsible for creating the Wheel object.
   */
//  private final Wheel wheel = new Wheel("Michelin");

  private final Wheel wheel;

  /*
  The Wheel object is passed to the Car class through the constructor.
  That means the Car class is not responsible for creating the Wheel object.
  The Wheel object is created outside the Car class and injected into the Car class.
  This is called dependency injection.
   */
  public Car(Wheel wheel) {
    this.wheel = wheel;
  }

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
