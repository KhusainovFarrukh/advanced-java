package kh.farrukh.advancedjava.chapter4.boundedtypes;

public class Phone extends Device implements Switchable  {

  public Phone() {
    super("Phone");
  }

  @Override
  public void switchOn() {
    System.out.println("Phone is switched on");
  }

}
