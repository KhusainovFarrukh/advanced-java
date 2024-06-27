package kh.farrukh.advancedjava.chapter1.factory.model;

public interface Phone {

  String getBrand();

  String getModel();

  default String getInfo() {
    return getBrand() + " " + getModel();
  }

//  static Phone create(Long budget) {
//    if (budget < 1000) {
//      return new SamsungGalaxy("Galaxy S21");
//    } else {
//      return new AppleIphone("IPhone 14");
//    }
//  }

}
