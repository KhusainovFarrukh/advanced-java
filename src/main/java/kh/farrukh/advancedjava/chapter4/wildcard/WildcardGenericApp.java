package kh.farrukh.advancedjava.chapter4.wildcard;

import java.util.ArrayList;
import java.util.Collection;

public class WildcardGenericApp {

  /*
  The wildcard generic type is a generic type that uses a question mark (?) as a placeholder for the type argument.
  This means that the wildcard generic type can represent any type argument.
  The wildcard generic type is useful when you want to write a method that can accept any type of collection.
  There doubleSize() method takes a collection of any type and returns the size of the collection multiplied by 2.
  To achieve this, the method does not need any information about the type of the collection.
  So it uses a wildcard generic type Collection<?> to represent the collection.
   */
  public static int doubleSize(Collection<?> collection) {
    return collection.size() * 2;
  }

  public static void main(String[] args) {
    var collection = new ArrayList<String>();
    collection.add("One");
    collection.add("Two");
    collection.add("Three");
    collection.add("Four");
    collection.add("Five");
    System.out.println("Collection size * 2 = " + doubleSize(collection));
  }

}
