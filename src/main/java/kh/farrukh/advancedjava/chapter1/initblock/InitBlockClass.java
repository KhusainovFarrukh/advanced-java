package kh.farrukh.advancedjava.chapter1.initblock;

import java.util.UUID;

public class InitBlockClass {

  private String name;
  private UUID uuid;

  /*
  Init block is executed before the constructor.
    It is used to initialize the instance variables.
    It is executed every time an object is created.
    It is executed in the order they appear in the class.
   */
  {
    System.out.println("Init block");
    this.name = "Default";
    this.uuid = UUID.randomUUID();
  }

  {
    System.out.println("Another init block");
  }

  public InitBlockClass() {
    System.out.println("No-arg constructor");
  }

  public InitBlockClass(String name) {
    System.out.println("Arg constructor");
    this.name = name;
    this.uuid = UUID.randomUUID();
  }

  public String getName() {
    return name;
  }

  public UUID getUuid() {
    return uuid;
  }

  @Override
  public String toString() {
    return "InitBlockClass{" +
        "name='" + name + '\'' +
        ", uuid=" + uuid +
        '}';
  }

}
