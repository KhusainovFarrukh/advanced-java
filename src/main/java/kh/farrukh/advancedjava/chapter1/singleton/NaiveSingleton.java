package kh.farrukh.advancedjava.chapter1.singleton;

public class NaiveSingleton {

  private static NaiveSingleton instance;

  private NaiveSingleton() {
  }

  /*
  This method is not thread-safe.
  If two threads call this method at the same time, two instances will be created.
   */
  public static NaiveSingleton getInstance() {
    if (instance == null) {
      //some delay to simulate the thread interference
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      instance = new NaiveSingleton();
    }
    return instance;
  }

  public void printSingleton() {
    System.out.println("NaiveSingleton: " + this.hashCode());
  }

}
