package kh.farrukh.advancedjava.chapter1.di;

public class DIApp {

  public static void main(String[] args) {
    var wheel = new Wheel("Michelin");
    var car = new Car(wheel);
    System.out.println(car);
  }

}
