package kh.farrukh.advancedjava.chapter1.utilityclass;

/*
Mostly utility classes are final.
 */
public final class PrintUtility {

  /*
  Private constructor to prevent instantiation from other classes.
   */
  private PrintUtility() {

  }

  /*
  Public static method to provide the global point of access.
   */
  public static void print(Object obj) {
    var msg = getString(obj);
    System.out.println(msg);
  }

  /*
  Private static method to provide the implementation.
   */
  private static String getString(Object obj) {
    if (obj == null) {
      return "Message is empty";
    }

    return "Message: " + obj;
  }

}
