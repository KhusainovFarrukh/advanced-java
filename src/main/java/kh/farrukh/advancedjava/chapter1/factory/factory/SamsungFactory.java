package kh.farrukh.advancedjava.chapter1.factory.factory;

import kh.farrukh.advancedjava.chapter1.factory.model.Headphone;
import kh.farrukh.advancedjava.chapter1.factory.model.Phone;
import kh.farrukh.advancedjava.chapter1.factory.model.SamsungGalaxy;
import kh.farrukh.advancedjava.chapter1.factory.model.SamsungGalaxyBuds;

public class SamsungFactory implements DeviceFactory {

  @Override
  public Phone createPhone() {
    return new SamsungGalaxy("Galaxy S21");
  }

  @Override
  public Headphone createHeadphone() {
    return new SamsungGalaxyBuds("Galaxy Buds Pro");
  }
}
