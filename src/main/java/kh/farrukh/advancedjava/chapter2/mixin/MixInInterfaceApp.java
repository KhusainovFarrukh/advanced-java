package kh.farrukh.advancedjava.chapter2.mixin;

public class MixInInterfaceApp {

  public static void main(String[] args) {
    Bicycle bicycle = new Bicycle();
    bicycle.setPassengersCount(2);
    bicycle.start();
  }

}
