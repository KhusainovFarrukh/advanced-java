package kh.farrukh.advancedjava.chapter3.diamondofdeath;

public interface C extends A {

  @Override
  default void print() {
    System.out.println("Print from C");
  }
}
