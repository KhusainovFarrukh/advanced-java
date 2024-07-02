package kh.farrukh.advancedjava.chapter4.usecases2;

import java.time.LocalDateTime;

public class LoggedDog extends Animal implements Loggable {

  @Override
  public void eat() {
    System.out.println("Dog is eating meat");
  }

  @Override
  public void log() {
    System.out.println(LocalDateTime.now() + " : Object DOG (" + hashCode() + ")");
  }

}
