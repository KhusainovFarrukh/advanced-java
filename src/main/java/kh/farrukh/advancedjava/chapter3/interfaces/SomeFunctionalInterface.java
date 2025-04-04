package kh.farrukh.advancedjava.chapter3.interfaces;

//FunctionalInterface annotation hints the compiler to verify that the interface contains only one abstract method
@FunctionalInterface
public interface SomeFunctionalInterface {

  //but does not give error for constant fields
  String SOME_CONSTANT = "Some constant";
  Integer SOME_OTHER_CONSTANT = 10;

  void printSomething();

  //FunctionalInterface annotation gives error if the interface has more than one abstract method:
  //Multiple non-overriding abstract methods found in interface kh.farrukh.advancedjava.chapter3.interfaces.SomeFunctionalInterface
//  void printSomethingElse();

  //also does not give error for static methods
  static void printStatic() {
    System.out.println("Static method in functional interface");
  }

}
