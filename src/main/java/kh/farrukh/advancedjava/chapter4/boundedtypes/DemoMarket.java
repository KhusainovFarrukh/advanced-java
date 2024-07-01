package kh.farrukh.advancedjava.chapter4.boundedtypes;

import java.util.function.Supplier;

public class DemoMarket {

  /*
  The extends keyword restricts the type parameter to be a subclass of some other class or to implement one or more interfaces.
  There could be multiple interfaces specified but only single class is allowed.
  The & operator is used to specify multiple bounds.
  It is also possible to use other type parameter as a bound for extends keyword (P extends T).

   */
  public <T extends Device & Switchable, P extends T> P startDemo(T t, Supplier<P> supplier) {
    System.out.println("Device name is: " + t.getName());
    t.switchOn();
    return supplier.get();
  }

}
