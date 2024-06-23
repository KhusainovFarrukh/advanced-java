package kh.farrukh.advancedjava.chapter1.defaultconstructor;

public class DefaultConstructorApp {

  public static void main(String[] args) {
    /*
      Even if there is no constructor in the class, the compiler will create a default constructor.
      The default constructor is a no-arg constructor.
      But if you define a constructor in the class, the compiler will not create a default constructor.
     */
//    var defaultConstructorClass = new DefaultConstructorClass();
//    System.out.println(defaultConstructorClass);

    var defaultConstructorClass = new DefaultConstructorClass("Farrukh");
    System.out.println(defaultConstructorClass);
  }

}
