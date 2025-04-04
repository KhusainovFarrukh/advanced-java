package kh.farrukh.advancedjava.chapter3.interfaces;

public class InterfacesApp {

  public static void main(String[] args) {
    var businessClass = new SomeBusinessClass();
    businessClass.doSomething(() -> System.out.println("Hello from lambda!"));

    businessClass.doSomething(new SomeFunctionalInterface() {
      @Override
      public void printSomething() {
        System.out.println("Hello from anonymous class!");
      }
    });
  }

}
