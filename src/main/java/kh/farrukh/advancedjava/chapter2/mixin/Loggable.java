package kh.farrukh.advancedjava.chapter2.mixin;

import java.time.LocalDateTime;

public interface Loggable {

  default void log(String message) {
    System.out.println(LocalDateTime.now() + ": " + message);
  }

}
