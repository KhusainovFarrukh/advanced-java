package kh.farrukh.advancedjava.chapter3.interfaces;

public class SomeBusinessClass {

  public void doSomething(SomeFunctionalInterface functionalInterface) {
    System.out.println("Doing something with: " + functionalInterface.getClass());
    functionalInterface.printSomething();
  }

}
