package kh.farrukh.advancedjava.chapter1.singleton;

public class EagerSingleton {

  static {
    //some delay to simulate the thread interference
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
  /*
  An instance of the class is created at the time of class loading.
   */
  private static final EagerSingleton instance = new EagerSingleton();

  /*
  Private constructor to prevent instantiation from other classes.
   */
  private EagerSingleton() {
  }

  /*
  Public method to provide the global point of access.
   */
  public static EagerSingleton getInstance() {
    return instance;
  }

  public void printSingleton() {
    System.out.println("EagerSingleton: " + this.hashCode());
  }

}
