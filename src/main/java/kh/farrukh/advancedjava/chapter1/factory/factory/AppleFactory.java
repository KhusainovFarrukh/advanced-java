package kh.farrukh.advancedjava.chapter1.factory.factory;

import kh.farrukh.advancedjava.chapter1.factory.model.AppleAirPods;
import kh.farrukh.advancedjava.chapter1.factory.model.AppleIphone;
import kh.farrukh.advancedjava.chapter1.factory.model.Headphone;
import kh.farrukh.advancedjava.chapter1.factory.model.Phone;

public class AppleFactory implements DeviceFactory {

  @Override
  public Phone createPhone() {
    return new AppleIphone("IPhone 14");
  }

  @Override
  public Headphone createHeadphone() {
    return new AppleAirPods("AirPods Pro");
  }

}
