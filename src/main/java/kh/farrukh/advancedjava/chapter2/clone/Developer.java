package kh.farrukh.advancedjava.chapter2.clone;

public class Developer implements Cloneable {

  private String stack;
  private Laptop laptop;

  public Developer(String stack, Laptop laptop) {
    this.stack = stack;
    this.laptop = laptop;
  }

  public String getStack() {
    return stack;
  }

  public void setStack(String stack) {
    this.stack = stack;
  }

  public Laptop getLaptop() {
    return laptop;
  }

  public void setLaptop(Laptop laptop) {
    this.laptop = laptop;
  }

  @Override
  public String toString() {
    return "Developer{" +
        "stack='" + stack + '\'' +
        ", laptop=" + laptop +
        '}';
  }

  @Override
  protected Developer clone() throws CloneNotSupportedException {
    return (Developer) super.clone();
  }

}
