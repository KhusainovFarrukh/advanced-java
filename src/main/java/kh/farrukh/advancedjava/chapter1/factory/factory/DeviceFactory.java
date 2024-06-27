package kh.farrukh.advancedjava.chapter1.factory.factory;

import kh.farrukh.advancedjava.chapter1.factory.model.Headphone;
import kh.farrukh.advancedjava.chapter1.factory.model.Phone;

public interface DeviceFactory {

  Phone createPhone();

  Headphone createHeadphone();

}
