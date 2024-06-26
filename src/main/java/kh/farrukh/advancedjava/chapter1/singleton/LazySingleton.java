package kh.farrukh.advancedjava.chapter1.singleton;

public class LazySingleton {

  private static LazySingleton instance;

  private LazySingleton() {
  }

  /*
  This method is thread-safe.
  If two threads call this method at the same time, only one instance will be created.
  Because of the synchronized keyword.
  synchronized keyword is used to make the method thread-safe by preventing multiple threads from accessing it at the same time.
   */
  public static synchronized LazySingleton getInstance() {
    if (instance == null) {
      //some delay to simulate the thread interference
      try {
        Thread.sleep(2000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      instance = new LazySingleton();
    }
    return instance;
  }

  public void printSingleton() {
    System.out.println("LazySingleton: " + this.hashCode());
  }

}
