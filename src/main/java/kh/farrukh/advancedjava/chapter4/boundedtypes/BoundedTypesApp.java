package kh.farrukh.advancedjava.chapter4.boundedtypes;

public class BoundedTypesApp {

  public static void main(String[] args) {
    var demoMarket = new DemoMarket();
    var phone = new Phone();
    var mobilePhone = demoMarket.startDemo(phone, MobilePhone::new);
    System.out.println("Used mobile phone: " + mobilePhone.hashCode());
  }

}
