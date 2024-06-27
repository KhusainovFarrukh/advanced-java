package kh.farrukh.advancedjava.chapter1.factory;

import kh.farrukh.advancedjava.chapter1.factory.factory.AppleFactory;
import kh.farrukh.advancedjava.chapter1.factory.factory.DeviceFactory;
import kh.farrukh.advancedjava.chapter1.factory.factory.SamsungFactory;

public class FactoryApp {

  public static void main(String[] args) {
//    var phone1 = Phone.create(2000L);
//    System.out.println(phone1.getInfo());
//
//    var phone2 = Phone.create(500L);
//    System.out.println(phone2.getInfo());

    var budget1 = 2000L;
    var factory1 = getFactory(budget1);
    var phone1 = factory1.createPhone();
    System.out.println(phone1.getInfo());
    var headphone1 = factory1.createHeadphone();
    System.out.println(headphone1.getInfo());

    var budget2 = 500L;
    var factory2 = getFactory(budget2);
    var phone2 = factory2.createPhone();
    System.out.println(phone2.getInfo());
    var headphone2 = factory2.createHeadphone();
    System.out.println(headphone2.getInfo());
  }

  private static DeviceFactory getFactory(Long budget) {
    if (budget > 1000L) {
      return new AppleFactory();
    } else {
      return new SamsungFactory();
    }
  }

}
