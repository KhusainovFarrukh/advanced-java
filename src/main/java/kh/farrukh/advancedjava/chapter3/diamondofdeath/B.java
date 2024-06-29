package kh.farrukh.advancedjava.chapter3.diamondofdeath;

public interface B extends A {

  @Override
  default void print() {
    System.out.println("Print from B");
  }
}
