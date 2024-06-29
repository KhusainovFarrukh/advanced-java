package kh.farrukh.advancedjava.chapter2.clone;

public class Laptop implements Cloneable {

  private String name;
  private Integer year;

  public Laptop(String name, Integer year) {
    this.name = name;
    this.year = year;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return "Laptop{" +
        "name='" + name + '\'' +
        ", year=" + year +
        '}';
  }

  @Override
  public Laptop clone() throws CloneNotSupportedException {
    return (Laptop) super.clone();
  }

}
