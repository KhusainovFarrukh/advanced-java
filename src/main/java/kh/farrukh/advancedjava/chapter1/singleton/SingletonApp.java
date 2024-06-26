package kh.farrukh.advancedjava.chapter1.singleton;

public class SingletonApp {

  public static void main(String[] args) {
//    var eagerSingleton = EagerSingleton.getInstance();
//    eagerSingleton.printSingleton();

    new Thread(() -> {
      var naiveSingleton = NaiveSingleton.getInstance();
      naiveSingleton.printSingleton();
    }).start();
    new Thread(() -> {
      var naiveSingleton = NaiveSingleton.getInstance();
      naiveSingleton.printSingleton();
    }).start();

    new Thread(() -> {
      var eagerSingleton = EagerSingleton.getInstance();
      eagerSingleton.printSingleton();
    }).start();
    new Thread(() -> {
      var eagerSingleton = EagerSingleton.getInstance();
      eagerSingleton.printSingleton();
    }).start();

    new Thread(() -> {
      var lazySingleton = LazySingleton.getInstance();
      lazySingleton.printSingleton();
    }).start();
    new Thread(() -> {
      var lazySingleton = LazySingleton.getInstance();
      lazySingleton.printSingleton();
    }).start();
  }

}
