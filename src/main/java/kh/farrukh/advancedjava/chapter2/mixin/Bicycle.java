package kh.farrukh.advancedjava.chapter2.mixin;

/*
Here we are using Mixin pattern to add logging functionality to Bicycle class.
We have created a Loggable interface with default method log() which is used to log messages.
Bicycle class implements Loggable interface but Bicycle is not a logger class.
In other words there is no is-a relationship between Bicycle and Loggable.
But Bicycle class can use log() method to log messages.
This is achieved by using Mixin pattern.
Here logging functionality is mixed into Bicycle class using Loggable interface.
 */
public class Bicycle implements Loggable {

  private Integer passengersCount;

  public void setPassengersCount(Integer passengersCount) {
    if (passengersCount < 0) {
      log("Passengers count can't be negative");
      System.exit(0);
    }

    if (passengersCount > 2) {
      log("Passengers count can't be more than 2");
      System.exit(0);
    }

    log("Setting passengers count to " + passengersCount);
    this.passengersCount = passengersCount;
  }

  public void start() {
    log("Starting with " + passengersCount + " passengers");
  }

}
