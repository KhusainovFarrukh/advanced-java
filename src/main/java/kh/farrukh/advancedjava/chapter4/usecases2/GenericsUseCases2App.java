package kh.farrukh.advancedjava.chapter4.usecases2;

public class GenericsUseCases2App {

  /*
  Without generics, we are forced to create some intermediate abstract class/interface that implements both interfaces/classes.
  This is not a good solution because it creates a lot of boilerplate code.
   */
  private static void feed(LoggedAnimal animal) {
    animal.eat();
    animal.log();
  }

  public static void main(String[] args) {
    var cat = new LoggedCat();
    feed(cat);
  }

}
