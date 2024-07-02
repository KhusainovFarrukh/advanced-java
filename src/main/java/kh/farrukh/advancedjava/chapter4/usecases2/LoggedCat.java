package kh.farrukh.advancedjava.chapter4.usecases2;

import java.time.LocalDateTime;

public class LoggedCat extends LoggedAnimal {

  @Override
  public void eat() {
    System.out.println("Cat is eating fish");
  }

  @Override
  public void log() {
    System.out.println(LocalDateTime.now() + " : Object CAT (" + hashCode() + ")");
  }

}
