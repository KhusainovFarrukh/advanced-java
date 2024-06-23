package kh.farrukh.advancedjava.chapter1.defaultconstructor;

public class DefaultConstructorClass {

  private final String name;

  public DefaultConstructorClass() {
    this.name = "Default";
  }

  public DefaultConstructorClass(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "DefaultConstructorClass{" +
        "name='" + name + '\'' +
        '}';
  }

}
