package kh.farrukh.advancedjava.chapter1.singleton;

public class SingletonApp {

  public static void main(String[] args) {
    var eagerSingleton = EagerSingleton.getInstance();
    eagerSingleton.printSingleton();
  }

}
