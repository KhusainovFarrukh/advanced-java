package kh.farrukh.advancedjava.chapter1.factory;

import kh.farrukh.advancedjava.chapter1.factory.model.Phone;

public class FactoryApp {

  public static void main(String[] args) {
    var phone1 = Phone.create(2000L);
    System.out.println(phone1.getInfo());

    var phone2 = Phone.create(500L);
    System.out.println(phone2.getInfo());
  }

}
