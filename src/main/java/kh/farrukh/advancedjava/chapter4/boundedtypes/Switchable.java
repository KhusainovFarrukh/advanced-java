package kh.farrukh.advancedjava.chapter4.boundedtypes;

public interface Switchable {

  void switchOn();

  default void switchOff() {
    System.out.println("Switched off");
  }

}
